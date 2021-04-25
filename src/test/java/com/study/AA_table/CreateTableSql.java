package com.study.AA_table;

import com.study.utils.table.Column;
import com.study.utils.table.Table;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/24 11:46
 */
public class CreateTableSql {

    // 开始的sheet，下标从0开始
    private int startSheet = 0;
    private File srcFile = new File("D:\\tranzversion_ideaProject\\new-java-product\\基础框架设计开发\\CMS和活动\\CMS和活动数据字典.xlsx");

    // 是否自定义路径
    private boolean fileFlag = false;
    private String descFilePath = "D:/桌面/";
    private String fileName = "cms-schema.sql";


    @Test
    public void getCreateTableSqlFromExcel() {
        try (Workbook workbook = new XSSFWorkbook(srcFile)) {
            List<Table> tableList = getCreateTableData(workbook);
//            System.out.println(tableList);
            createSqlFile(tableList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createSqlFile(List<Table> tableList) throws IOException {
        if (StringUtils.isBlank(fileName))
            fileName = srcFile.getName().substring(0, srcFile.getName().indexOf(".")) + ".sql";
        File sqlFile = null;
        if (fileFlag) {
            sqlFile = new File(descFilePath + fileName);
        } else {
            sqlFile = new File("src/test/java/com/study/AA_table/tablesql/" + fileName);
        }

        if (sqlFile.exists()) {
            sqlFile.delete();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(sqlFile, true))) {
            for (Table table : tableList) {
                bw.write("-- " + table.getTableName());
                bw.newLine();
                bw.write("DROP TABLE IF EXISTS " + table.getTableName() + ";");
                bw.newLine();
                bw.write("CREATE TABLE " + table.getTableName() + " (");
                bw.newLine();

                List<Column> columnList = table.getColumnList();
                for (Column column : columnList) {
                    String colName = column.getColName();
                    String colType = column.getColType();
                    if (StringUtils.isNotBlank(colType)) {
//                        colType = " " + colType.toUpperCase();
                        colType = " " + colType;
                    }
                    String required = StringUtils.equalsAny(column.getCanNull(), "N", "n") ? " NOT NULL" : "";
                    String defaultVal = "";
                    if (StringUtils.isNotBlank(column.getDefaultVal())) {
                        String value = column.getDefaultVal();
                        if (colType.toUpperCase().contains("CHAR") || colType.toUpperCase().contains("TEXT")) {
                            value = "'" + value +"'";
                        }
                        defaultVal = " DEFAULT " + value;
                    } else {
                        if (StringUtils.isBlank(required))
                            defaultVal = " DEFAULT NULL";
                    }
                    String comment = "";
                    if (StringUtils.isNotBlank(column.getColComment())) {
                        comment += " COMMENT '" + column.getColComment();
                        if (StringUtils.isNotBlank(column.getColCommentDesc())) {
                            comment += "," + column.getColCommentDesc() + "'";
                        } else {
                            comment += "'";
                        }
                    }
                    if (comment.contains("无符号")) {
                        colType += " unsigned";
                    }
                    if (colType.toUpperCase().contains("CHAR") || colType.toUpperCase().contains("TEXT")) {
                        if (comment.contains("纯字母") || (comment.contains("英文字母") && !(comment.contains("数字")))) {
                            colType += " CHARACTER SET ascii COLLATE ascii_general_ci";
                        } else {
                            colType += " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci";
                        }
                    }

                    String colKey = column.getColKey();
                    if (StringUtils.equals(colKey, "PRI")) {
                        bw.write("  `" + colName + "`" + colType + required + " PRIMARY KEY" + comment + ",");
                        bw.newLine();
                    } else {
                        String unique = "";
                        if (comment.contains("唯一")) {
                            unique += " UNIQUE";
                        }
                        bw.write("  `" + colName + "`" + colType + required + unique + defaultVal + comment + ",");
                        bw.newLine();
                    }
                }

                bw.write("  `MODIFICATION_NUM` int NOT NULL DEFAULT '0' COMMENT '修改记录号',");
                bw.newLine();
                bw.write("  `CREATED_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '创建人',");
                bw.newLine();
                bw.write("  `CREATED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',");
                bw.newLine();
                bw.write("  `LAST_UPD_BY` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'ADMIN0000000000001' COMMENT '更新人',");
                bw.newLine();
                bw.write("  `LAST_UPD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'");
                bw.newLine();
                bw.write(") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='" + table.getTableComment() + "';");
                bw.newLine();
                bw.newLine();
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Table> getCreateTableData(Workbook workbook) {
        List<Table> result = new ArrayList<>();
        int num = workbook.getNumberOfSheets();
        for (int i = startSheet; i < num; i++) {
            Sheet sheet = workbook.getSheetAt(i);
            // 获取表格数据
            String tableComment = sheet.getSheetName();
            if (StringUtils.equals(tableComment, "目录")) continue;
            Row oneRow = sheet.getRow(0);
            if (oneRow == null) {
                continue;
            }
            Cell cell = oneRow.getCell(0);
            if (cell == null) {
                continue;
            }
            String tableName = cell.getStringCellValue();
            Table table = new Table(tableName, tableComment, null);

            // 获取列
            int firstRowNum = sheet.getFirstRowNum();
            int lastRowNum = sheet.getLastRowNum();
            List<Column> columnList = new ArrayList<>();
            for (int j = 2; j <= lastRowNum; j++) {
                Row row = sheet.getRow(j);
                String colName = getCellValue(row.getCell(0));
                if (StringUtils.isBlank(colName) || StringUtils.equalsAny(colName, "MODIFICATION_NUM", "CREATED_BY", "CREATED", "LAST_UPD_BY", "LAST_UPD")) {
                    continue;
                }
                String colType = getCellValue(row.getCell(1));
                String canNull = getCellValue(row.getCell(2));
                String key = getCellValue(row.getCell(3));
                String defaultVal = getCellValue(row.getCell(4));
                String comment = getCellValue(row.getCell(5));
                String commentDesc = getCellValue(row.getCell(6));
                Column column = new Column(
                        StringUtils.isBlank(colName) ? "": colName.replace(" ", ""),
                        StringUtils.isBlank(colType) ? "": colType.replace(" ", ""),
                        StringUtils.isBlank(canNull) ? "": canNull.replace(" ", ""),
                        StringUtils.isBlank(key) ? "": key.replace(" ", ""),
                        StringUtils.isBlank(defaultVal) ? "": defaultVal.replace(" ", ""),
                        StringUtils.isBlank(comment) ? "": comment.replace(" ", ""),
                        StringUtils.isBlank(commentDesc) ? "": commentDesc.replace(" ", ""));
                columnList.add(column);
            }
            table.setColumnList(columnList);
            result.add(table);
        }
        return result;
    }

    private static String getCellValue(Cell cell) {
        String result = null;
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    result = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        Date theDate = cell.getDateCellValue();
                        result = String.valueOf(theDate.getTime());
                    }else{
                        DecimalFormat df = new DecimalFormat("0");
                        result = df.format(cell.getNumericCellValue());
                    }
                    break;
//                case BOOLEAN:
//                    result = cell.getBooleanCellValue();
//                    break;
                case FORMULA:
                    result = cell.getCellFormula();
                    break;
//                case ERROR:
//                    result = cell.getErrorCellValue();
//                    break;
                case BLANK:
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    @Test
    public void test(){
        File file = new File("src/test/java/com/study/AA_table");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println();
    }

}
