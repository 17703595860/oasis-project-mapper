package com.study.教育基线.orgBu;

import com.study.entity.*;
import com.study.mapper.*;
import com.study.utils.ColumnMetaData;
import com.study.utils.DatabaseUtil;
import com.study.utils.medadata.*;
import lombok.SneakyThrows;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 根据一些参数
 *  生成 元数据 消息集合 权限 prompt filter
 *  不生成 转换值，需要提前插入
 *  不生成菜单，需要自己插入
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
  private TzMessageCollectionMapper tzMessageCollectionMapper;
  @Autowired
  private TzMessageInfoMapper tzMessageInfoMapper;

  @Autowired
  private TzPermissionGroupMapper tzPermissionGroupMapper;
  @Autowired
  private TzPermissionMapper tzPermissionMapper;

  @Autowired
  private TzPtDefMapper tzPtDefMapper;
  @Autowired
  private TzPtFieldDefMapper tzPtFieldDefMapper;

  @Autowired
  private TzFilterDfnMapper tzFilterDfnMapper;
  @Autowired
  private TzFilterFldMapper tzFilterFldMapper;
  @Autowired
  private TzFilterfldOperatorMapper tzFilterfldOperatorMapper;

  @Autowired
  private DataSourceTransactionManager transactionManager;

  String admin = "ADMIN0000000000001";
  Date date = new Date();
  Integer idNum = 18;

  // 最长10个，保持有空隙
  private String module = "orgBu";
  private String moduleDesc = "orgBu部门模块";

  private String messageIdPre = module + "Msg000";
  private String messageInfIdPre = module + "MsgInf000";

  private Integer messageIdA = 1;
  private Integer messageInfIdA = 1;

  private List<String> msgColIdInsertList = new ArrayList<>();
  private List<String> msgInfIdInsertList = new ArrayList<>();

  // 是否自定义路径
  private boolean fileFlag = false;
  private String descFilePath = "D:/桌面/sql/";
  private boolean transactionCommit = false;

  private List<Be> beList = new ArrayList<Be>() {{
    add(new Be() {{
      setBeName("TZOrgBu");
      setEntityClass(TzOrgBu.class);
      setTableName("TZ_ORG_BU");
    }});
  }};


  /**
   * 根据be名称添加ListAdmin展示框架和展示框架元素
   */
  @Test
  public void addMetadata() {

    if (fileFlag) {
      if (!new File(descFilePath).exists()) {
        throw new RuntimeException("sql输入目录不存在");
      }
    }

    DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
    def.setName("copyFieldToDisplayFrame");
    TransactionStatus status = transactionManager.getTransaction(def);
    try {


      addMessage();

      addFileSql();

      if (transactionCommit) {
        transactionManager.commit(status);
      } else {
        transactionManager.rollback(status);
      }
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
  }

  private void addFileSql() {
    String srcFilePath = null;
    if (fileFlag) {
      srcFilePath = descFilePath;
    }else {
      srcFilePath = "src/test/java/com/study/AA_sql/" + module + "/";
      new File(srcFilePath).mkdirs();
    }
    addMessageSql(srcFilePath);
  }

  private void addMessageSql(String srcFilePath) {
    String filePath = srcFilePath + "09-MESSAGE.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      String msgColIdStr = StringUtils.join(msgColIdInsertList.stream().map(e -> "'" + e +"'").collect(Collectors.toList()), ", ");
      bw.write("delete from TZ_MESSAGE_INFO where COLLECTION_ID in (" + msgColIdStr + ");");
      bw.newLine();
      bw.write("delete from TZ_MESSAGE_COLLECTION where ID in (" + msgColIdStr + ");");
      bw.newLine();bw.newLine();
      // 添加msgCol
      List<TzMessageCollection> msgColList = tzMessageCollectionMapper.selectByIds(StringUtils.join(msgColIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = msgColList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_MESSAGE_COLLECTION", bw);
      // 添加msgInf
      List<TzMessageInfo> msgInfList = tzMessageInfoMapper.selectByIds(StringUtils.join(msgInfIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = msgInfList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_MESSAGE_INFO", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @SneakyThrows
  private void createSql(List<Map<String, List<String>>> objList, String tableName, BufferedWriter bw) {
    if (CollectionUtils.isEmpty(objList)) {
      return;
    }
    bw.write("INSERT INTO `" + tableName + "`(" + StringUtils.join(objList.get(0).get("col"), ", ") + ") VALUES");
    bw.newLine();
    for (int i = 0; i < objList.size(); i++) {
      if (i == objList.size() - 1) {
        bw.write("  (" + StringUtils.join(objList.get(i).get("val"), ", ") + ")");
      } else {
        bw.write("  (" + StringUtils.join(objList.get(i).get("val"), ", ") + "),");
      }
      bw.newLine();
    }
    bw.write(";");
    bw.newLine();bw.newLine();
  }

  @SneakyThrows
  private Map<String, List<String>> getColAndVal(Object obj) {
    ArrayList<String> colList = new ArrayList<>();
    ArrayList<String> valList = new ArrayList<>();
    Class<?> zClass = obj.getClass();
    Field[] fields = zClass.getDeclaredFields();
    for (Field field : fields) {
      field.setAccessible(true);
      String name = field.getName();
      if (StringUtils.equalsAny(name, "createdBy", "created", "lastUpdBy", "lastUpd")) {
        continue;
      }
      String colName = field.getAnnotation(Column.class).name();
      String valStr = null;
      Object valObj = field.get(obj);
      if (valObj == null) {
        valStr = "null";
      } else {
        valStr = valObj.toString();
        if (Date.class.isAssignableFrom(field.getType())) {
          throw new RuntimeException("有日期时间类型");
        }
        if (String.class.isAssignableFrom(field.getType())) {
          valStr = "'" + valStr + "'";
        }
      }
      colList.add("`" + colName + "`");
      valList.add(valStr);
    }
    Map<String, List<String>> result = new HashMap<String, List<String>>() {{
      put("col", colList);
      put("val", valList);
    }};
    return result;
  }


  private void addMessage() throws SQLException {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    for (Be be : tempBelist) {
      TzMessageCollection tzMessageCollection = new TzMessageCollection(nextMessageId(), be.getBeName(), be.getBeName(), "Y", 1, admin, date, admin, date);
      tzMessageCollectionMapper.insertSelective(tzMessageCollection);

//      TzBusentity tzBusentity = tzBusentityMapper.selectByPrimaryKey(be.getBeId());
//      tzBusentity.setMsgCollectionId(tzMessageCollection.getId());
//      tzBusentityMapper.updateByPrimaryKeySelective(tzBusentity);

      // be消息集合
      TzMessageInfo tzMessageInfo11 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", be.getBeName(), be.getBeName() + "." + be.getBeName(), databaseUtil.getTableComment(be.getTableName()), "Y", 1, admin, date, admin, date);
      TzMessageInfo tzMessageInfo22 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", be.getBeName(), be.getBeName() + "." + be.getBeName(), databaseUtil.getTableComment(be.getTableName()), "Y", 1, admin, date, admin, date);
      tzMessageInfoMapper.insertSelective(tzMessageInfo11);
      tzMessageInfoMapper.insertSelective(tzMessageInfo22);

      List<ColumnMetaData> colData = databaseUtil.getColData(be.getTableName());
      Map<String, ColumnMetaData> fieldColData = getFieldMapColData(be, colData);
      for (Map.Entry<String, ColumnMetaData> entry : fieldColData.entrySet()) {
        String fieldName = entry.getKey();
        ColumnMetaData colMetaData = entry.getValue();
        // 创建消息集合
        String colComment = colMetaData.getColComment();
        if (StringUtils.isBlank(colComment)) {
          colComment = fieldName;
        }
        colComment = colComment.replace("，", ",");
        if (colComment.contains(",")) {
          colComment = colComment.substring(0, colComment.indexOf(","));
        }
        TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", fieldName, be.getBeName() + "." + fieldName, colComment, "Y", 1, admin, date, admin, date);
        TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", fieldName, be.getBeName() + "." + fieldName, fieldName, "Y", 1, admin, date, admin, date);
        tzMessageInfoMapper.insertSelective(tzMessageInfo1);
        tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      }
      TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", "CreatedByName", be.getBeName() + "." + "CreatedByName", "创建人名称", "Y", 1, admin, date, admin, date);
      TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", "CreatedByName", be.getBeName() + "." + "CreatedByName", "CreatedByName", "Y", 1, admin, date, admin, date);
      tzMessageInfoMapper.insertSelective(tzMessageInfo1);
      tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      messageInfIdA += 50;
    }
    messageIdA += 50;

  }

  private Map<String, ColumnMetaData> getFieldMapColData(Be be, List<ColumnMetaData> colData) {
    TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
      setName(be.getBeName());
    }});
    List<TzField> tzFieldList = tzFieldMapper.select(new TzField() {{
      setBusentityId(tzBusentity.getId());
    }});
    Class entityClass = be.getEntityClass();
    Field[] declaredFields = entityClass.getDeclaredFields();
    Map<String, ColumnMetaData> result = new HashMap<>();
    for (TzField tzField : tzFieldList) {
      String fieldName = tzField.getName();
      if (StringUtils.isNotBlank(tzField.getJoinName())) {
        continue;
      }
      String entityFldName = StringUtils.lowerCase(String.valueOf(fieldName.charAt(0))) + fieldName.substring(1);
      if (StringUtils.equals(tzField.getName(), "ModificationNumber")) {
        entityFldName = "modificationNum";
      }
      // 获取字段 注解的数据库字段名
      String colName = null;
      for (Field declaredField : declaredFields) {
        declaredField.setAccessible(true);
        if (StringUtils.equals(entityFldName, declaredField.getName())) {
          colName = declaredField.getAnnotation(Column.class).name();
          break;
        }
      }
      String finalColName = colName;
      ColumnMetaData tempColData = colData.stream().filter(columnMetaData -> StringUtils.equals(finalColName, columnMetaData.getColName())).collect(Collectors.toList()).get(0);
      result.put(fieldName, tempColData);
    }
    return result;
  }


  private void addBeList(List<Be> tempBelist, List<Be> belist) {
    for (Be be : belist) {
      tempBelist.add(be);
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addBeList(tempBelist, be.getZBeList());
      }
    }
  }


  private String nextMessageId() {
    String msgColId = messageIdPre + String.format("%0" + (idNum - messageIdPre.length()) + "d", messageIdA++);
    msgColIdInsertList.add(msgColId);
    return msgColId;
  }
  private String nextMessageInfId() {
    String msgInfId = messageInfIdPre + String.format("%0" + (idNum - messageInfIdPre.length()) + "d", messageInfIdA++);
    msgInfIdInsertList.add(msgInfId);
    return msgInfId;
  }

  @Test
  public void testDatabaseUtils() throws SQLException {
    Map<String, List<ColumnMetaData>> map = databaseUtil.getAllMap("oasisdev");
    System.out.println(map);
  }

  @Test
  public void testReplace() {
    String s = "asasasasasas";
    System.out.println(s.replace("a", "L"));
    System.out.println(StringUtils.replaceOnce(s, "a", "L"));
  }

  @Test
  public void testjdbc() {
    tzBusentityMapper.selectAll();
  }

}