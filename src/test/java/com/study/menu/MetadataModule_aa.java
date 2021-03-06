package com.study.menu;

import com.study.mapper.*;
import com.study.entity.*;
import com.study.utils.ColumnMetaData;
import com.study.utils.DatabaseUtil;
import com.study.utils.medadata.*;
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
public class MetadataModule_aa {
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

  private String beIdPre = "infraBE0000000";
  private String fieldIdPre = "infraField0000";
  private String joinIdPre = "infraJoin00000";
  private String joinSpecIdPre = "infraSpec00000";

  private String bmIdPre = "infraBM0000000";
  private String bmBeIdPre = "infraBMBE00000";
  private String linkIdPre = "infraLink00000";

  private String messageIdPre = "infraMsg000000";
  private String messageInfIdPre = "infraMsgInf000";

  private String permissionGroupIdPre = "infraPMGroup00";
  private String permissionIdPre = "infraPM0000000";

  private String promptIdPre = "infraPMGroup00";
  private String promptFieldIdPre = "infraPM0000000";

  private String filterDfnIdPre = "infraFilter000";
  private String filterFldIdPre = "infraFltFld000";
  private String filterFldOperatorIdPre = "infraFldOpr000";

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

  private Integer promptIdA = 1;
  private Integer promptFieldIdA = 1;

  private Integer filterDfnIdA = 1;
  private Integer filterFldIdA = 1;
  private Integer filterFldOperatorIdA = 1;

  private String module = "infra";
  private String moduleDesc = "????????????";
  private Bm bm = new Bm(null, "TZMenuTree", "TZMenuTree", new HashMap<String, String>() {{
    put("retrieve", "??????");
    put("create", "??????");
    put("update", "??????");
    put("delete", "??????");
  }}, new ArrayList<Link>() {{
    add(new Link("TZMenuTree/TZMenuNode", "ID", "TREE_ID", new HashMap<String, String>() {{
      put("retrieve", "??????");
      put("create", "??????");
      put("update", "??????");
      put("delete", "??????");
    }}));
  }});
  private List<Be> beList = new ArrayList<Be>() {{
    add(new Be() {{
      setBeName("TZMenuTree");
      setEntityClass(TzMenuTree.class);
      setTableName("TZ_MENU_TREE");
      setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
      setFilter(new FilterDfn(null, "TZMenuTreeFilter", Arrays.asList("NAME", "DESCRIPTION")));
      setZBeList(new ArrayList<Be>() {{
        add(new Be() {{
          setBeName("TZMenuNode");
          setEntityClass(TzMenuNode.class);
          setTableName("TZ_MENU_NODE");
          setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
          setFilter(new FilterDfn(null, "TZMenuNodeFilter", Arrays.asList("NAME", "DESCRIPTION", "TYPE")));
          setTransformList(new ArrayList<Transform>() {{
            add(new Transform("TYPE", "MenuNode_Type"));
          }});
          setPromptList(new ArrayList<Prompt>() {{
            add(new Prompt(null, "permissionIdPrompt", "PERMISSION_ID", new Be() {{
              setBeName("TZPermission");
              setEntityClass(TzPermission.class);
              setTableName("TZ_PERMISSION");
            }}, "CODE", "ID", Arrays.asList("ID", "NAME")));
          }});
        }});
      }});
    }});
  }};


  /**
   * ??????be????????????ListAdmin?????????????????????????????????
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

      addPrompt();

      addfilter();

      transactionManager.commit(status);
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
  }

  private void addPrompt() {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    for (Be be : tempBelist) {
      List<Prompt> promptList = be.getPromptList();
      if (!CollectionUtils.isEmpty(promptList)) {
        // prompt
        for (Prompt prompt : promptList) {

          TzPtDef tmppt = tzPtDefMapper.selectOne(new TzPtDef() {{
            setName(prompt.getPromptName());
          }});
          if (tmppt != null) throw new RuntimeException("prompt:" + prompt.getPromptName() + "????????????");
          prompt.setPromptId(nextPromptId());
          TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
            setName(prompt.getBe().getBeName());
          }});
          prompt.getBe().setBeId(tzBusentity.getId());

          List<TzField> fieldList = tzFieldMapper.select(new TzField() {{
            setBusentityId(tzBusentity.getId());
          }});
          String labelFieldId = tzFieldMapper.selectOne(new TzField() {{
            setBusentityId(tzBusentity.getId());
            setName(getFieldName(prompt.getLabelColName(), prompt.getBe()));
          }}).getId();
          String valueFieldId = tzFieldMapper.selectOne(new TzField() {{
            setBusentityId(tzBusentity.getId());
            setName(getFieldName(prompt.getValueColName(), prompt.getBe()));
          }}).getId();
          TzPtDef tzPtDef = new TzPtDef(prompt.getPromptId(), 1, admin, date, admin, date, null, prompt.getPromptName(), tzBusentity.getId(), null, null, labelFieldId, valueFieldId);
          tzPtDefMapper.insertSelective(tzPtDef);

          // promptField
          List<String> promptFldCollist = prompt.getPromptFldCollist();
          if (!CollectionUtils.isEmpty(promptFldCollist)) {
            List<TzField> fieldPromptList = promptFldCollist.stream().map(e -> {
              String fieldName = getFieldName(e, prompt.getBe());
              return tzFieldMapper.selectOne(new TzField() {{
                setBusentityId(tzBusentity.getId());
                setName(fieldName);
              }});
            }).collect(Collectors.toList());
            if (fieldPromptList.size() != promptFldCollist.size()) throw new RuntimeException("prompt????????????");
            AtomicInteger seq = new AtomicInteger(0);
            for (TzField tzField : fieldPromptList) {
              TzPtFieldDef tzPtFieldDef = new TzPtFieldDef(nextPromptFieldId(), 1, admin, date, admin, date, null, tzPtDef.getId(), tzField.getId(), "normal", "Y", seq.incrementAndGet(), null, tzBusentity.getName() + "." + tzField.getName(), "Y", tzField.getControlType(), tzField.getTransformCode());
              if (tzField.getName().equals("Id")) {
                tzPtFieldDef.setDisplayFlg("N");
                tzPtFieldDef.setSearchFlg("N");
              }
              tzPtFieldDefMapper.insertSelective(tzPtFieldDef);
            }
          }

          // ??????????????????
          String tempFieldId = tzFieldMapper.selectOne(new TzField() {{
            setName(getFieldName(prompt.getColName(), be));
            setBusentityId(be.getBeId());
          }}).getId();
          tzFieldMapper.updateByPrimaryKeySelective(new TzField() {{
            setId(tempFieldId);
            setControlType("prompt");
            setPtBename(tzBusentity.getName());
          }});

          promptFieldIdA += 10;
        }
      }
    }
  }

  private void addfilter() {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    for (Be be : tempBelist) {
      FilterDfn filter = be.getFilter();
      if (filter != null) {
        // filterDfn
        TzFilterDfn tempFilter = tzFilterDfnMapper.selectOne(new TzFilterDfn() {{
          setName(filter.getFilterName());
        }});
        if (tempFilter != null) throw new RuntimeException("filter:" + filter.getFilterName() + "?????????");
        filter.setFilterId(nextFilterDfnId());
        TzFilterDfn tzFilterDfn = new TzFilterDfn(filter.getFilterId(), be.getBeId(), filter.getFilterName(), null, "N", null, "Y", 1, admin, date, admin, date);
        tzFilterDfnMapper.insertSelective(tzFilterDfn);
        // filterFld
        List<String> filterFldList = filter.getFilterFldList();
        if (!CollectionUtils.isEmpty(filterFldList)) {
          AtomicInteger seq = new AtomicInteger(0);
          for (String colName : filterFldList) {
            String fieldName = getFieldName(colName, be);
            TzField tzField = tzFieldMapper.selectOne(new TzField() {{
              setBusentityId(be.getBeId());
              setName(fieldName);
            }});

            TzFilterFld tzFilterFld = new TzFilterFld(nextFilterFldId(), tzFilterDfn.getId(), tzField.getId(), null, seq.incrementAndGet(), tzField.getControlType(), tzField.getTransformCode(), tzField.getPtBename(), null, "N", "N", "N", be.getBeName() + "." + fieldName, null, "Y", 1, admin, date, admin, date);
            if (StringUtils.equals(tzField.getControlType(), "prompt")) {
              List<Prompt> promptList = be.getPromptList();
              Prompt tzPrompt = promptList.stream().filter(prompt -> prompt.getColName().equals(colName)).collect(Collectors.toList()).get(0);
              tzFilterFld.setPtDefId(tzPrompt.getPromptId());
            }
            if (StringUtils.equalsAny(tzField.getControlType(), "prompt", "transform")) {
              tzFilterFld.setFldIsdown("Y");
            }
            if (colName.equals("ID")) {
              tzFilterFld.setFldReadonly("Y");
              tzFilterFld.setFldHide("Y");
            }
            tzFilterFldMapper.insertSelective(tzFilterFld);

            List<String> operatorList = null;
            // ???????????????
            if (StringUtils.equalsAny(tzFilterFld.getControlType(), "prompt", "transform")) {
              operatorList = Arrays.asList("07", "01", "02", "08", "09", "10");
            } else if (StringUtils.equalsAny(tzFilterFld.getControlType(), "number")) {
              operatorList = Arrays.asList("07", "01", "02", "03", "04", "05", "06");
            } else if (StringUtils.equalsAny(tzFilterFld.getControlType(), "date", "datetime", "time")) {
              operatorList = Arrays.asList("07", "01", "02", "08", "09", "10");
            } else {
              operatorList = Arrays.asList("07", "01", "02", "08", "09");
            }
            for (String operator : operatorList) {
              TzFilterfldOperator tzFilterfldOperator = new TzFilterfldOperator(nextFilterFldOperatorId(), tzFilterFld.getId(), operator, "Y", "N", null, 1, admin, date, admin, date);
              if (operator.equals("07")) {
                tzFilterfldOperator.setIsDefOprt("Y");
              }
              tzFilterfldOperatorMapper.insertSelective(tzFilterfldOperator);
            }
            filterFldOperatorIdA += 10;
          }
        }

      }
      filterFldIdA += 20;
      filterFldOperatorIdA += 100;
    }

  }

  private void addPermission() {
    // ?????????
    TzPermissionGroup tzPermissionGroup = tzPermissionGroupMapper.selectOne(new TzPermissionGroup() {{
      setName(module);
    }});
    if (tzPermissionGroup == null || StringUtils.isBlank(tzPermissionGroup.getId())) {
      tzPermissionGroup = new TzPermissionGroup(nextPermissionGroupId(), module, moduleDesc, 1, admin, date, admin, date);
      tzPermissionGroupMapper.insertSelective(tzPermissionGroup);
    }
    // ??????
    Map<String, String> permission = bm.getPermission();
    for (Map.Entry<String, String> entry : permission.entrySet()) {
      TzPermission tzPermission = new TzPermission(nextPermissionId(), tzPermissionGroup.getId(), bm.getBmName() + ":" + bm.getPriBeName() + ":" + entry.getValue(), bm.getBmName() + ":" + bm.getPriBeName() + ":" + entry.getKey()
              , entry.getKey(), (byte) 0, 1, "", admin, date, admin, date);
      tzPermissionMapper.insertSelective(tzPermission);
    }
    permissionIdA += 20;
    if (!CollectionUtils.isEmpty(bm.getLinkList())) {
      for (Link link : bm.getLinkList()) {
        for (Map.Entry<String, String> entry : link.getPermission().entrySet()) {
          TzPermission tzPermission = new TzPermission(nextPermissionId(), tzPermissionGroup.getId(), bm.getBmName() + ":" + link.getName().split("/")[0] + ":" + link.getName().split("/")[1] + ":" + entry.getValue(), bm.getBmName() + ":" + link.getName().split("/")[0] + ":" + link.getName().split("/")[1] + ":" + entry.getKey()
                  , entry.getKey(), (byte) 0, 1, "", admin, date, admin, date);
          tzPermissionMapper.insertSelective(tzPermission);
        }
        permissionIdA += 20;
      }
    }

  }

  private void addMessage() throws SQLException {
    List<Be> tempBelist = new ArrayList<>();
    addBeList(tempBelist, beList);
    for (Be be : tempBelist) {
      TzMessageCollection tzMessageCollection = new TzMessageCollection(nextMessageId(), be.getBeName(), be.getBeName(), "Y", 1, admin, date, admin, date);
      tzMessageCollectionMapper.insertSelective(tzMessageCollection);

      TzBusentity tzBusentity = tzBusentityMapper.selectByPrimaryKey(be.getBeId());
      tzBusentity.setMsgCollectionId(tzMessageCollection.getId());
      tzBusentityMapper.updateByPrimaryKeySelective(tzBusentity);

      List<ColumnMetaData> colData = databaseUtil.getColData(be.getTableName());
      Map<String, ColumnMetaData> fieldColData = getFieldMapColData(be, colData);
      for (Map.Entry<String, ColumnMetaData> entry : fieldColData.entrySet()) {
        String fieldName = entry.getKey();
        ColumnMetaData colMetaData = entry.getValue();
        // ??????????????????
        String colComment = colMetaData.getColComment();
        if (StringUtils.isBlank(colComment)) {
          colComment = fieldName;
        }
        colComment = colComment.replace("???", ",");
        if (colComment.contains(",")) {
          colComment = colComment.substring(0, colComment.indexOf(","));
        }
        TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", fieldName, be.getBeName() + "." + fieldName, colComment, "Y", 1, admin, date, admin, date);
        TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", fieldName, be.getBeName() + "." + fieldName, fieldName, "Y", 1, admin, date, admin, date);
        tzMessageInfoMapper.insertSelective(tzMessageInfo1);
        tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      }
      TzMessageInfo tzMessageInfo1 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", "CreatedByName", be.getBeName() + "." + "CreatedByName", "???????????????", "Y", 1, admin, date, admin, date);
      TzMessageInfo tzMessageInfo2 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", "CreatedByName", be.getBeName() + "." + "CreatedByName", "CreatedByName", "Y", 1, admin, date, admin, date);
      tzMessageInfoMapper.insertSelective(tzMessageInfo1);
      tzMessageInfoMapper.insertSelective(tzMessageInfo2);
      messageInfIdA += 50;
    }
    messageIdA += 50;

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
      // ???????????? ???????????????????????????
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
    // ??????BM
    bm.setBmId(nextBmId());
    TzBusmodule tzBusmodule = new TzBusmodule(bm.getBmId(), bm.getBmName(), bm.getPriBeName(), module, "Y", null, 1, admin, date, admin, date);
    tzBusmoduleMapper.insertSelective(tzBusmodule);
    // ??????Link bmEntity
    // ?????????be???bmentity
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
    bmBeIdA += 20;
    linkIdA += 20;
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
        tzField.setControlType(getControlType(coldata, be));
        // ?????????????????????????????????
        List<Transform> transformList = be.getTransformList();
        if (!CollectionUtils.isEmpty(transformList)) {
          List<Transform> tempTransformList = transformList.stream().filter(e -> e.getColName().equals(coldata.getColName())).collect(Collectors.toList());
          if (!CollectionUtils.isEmpty(tempTransformList)) {
            Transform transform = tempTransformList.get(0);
            tzField.setControlType("transform");
            tzField.setTransformCode(transform.getTransformCode());
          }
        }

        int flag = tzFieldMapper.insertSelective(tzField);
        if (flag != 1){
          throw new RuntimeException("Field" + fieldName + "??????????????????");
        }
      }
      addSystemField(be);

      fieldIdA += 20;
      joinIdA += 20;
      joinSpecIdA += 20;
      if (!CollectionUtils.isEmpty(be.getZBeList())) {
        addFieldJoin(be.getZBeList());
      }
    }
  }

  private void addSystemField(Be be) {
    TzJoin tzJoin = new TzJoin(nextJoinId(), "ByName", be.getBeId(), "TZ_USER", "Y", "N", "Y", "?????????", 1, admin, date, admin, date);
    tzJoinMapper.insert(tzJoin);

    TzJoinSpec tzJoinSpec = new TzJoinSpec(nextJoinSpecId(), "ByName", tzJoin.getId(), "CreatedBy", "ID", "Y", "?????????", 1, admin, date, admin, date);
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

  private String getControlType(ColumnMetaData coldata, Be be) {
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
          throw new RuntimeException("??????" + coldata.getColName() + "???????????????0");
        }
        coldata.setNumberLen(coldata.getTextLen());
        return "Number";
      case "BIGINT":
        if (coldata.getTextLen() == 0) {
          throw new RuntimeException("??????" + coldata.getColName() + "Long?????????0");
        }
        coldata.setNumberLen(coldata.getTextLen());
        return "Long";
      case "DOUBLE":
      case "DECIMAL":
        if (coldata.getTextLen() == 0) {
          throw new RuntimeException("??????" + coldata.getColName() + "Double?????????0");
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
        throw new RuntimeException(be.getBeName() + "???BE????????????");
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
  private String nextPromptId() {
    return promptIdPre + String.format("%0" + (idNum-promptIdPre.length()) + "d", promptIdA++);
  }
  private String nextPromptFieldId() {
    return promptFieldIdPre + String.format("%0" + (idNum-promptFieldIdPre.length()) + "d", promptFieldIdA++);
  }
  private String nextFilterDfnId() {
    return filterDfnIdPre + String.format("%0" + (idNum-filterDfnIdPre.length()) + "d", filterDfnIdA++);
  }
  private String nextFilterFldId() {
    return filterFldIdPre + String.format("%0" + (idNum-filterFldIdPre.length()) + "d", filterFldIdA++);
  }
  private String nextFilterFldOperatorId() {
    return filterFldOperatorIdPre + String.format("%0" + (idNum-filterFldOperatorIdPre.length()) + "d", filterFldOperatorIdA++);
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

}
