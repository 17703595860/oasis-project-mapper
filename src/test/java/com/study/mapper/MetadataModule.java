package com.study.mapper;

import com.study.entity.*;
import com.study.utils.ColumnMetaData;
import com.study.utils.DatabaseUtil;
import com.study.utils.medadata.Be;
import com.study.utils.medadata.Bm;
import com.study.utils.medadata.Link;
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
import java.util.*;
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
  private TzMessageCollectionMapper tzMessageCollectionMapper;
  @Autowired
  private TzMessageInfoMapper tzMessageInfoMapper;

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

  private String bmIdPre = "cmsBM000000000";
  private String bmBeIdPre = "cmsBMBE0000000";
  private String linkIdPre = "cmsLink0000000";

  private String messageIdPre = "cmsMsg00000000";
  private String messageInfIdPre = "cmsMsgInf00000";

  private String permissionGroupIdPre = "cmsPMGroup0000";
  private String permissionIdPre = "cmsPM000000000";

  private Integer beIdA = 1;
  private Integer fieldIdA = 1;
  private Integer joinIdA = 1;
  private Integer joinSpecIdA = 1;

  private Integer bmIdA = 1;
  private Integer bmBeIdA = 1;
  private Integer linkIdA = 1;

  private Integer messageIdA = 1;
  private Integer messageInfIdA = 1;

  private Integer permissionGroupIdA = 1;
  private Integer permissionIdA = 1;

  private String module = "POC";
  private String moduleDesc = "POC模块";
  private Bm bm = new Bm(null, "TZStudent", "TZStudent", new HashMap<String, String>() {{
    put("retrieve", "查看");
    put("create", "新增");
    put("update", "修改");
    put("delete", "删除");
    put("deleteStudent", "自定义删除");
  }}, new ArrayList<Link>() {{
    add(new Link("TZStudent/TZIdcard", "ID", "STUDENT_ID", new HashMap<String, String>() {{
      put("retrieve", "查看");
      put("create", "新增");
      put("update", "修改");
      put("delete", "删除");
    }}));
    add(new Link("TZStudent/TZCourse", "ID", "STUDENT_ID", new HashMap<String, String>() {{
      put("retrieve", "查看");
      put("create", "新增");
      put("update", "修改");
      put("delete", "删除");
    }}));
  }});
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
  public void addMetadata() {

    DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
    def.setName("copyFieldToDisplayFrame");
    TransactionStatus status = transactionManager.getTransaction(def);
    try {

      addBe(beList);

      addFieldJoin(beList);

      addBm();

      addMessage();

      addPermission();

      transactionManager.commit(status);
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
  }

  private void addPermission() {
    // 权限组
    TzPermissionGroup tzPermissionGroup = tzPermissionGroupMapper.selectOne(new TzPermissionGroup() {{
      setName(module);
    }});
    if (tzPermissionGroup == null || StringUtils.isBlank(tzPermissionGroup.getId())) {
      tzPermissionGroup = new TzPermissionGroup(nextPermissionGroupId(), module, moduleDesc, 1, admin, date, admin, date);
      tzPermissionGroupMapper.insertSelective(tzPermissionGroup);
    }
    // 权限
    Map<String, String> permission = bm.getPermission();
    for (Map.Entry<String, String> entry : permission.entrySet()) {
      TzPermission tzPermission = new TzPermission(nextPermissionId(), tzPermissionGroup.getId(), bm.getBmName() + ":" + bm.getPriBeName() + ":" + entry.getValue(), bm.getBmName() + ":" + bm.getPriBeName() + ":" + entry.getKey()
              , entry.getKey(), (byte) 0, 1, "", admin, date, admin, date);
      tzPermissionMapper.insertSelective(tzPermission);
    }
    permissionIdA += 10;
    if (!CollectionUtils.isEmpty(bm.getLinkList())) {
      for (Link link : bm.getLinkList()) {
        for (Map.Entry<String, String> entry : link.getPermission().entrySet()) {
          TzPermission tzPermission = new TzPermission(nextPermissionId(), tzPermissionGroup.getId(), bm.getBmName() + ":" + link.getName().split("/")[0] + ":" + link.getName().split("/")[1] + ":" + entry.getValue(), bm.getBmName() + ":" + link.getName().split("/")[0] + ":" + link.getName().split("/")[1] + ":" + entry.getKey()
                  , entry.getKey(), (byte) 0, 1, "", admin, date, admin, date);
          tzPermissionMapper.insertSelective(tzPermission);
        }
        permissionIdA += 10;
      }
    }

  }

  private void addMessage() throws SQLException {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    for (Be be : tempBelist) {
      TzMessageCollection tzMessageCollection = new TzMessageCollection(nextMessageId(), be.getBeName(), be.getBeName(), "Y", 1, admin, date, admin, date);
      tzMessageCollectionMapper.insertSelective(tzMessageCollection);

      List<ColumnMetaData> colData = databaseUtil.getColData(be.getTableName());
      Map<String, ColumnMetaData> fieldColData = getFieldMapColData(be, colData);
      for (Map.Entry<String, ColumnMetaData> entry : fieldColData.entrySet()) {
        String fieldName = entry.getKey();
        ColumnMetaData colMetaData = entry.getValue();
        // 创建消息集合
        TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", fieldName, be.getBeName() + "." + fieldName, StringUtils.isBlank(colMetaData.getColComment()) ? fieldName : colMetaData.getColComment(), "Y", 1, admin, date, admin, date);
        TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", fieldName, be.getBeName() + "." + fieldName, fieldName, "Y", 1, admin, date, admin, date);
        tzMessageInfoMapper.insertSelective(tzMessageInfo1);
        tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      }
      TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", "CreatedByName", be.getBeName() + "." + "CreatedByName", "创建人名称", "Y", 1, admin, date, admin, date);
      TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", "CreatedByName", be.getBeName() + "." + "CreatedByName", "CreatedByName", "Y", 1, admin, date, admin, date);
      tzMessageInfoMapper.insertSelective(tzMessageInfo1);
      tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      messageInfIdA += 100;
    }
    messageIdA += 100;

  }

  private Map<String, ColumnMetaData> getFieldMapColData(Be be, List<ColumnMetaData> colData) {
    List<TzField> tzFieldList = tzFieldMapper.select(new TzField() {{
      setBusentityId(be.getBeId());
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

  private void addBm() {
    // 添加BM
    bm.setBmId(nextBmId());
    TzBusmodule tzBusmodule = new TzBusmodule(bm.getBmId(), bm.getBmName(), bm.getPriBeName(), module, "Y", null, 1, admin, date, admin, date);
    tzBusmoduleMapper.insertSelective(tzBusmodule);
    // 添加Link bmEntity
    // 添加住be的bmentity
    TzBmentity tzBmentity = new TzBmentity(nextBmBeId(), bm.getBmId(), bm.getPriBeName(), null, "Y", null, 1, admin, date, admin, date);
    tzBmentityMapper.insertSelective(tzBmentity);
    List<Link> linkList = bm.getLinkList();
    for (Link link : linkList) {
      String parentFld = getFieldName(link.getParentCol(), link.getName().split("/")[0]);
      String ziFld = getFieldName(link.getZiCol(), link.getName().split("/")[1]);

      TzLink tzLink = new TzLink(nextLinkId(), link.getName(), null, link.getName().split("/")[0], link.getName().split("/")[1], parentFld, ziFld, null, null, null, module, "Y", null, 1, admin, date, admin, date);
      tzLinkMapper.insert(tzLink);

      TzBmentity tzBmentity1 = new TzBmentity(nextBmBeId(), bm.getBmId(), link.getName().split("/")[1], link.getName(), "Y", null, 1, admin, date, admin, date);
      tzBmentityMapper.insertSelective(tzBmentity1);
    }
    bmBeIdA += 100;
    linkIdA += 100;
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
      addSystemField(be);

      fieldIdA += 100;
      joinIdA += 100;
      joinSpecIdA += 100;
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addFieldJoin(be.getZBeList());
      }
    }
  }

  private void addSystemField(Be be) {
    TzJoin tzJoin = new TzJoin(nextJoinId(), "ByName", be.getBeId(), "TZ_USER", "Y", "N", "Y", "创建人", 1, admin, date, admin, date);
    tzJoinMapper.insert(tzJoin);

    TzJoinSpec tzJoinSpec = new TzJoinSpec(nextJoinSpecId(), "ByName", tzJoin.getId(), "CreatedBy", "ID", "Y", "创建人", 1, admin, date, admin, date);
    tzJoinSpecMapper.insert(tzJoinSpec);

    TzField tzFieldModificationNumber = new TzField(nextFieldId(), "ModificationNumber", be.getBeId(), null, "MODIFICATION_NUM", null, null, "Number", null, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "string", null, null);
    TzField tzFieldCreated = new TzField(nextFieldId(), "Created", be.getBeId(), null, "CREATED", null, null, "DateTime", null, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "datetime", null, null);
    TzField tzFieldCreatedBy = new TzField(nextFieldId(), "CreatedBy", be.getBeId(), null, "CREATED_BY", null, null, "Varchar", 18, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "String", null, null);

    TzField tzFieldCreatedByName = new TzField(nextFieldId(), "CreatedByName", be.getBeId(), "ByName","USERNAME", null, null, "Varchar", 255, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "String", null, null);

    TzField tzFieldlastUpd = new TzField(nextFieldId(), "LastUpd", be.getBeId(), null, "LAST_UPD", null, null, "DateTime", null, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "datetime", null, null);
    TzField tzFieldlastUpdBy = new TzField(nextFieldId(), "LastUpdBy", be.getBeId(), null, "LAST_UPD_BY", null, null, "Varchar", 18, null, null, "Y", "N", "Y"
            , null, 1, admin, date, admin, date, "String", null, null);

    tzFieldMapper.insertSelective(tzFieldModificationNumber);
    tzFieldMapper.insertSelective(tzFieldCreated);
    tzFieldMapper.insertSelective(tzFieldCreatedBy);
    tzFieldMapper.insertSelective(tzFieldCreatedByName);
    tzFieldMapper.insertSelective(tzFieldlastUpd);
    tzFieldMapper.insertSelective(tzFieldlastUpdBy);

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

  private String getFieldName(String colName, String beName) {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    Be be = tempBelist.stream().filter(be1 -> StringUtils.equals(be1.getBeName(), beName)).collect(Collectors.toList()).get(0);
    Class entityClass = be.getEntityClass();
    Field[] declaredFields = entityClass.getDeclaredFields();
    String fieldName = Arrays.stream(declaredFields).filter(field -> {
      field.setAccessible(true);
      return StringUtils.equals(colName, field.getAnnotation(Column.class).name());
    }).map(Field::getName).collect(Collectors.toList()).get(0);
    return StringUtils.upperCase(String.valueOf(fieldName.charAt(0))) + fieldName.substring(1);
  }

  private void addBeList(List<Be> tempBelist, List<Be> belist) {
    for (Be be : belist) {
      tempBelist.add(be);
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addBeList(tempBelist, be.getZBeList());
      }
    }
  }

  private String getFieldName(String colName, Be be) {
    Class entityClass = be.getEntityClass();
    Field[] declaredFields = entityClass.getDeclaredFields();
    String fieldName = Arrays.stream(declaredFields).filter(field -> {
      field.setAccessible(true);
      return StringUtils.equals(colName, field.getAnnotation(Column.class).name());
    }).map(Field::getName).collect(Collectors.toList()).get(0);
    return StringUtils.upperCase(String.valueOf(fieldName.charAt(0))) + fieldName.substring(1);
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
  private String nextBmBeId() {
    return bmBeIdPre + String.format("%0" + (idNum-bmBeIdPre.length()) + "d", bmBeIdA++);
  }
  private String nextLinkId() {
    return linkIdPre + String.format("%0" + (idNum-linkIdPre.length()) + "d", linkIdA++);
  }
  private String nextMessageId() {
    return messageIdPre + String.format("%0" + (idNum-messageIdPre.length()) + "d", messageIdA++);
  }
  private String nextMessageInfId() {
    return messageInfIdPre + String.format("%0" + (idNum-messageInfIdPre.length()) + "d", messageInfIdA++);
  }
  private String nextPermissionGroupId() {
    return permissionGroupIdPre + String.format("%0" + (idNum-permissionGroupIdPre.length()) + "d", permissionGroupIdA++);
  }
  private String nextPermissionId() {
    return permissionIdPre + String.format("%0" + (idNum-permissionIdPre.length()) + "d", permissionIdA++);
  }

  @Test
  public void testDatabaseUtils() throws SQLException {
    Map<String, List<ColumnMetaData>> map = databaseUtil.getAllMap("oasisdev");
    System.out.println(map);
  }

}
