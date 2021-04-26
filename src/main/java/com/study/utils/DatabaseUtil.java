package com.study.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DatabaseUtil {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static Logger LOGGER = LoggerFactory.getLogger(DatabaseUtil.class);


    private static final String SQL = "SELECT * FROM ";// 数据库操作


    /**
     * 获取数据库连接
     *
     * @return
     */
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 关闭数据库连接
     * @param conn
     */
    public void closeConnection(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                LOGGER.error("close connection failure", e);
            }
        }
    }

    /**
     * 获取数据库下的所有表名
     */
    public List<String> getTableNames(String databaseName) throws SQLException {
        List<String> tableNames = new ArrayList<>();
        Connection conn = getConnection();
        ResultSet rs = null;
        try {
            //获取数据库的元数据
            DatabaseMetaData db = conn.getMetaData();
            //从元数据中获取到所有的表名
            rs = db.getTables(databaseName, null, null, new String[] { "TABLE" });
            while(rs.next()) {
                tableNames.add(rs.getString(3));
            }
        } catch (SQLException e) {
            LOGGER.error("getTableNames failure", e);
        } finally {
            try {
                rs.close();
                closeConnection(conn);
            } catch (SQLException e) {
                LOGGER.error("close ResultSet failure", e);
            }
        }
        return tableNames;
    }

    /**
     * 获取表中所有字段名称
     * @param tableName 表名
     * @return
     */
    public List<String> getColumnNames(String tableName) throws SQLException {
        List<String> columnNames = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnNames.add(rsmd.getColumnName(i + 1));
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnNames failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnNames close pstem and connection failure", e);
                }
            }
        }
        return columnNames;
    }

    /**
     * 获取表中所有字段类型
     * @param tableName
     * @return
     */
    public List<String> getColumnTypes(String tableName) throws SQLException {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnTypes.add(rsmd.getColumnTypeName(i + 1));
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnTypes;
    }

    /**
     * 获取表中所有字段长度
     * @param tableName
     * @return
     */
    public List<Integer> getColumnLen(String tableName) throws SQLException {
        List<Integer> columnLens = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnLens.add(rsmd.getColumnDisplaySize(i + 1));
                int columnType = rsmd.getScale(i+1);
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnLens;
    }

    /**
     * 获取表中所有字段小数点长度
     * @param tableName
     * @return
     */
    public List<Integer> getColumnScale(String tableName) throws SQLException {
        List<Integer> columnScales = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnScales.add(rsmd.getScale(i+1));
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnScales;
    }

    /**
     * 获取表中所有字段小数点长度
     * @param tableName
     * @return
     */
    public List<String> getColumnRequried(String tableName) throws SQLException {
        List<String> columnRequrieds = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnRequrieds.add(rsmd.isNullable(i+1) != 1 ? "Y" : "N");
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnRequrieds;
    }

    /**
     * 获取表中字段的所有注释
     * @param tableName
     * @return
     */
    public List<String> getColumnComments(String tableName) throws SQLException {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        List<String> columnComments = new ArrayList<>();//列名注释集合
        ResultSet rs = null;
        try {
            pStemt = conn.prepareStatement(tableSql);
            rs = pStemt.executeQuery("show full columns from " + tableName);
            while (rs.next()) {
                columnComments.add(rs.getString("Comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    closeConnection(conn);
                } catch (SQLException e) {
                    LOGGER.error("getColumnComments close ResultSet and connection failure", e);
                }
            }
        }
        return columnComments;
    }

    public Map<String, List<ColumnMetaData>> getAllMap(String databaseName) throws SQLException {
        Map<String, List<ColumnMetaData>> result = new HashMap<>();
        List<String> tableNames = getTableNames(databaseName);
        System.out.println("tableNames:" + tableNames);
        for (String tableName : tableNames) {
            List<String> columnNames = getColumnNames(tableName);
            List<String> columnTypes = getColumnTypes(tableName);
            List<String> columnComments = getColumnComments(tableName);
            List<Integer> columnLens = getColumnLen(tableName);
            List<Integer> columnScales = getColumnScale(tableName);
            List<String> columnRequrieds = getColumnRequried(tableName);
            List<ColumnMetaData> columnMetaDataList = new ArrayList<>();
            for (int i = 0; i < columnNames.size(); i++) {
                ColumnMetaData columnMetaData = new ColumnMetaData(columnNames.get(i), columnTypes.get(i), columnLens.get(i), null, columnScales.get(i), columnComments.get(i), columnRequrieds.get(i));
                columnMetaDataList.add(columnMetaData);
            }
            result.put(tableName, columnMetaDataList);
        }
        return result;
    }

    public List<ColumnMetaData> getColData(String tableName) throws SQLException {
        List<String> columnNames = getColumnNames(tableName);
        List<String> columnTypes = getColumnTypes(tableName);
        List<String> columnComments = getColumnComments(tableName);
        List<Integer> columnLens = getColumnLen(tableName);
        List<Integer> columnScales = getColumnScale(tableName);
        List<String> columnRequrieds = getColumnRequried(tableName);
        List<ColumnMetaData> result = new ArrayList<>();
        for (int i = 0; i < columnNames.size(); i++) {
            ColumnMetaData columnMetaData = new ColumnMetaData(columnNames.get(i), columnTypes.get(i), columnLens.get(i), null, columnScales.get(i), columnComments.get(i), columnRequrieds.get(i));
            result.add(columnMetaData);
        }
        return result;
    }

    public String getTableComment(String tableName) {
        Map<String, Object> map = jdbcTemplate.queryForMap("SHOW TABLE STATUS WHERE Name=?", tableName);
        if (map.isEmpty()) {
            return null;
        }
        String comment = String.valueOf(map.get("Comment"));
        comment = StringUtils.isBlank(comment) ? null : comment;
        return comment;
    }

}