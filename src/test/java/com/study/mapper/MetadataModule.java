package com.study.mapper;

import com.study.entity.*;
import com.study.utils.ColumnMetaData;
import com.study.utils.DatabaseUtil;
import com.study.utils.medadata.Be;
import com.study.utils.medadata.Bm;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.CollectionUtils;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Classname PageModule
 * @Description
 * @Date 2021/4/22 12:12
 * @Created by helinhai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MetadataModule {
  @Autowired
  private DatabaseUtil databaseUtil;

  @Autowired
  private TzBusentityMapper tzBusentityMapper;
  @Autowired
  private TzFieldMapper tzFieldMapper;
  @Autowired
  private TzJoinMapper tzJoinMapper;
  @Autowired
  private TzJoinSpecMapper tzJoinSpecMapper;

  @Autowired
  private TzBusmoduleMapper tzBusmoduleMapper;
  @Autowired
  private TzBmentityMapper tzBmentityMapper;
  @Autowired
  private TzLinkMapper tzLinkMapper;

  @Autowired
  private TzMenuTreeMapper tzMenuTreeMapper;
  @Autowired
  private TzMenuNodeMapper TzMenuNodeMapper;
  @Autowired
  private TzComponentMapper tzComponentMapper;

  @Autowired
  private TzPermissionGroupMapper tzPermissionGroupMapper;
  @Autowired
  private TzPermissionMapper tzPermissionMapper;

  @Autowired
  private DataSourceTransactionManager transactionManager;

  String admin = "ADMIN0000000000001";
  Date date = new Date();
  Integer idNum = 18;

  private String beIdPre = "cmsBE000000000";
  private String fieldIdPre = "cmsField000000";
  private String joinIdPre = "cmsJoin0000000";
  private String joinSpecIdPre = "cmsSpec0000000";

  private String bmIdPre = "cmspageCont000";
  private String linkIdPre = "cmspageCont000";

  private Integer beIdA = 1;
  private Integer fieldIdA = 1;
  private Integer joinIdA = 1;
  private Integer joinSpecIdA = 1;

  private Integer bmIdA = 1;
  private Integer linkIdA = 1;

  private String module = "POC";
  private Bm bm = new Bm(null, "TZStudent");
  private List<Be> beList = new ArrayList<Be>() {{
    add(new Be() {{
      setBeName("TZStudent");
      setEntityClass(TzStudent.class);
      setTableName("TZ_STUDENT");
      setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
      setZBeList(new ArrayList<Be>() {{
        add(new Be() {{
          setBeName("TZIdcard");
          setEntityClass(TzIdcard.class);
          setTableName("TZ_IDCARD");
          setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
        }});
        add(new Be() {{
          setBeName("TZCourse");
          setEntityClass(TzCourseInst.class);
          setTableName("TZ_COURSE_INST");
          setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
        }});
      }});
    }});
  }};


  /**
   * 根据be名称添加ListAdmin展示框架和展示框架元素
   */
  @Test
  public void createPageList() {
    String bmName = "TZClass";

    String detailComponentId = "534420627126358027";

    String listDispId = "cmsDispFrame000002";
    String detailDispId = "cmsDispFrame000001";
    List<String> detailListIds = Arrays.asList("152458540154882");


    DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
    def.setName("copyFieldToDisplayFrame");
    TransactionStatus status = transactionManager.getTransaction(def);
    try {

      addBe(beList);

      addFieldJoin(beList);

      transactionManager.commit(status);
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
  }

  private void addFieldJoin(List<Be> beList) throws SQLException {
    for (Be be : beList) {
      List<ColumnMetaData> colDataList = databaseUtil.getColData(be.getTableName());
      for (ColumnMetaData coldata : colDataList) {
        if (StringUtils.equalsAny(coldata.getColName(), "MODIFICATION_NUM", "CREATED_BY", "CREATED", "LAST_UPD_BY", "LAST_UPD")) {
          continue;
        }
        String fieldName = getFieldName(coldata.getColName(), be);
        TzField tzField = new TzField(nextFieldId(), fieldName, be.getBeId(), null, coldata.getColName(), null, null, null, null, null, null, null, "N", "Y"
          , null, 1, admin, date, admin, date, null, null, null);
        String type = getColType(coldata);
        tzField.setDataType(type);
        tzField.setTextlen(coldata.getTextLen());
        tzField.setPrecNum(coldata.getNumberLen());
        tzField.setScale(coldata.getScaleLen());
        tzField.setRequired(getColRequired(coldata));
        tzField.setControlType(getControlType(coldata));
        int flag = tzFieldMapper.insertSelective(tzField);
        if (flag != 1){
          throw new RuntimeException("Field" + fieldName + "字段添加失败");
        }
      }
      fieldIdA += 100;
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addFieldJoin(be.getZBeList());
      }
    }
  }

  private String getControlType(ColumnMetaData coldata) {
    switch (coldata.getColType()) {
      case "TINYINT":
      case "SMALLINT":
      case "MEDIUMINT":
      case "INT":
      case "INTEGER":
        return "number";
      case "BIGINT":
        return "number";
      case "DOUBLE":
      case "DECIMAL":
        return "number";
      case "DATE":
        return "date";
      case "TIME":
        return "time";
      case "DATETIME":
      case "TIMESTAMP":
        return "datetime";
      default:
        return "string";
    }
  }

  private String getColRequired(ColumnMetaData coldata) {
    return coldata.getRequired();
  }

  private String getColType(ColumnMetaData coldata) {
    switch (coldata.getColType()) {
      case "TINYINT":
      case "SMALLINT":
      case "MEDIUMINT":
      case "INT":
      case "INTEGER":
        if (coldata.getTextLen() == 0) {
          throw new RuntimeException("字段" + coldata.getColName() + "数值长度为0");
        }
        coldata.setNumberLen(coldata.getTextLen());
        return "Number";
      case "BIGINT":
        if (coldata.getTextLen() == 0) {
          throw new RuntimeException("字段" + coldata.getColName() + "Long长度为0");
        }
        coldata.setNumberLen(coldata.getTextLen());
        return "Long";
      case "DOUBLE":
      case "DECIMAL":
        if (coldata.getTextLen() == 0) {
          throw new RuntimeException("字段" + coldata.getColName() + "Double长度为0");
        }
        coldata.setNumberLen(coldata.getTextLen());
        return "Number";
      case "DATE":
        return "Date";
      case "TIME":
        return "Time";
      case "DATETIME":
      case "TIMESTAMP":
        return "DateTime";
      case "CHAR":
        return "Character";
      default:
        return "Varchar";
    }
  }

  private String getFieldName(String colName, Be be) {
    Class entityClass = be.getEntityClass();
    Field[] declaredFields = entityClass.getDeclaredFields();
    String fieldName = Arrays.stream(declaredFields).filter(field -> {
      field.setAccessible(true);
      return StringUtils.equals(colName, field.getAnnotation(Column.class).name());
    }).map(Field::getName).collect(Collectors.toList()).get(0);
    return fieldName.replace(String.valueOf(fieldName.charAt(0)), StringUtils.upperCase(String.valueOf(fieldName.charAt(0))));
  }

  private void addBe(List<Be> beList) {
    for (Be be : beList) {
      be.setBeId(nextBeId());
      if (StringUtils.isBlank(be.getClassName())) {
        be.setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
      }
      TzBusentity tzBusentity = new TzBusentity(be.getBeId(), be.getBeName(), be.getClassName(), be.getTableName(), null, null, null, null, module, "Y", null, 1, admin, date, admin, date);
      int insert = tzBusentityMapper.insert(tzBusentity);
      if (insert != 1) {
        throw new RuntimeException(be.getBeName() + "，BE插入失败");
      }
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addBe(be.getZBeList());
      }
    }
  }


  private String nextBeId() {
    return beIdPre + String.format("%0" + (idNum-beIdPre.length()) + "d", beIdA++);
  }
  private String nextFieldId() {
    return fieldIdPre + String.format("%0" + (idNum-fieldIdPre.length()) + "d", fieldIdA++);
  }
  private String nextJoinId() {
    return joinIdPre + String.format("%0" + (idNum-joinIdPre.length()) + "d", joinIdA++);
  }
  private String nextJoinSpecId() {
    return joinSpecIdPre + String.format("%0" + (idNum-joinSpecIdPre.length()) + "d", joinSpecIdA++);
  }
  private String nextBmId() {
    return bmIdPre + String.format("%0" + (idNum-bmIdPre.length()) + "d", bmIdA++);
  }
  private String nextLinkId() {
    return linkIdPre + String.format("%0" + (idNum-linkIdPre.length()) + "d", linkIdA++);
  }

  @Test
  public void testDatabaseUtils() throws SQLException {
    Map<String, List<ColumnMetaData>> map = databaseUtil.getAllMap("oasisdev");
    System.out.println(map);
  }

}
