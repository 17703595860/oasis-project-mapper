package com.study.cms.站点类型;

import com.study.entity.*;
import com.study.mapper.*;
import com.study.utils.ColumnMetaData;
import com.study.utils.DatabaseUtil;
import com.study.utils.medadata.Be;
import com.study.utils.medadata.Bm;
import com.study.utils.medadata.FilterDfn;
import com.study.utils.medadata.Link;
import com.study.utils.medadata.Prompt;
import com.study.utils.medadata.Transform;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  private String beIdPre = "cmsBE110000000";
  private String fieldIdPre = "cmsField110000";
  private String joinIdPre = "cmsJoin1100000";
  private String joinSpecIdPre = "cmsSpec1100000";

  private String bmIdPre = "cmsBM110000000";
  private String bmBeIdPre = "cmsBMBE1100000";
  private String linkIdPre = "cmsLink1100000";

  private String messageIdPre = "cmsMsg11000000";
  private String messageInfIdPre = "cmsMsgInf11000";

  private String permissionGroupIdPre = "cmsPMGroup1100";
  private String permissionIdPre = "cmsPM110000000";

  private String promptIdPre = "cmsPMGroup1100";
  private String promptFieldIdPre = "cmsPM110000000";

  private String filterDfnIdPre = "cmsFilter11000";
  private String filterFldIdPre = "cmsFltFld11000";
  private String filterFldOperatorIdPre = "cmsFldOpr11000";

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

  private List<String> beIdInsertList = new ArrayList<>();
  private List<String> fieldIdInsertList = new ArrayList<>();
  private List<String> joinIdInsertList = new ArrayList<>();
  private List<String> joinSpecIdInsertList = new ArrayList<>();

  private List<String> linkIdInsertList = new ArrayList<>();
  private List<String> bmIdInsertList = new ArrayList<>();
  private List<String> bmBeldIdInsertList = new ArrayList<>();

  private List<String> msgColIdInsertList = new ArrayList<>();
  private List<String> msgInfIdInsertList = new ArrayList<>();

  private List<String> permissionGroupIdInsertList = new ArrayList<>();
  private List<String> permissionIdInsertList = new ArrayList<>();

  private List<String> promptIdInsertList = new ArrayList<>();
  private List<String> promptFldIdInsertList = new ArrayList<>();

  private List<String> filterDfnIdInsertList = new ArrayList<>();
  private List<String> filterFldIdInsertList = new ArrayList<>();
  private List<String> filterFldOprIdInsertList = new ArrayList<>();

  // 是否自定义路径
  private boolean fileFlag = false;
  private String descFilePath = "D:/桌面/sql/";
  private boolean transactionCommit = false;

  private String module = "cms";
  private String moduleDesc = "站点模块";
  private Bm bm = new Bm(null, "TZOrgSite", "TZOrgSite", new HashMap<String, String>() {{
    put("retrieve", "查看");
    put("create", "新增");
    put("update", "修改");
    put("delete", "删除");
  }}, new ArrayList<Link>() {{
    add(new Link("TZOrgSite/TZSiteColu", "ID", "SITE_ID", new HashMap<String, String>() {{
      put("retrieve", "查看");
      put("create", "新增");
      put("update", "修改");
      put("delete", "删除");
    }}));
    add(new Link("TZOrgSite/TZSiteTemp", "ID", "SITE_ID", new HashMap<String, String>() {{
      put("retrieve", "查看");
      put("create", "新增");
      put("update", "修改");
      put("delete", "删除");
    }}));
  }});
//  private List<Be> beList = new ArrayList<Be>() {{
//    add(new Be() {{
//      setBeName("TZOrgSite");
//      setEntityClass(TzOrganizationSite.class);
//      setTableName("TZ_ORGANIZATION_SITE");
//      setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
//      setFilter(new FilterDfn(null, "TZOrgSiteFilter", Arrays.asList("NAME", "SITE_NAME", "SITE_TYPE", "SITE_DESC", "SITE _ENABLE")));
//      setTransformList(new ArrayList<Transform>() {{
//        add(new Transform("SITE_TYPE", "cmsTrnsCl000000001"));
//        add(new Transform("SITE_ENABLE", "cmsTrnsCl000000002"));
//        add(new Transform("SITE_ISSUE", "cmsTrnsCl000000003"));
//      }});
//      setZBeList(new ArrayList<Be>() {{
//        add(new Be() {{
//          setBeName("TZSiteColu");
//          setEntityClass(TzSiteColu.class);
//          setTableName("TZ_SITE_COLU");
//          setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
//          setFilter(new FilterDfn(null, "TZSiteColuFilter", Arrays.asList("NAME", "COLU_TYPE", "COLU_ENABLE", "SITE_DESC", "SITE _ENABLE")));
//          setTransformList(new ArrayList<Transform>() {{
//            add(new Transform("SITE_TYPE", "cmsTrnsCl000000001"));
//            add(new Transform("SITE_ENABLE", "cmsTrnsCl000000002"));
//            add(new Transform("SITE_ISSUE", "cmsTrnsCl000000003"));
//          }});
//          setPromptList(new ArrayList<Prompt>() {{
//            add(new Prompt(null, "classIdPrompt", "CLASS_ID", new Be() {{
//              setBeName("TZClass");
//              setEntityClass(TzClass.class);
//              setTableName("TZ_CLASS");
//            }}, "NAME", "ID", Arrays.asList("ID", "NAME")));
//          }});
//        }});
//        add(new Be() {{
//          setBeName("TZCourse");
//          setEntityClass(TzCourseInst.class);
//          setTableName("TZ_COURSE_INST");
//          setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
//        }});
//      }});
//    }});
//  }};

  private List<Be> beList = new ArrayList<Be>() {{
    add(new Be() {{
      setBeName("TZArtAddType");
      setEntityClass(TzArtAddType.class);
      setTableName("TZ_ART_ADD_TYPE");
      setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
    }});
    add(new Be() {{
      setBeName("TZArtAddTypeField");
      setEntityClass(TzArtAddTypeField.class);
      setTableName("TZ_ART_ADD_TYPE_FIELD");
      setClassName("cn.com.tranzvision.oasis.basebizobj.BCEntity.TZBCEntityBase");
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

      addBe(beList);

      addFieldJoin(beList);

      addBm();

      addMessage();

      addPermission();

      addPrompt();

      addfilter();

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
    addBeSql(srcFilePath);
    addBmSql(srcFilePath);
    addMessageSql(srcFilePath);
    addPermissionSql(srcFilePath);
    addPromptSql(srcFilePath);
    addFilterSql(srcFilePath);
  }

  private void addFilterSql(String srcFilePath) {
    String filePath = srcFilePath + "06-FILTERDEFINE.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(filterDfnIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      String filterIdList = StringUtils.join(filterDfnIdInsertList.stream().map(e -> "'" + e +"'").collect(Collectors.toList()), ", ");
      bw.write("delete from TZ_FILTERFLD_OPERATOR where FILTER_FIELD_ID in (select ID from TZ_FILTER_FLD where FILTER_ID in (" + filterIdList + "));");
      bw.newLine();
      bw.write("delete from TZ_FILTER_FLD where FILTER_ID in (" + filterIdList + ");");
      bw.newLine();
      bw.write("delete from TZ_FILTER_DFN where ID in (" + filterIdList + ");");
      bw.newLine();bw.newLine();
      // 添加filter
      List<TzFilterDfn> filterDfnList = tzFilterDfnMapper.selectByIds(StringUtils.join(filterDfnIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = filterDfnList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_FILTER_DFN", bw);
      // 添加filterFld
      List<TzFilterFld> filterFldList = tzFilterFldMapper.selectByIds(StringUtils.join(filterFldIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = filterFldList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_FILTER_FLD", bw);
      // 添加filterFldOpr
      List<TzFilterfldOperator> filterfldoprlist = tzFilterfldOperatorMapper.selectByIds(StringUtils.join(filterFldOprIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = filterfldoprlist.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_FILTERFLD_OPERATOR", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void addPromptSql(String srcFilePath) {
    String filePath = srcFilePath + "07-PROMPT.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(promptIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      String promptIdStr = StringUtils.join(promptIdInsertList.stream().map(e -> "'" + e +"'").collect(Collectors.toList()), ", ");
      bw.write("delete from TZ_PT_FIELD_DEF where PT_DEF_ID in (" + promptIdStr + ");");
      bw.newLine();
      bw.write("delete from TZ_PT_DEF where ID in (" + promptIdStr + ");");
      bw.newLine();bw.newLine();
      // 添加prompt
      List<TzPtDef> promptList = tzPtDefMapper.selectByIds(StringUtils.join(promptIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = promptList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PT_DEF", bw);
      // 添加promptFld
      List<TzPtFieldDef> promptFldList = tzPtFieldDefMapper.selectByIds(StringUtils.join(promptFldIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = promptFldList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PT_FIELD_DEF", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void addPermissionSql(String srcFilePath) {
    String filePath = srcFilePath + "04-PERMISSION.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(permissionGroupIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      String permissionGoupStr = StringUtils.join(permissionGroupIdInsertList.stream().map(e -> "'" + e +"'").collect(Collectors.toList()), ", ");
      bw.write("delete from TZ_PERMISSION where GROUP_ID in (" + permissionGoupStr + ");");
      bw.newLine();
      bw.write("delete from TZ_PERMISSION_GROUP where ID in (" + permissionGoupStr + ");");
      bw.newLine();bw.newLine();
      // 添加permissionGroup
      List<TzPermissionGroup> permissionGroupList = tzPermissionGroupMapper.selectByIds(StringUtils.join(permissionGroupIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = permissionGroupList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PERMISSION_GROUP", bw);
      // 添加permission
      List<TzPermission> permissionList = tzPermissionMapper.selectByIds(StringUtils.join(permissionIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = permissionList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PERMISSION", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void addMessageSql(String srcFilePath) {
    String filePath = srcFilePath + "09-MESSAGE.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(msgColIdInsertList)) {
      return;
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

  private void addBmSql(String srcFilePath) {
    String filePath = srcFilePath + "01-METADATA.sql";
    if (CollectionUtils.isEmpty(bmIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      // 添加link
      List<TzLink> linkList = tzLinkMapper.selectByIds(StringUtils.join(linkIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = linkList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_LINK", bw);
      // 添加bm
      List<TzBusmodule> bmList = tzBusmoduleMapper.selectByIds(StringUtils.join(bmIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = bmList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_BUSMODULE", bw);
      // 添加bmbe
      List<TzBmentity> bmbeList = tzBmentityMapper.selectByIds(StringUtils.join(bmBeldIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = bmbeList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_BMENTITY", bw);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void addBeSql(String srcFilePath) {
    String filePath = srcFilePath + "01-METADATA.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(beIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      bw.write("# 删除" + module + "元数据配置");
      bw.newLine();
      bw.write("delete from TZ_LINK where MODULE = '" + module + "';");
      bw.newLine();
      bw.write("--");
      bw.newLine();
      bw.write("delete from TZ_JOIN_SPEC where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = '" + module + "'));");
      bw.newLine();
      bw.write("delete from TZ_JOIN_CONSTRNT where JOIN_ID in (select ID from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = '" + module + "'));");
      bw.newLine();
      bw.write("delete from TZ_JOIN where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = '" + module + "');");
      bw.newLine();
      bw.write("delete from TZ_FIELD where BUSENTITY_ID in (select ID from TZ_BUSENTITY where MODULE = '" + module + "');");
      bw.newLine();
      bw.write("delete from TZ_BUSENTITY where MODULE = '" + module + "';");
      bw.newLine();
      bw.write("--");
      bw.newLine();
      bw.write("delete from TZ_BMENTITY where BUSMODULE_ID in (select ID from TZ_BUSMODULE where MODULE = '" + module + "');");
      bw.newLine();
      bw.write("delete from TZ_BUSMODULE where MODULE = '" + module + "';");
      bw.newLine();bw.newLine();
      // 添加be
      List<TzBusentity> beList = tzBusentityMapper.selectByIds(StringUtils.join(beIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = beList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_BUSENTITY", bw);
      // 添加field
      List<TzField> fieldList = tzFieldMapper.selectByIds(StringUtils.join(fieldIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = fieldList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_FIELD", bw);
      // 添加join
      List<TzJoin> joinList = tzJoinMapper.selectByIds(StringUtils.join(joinIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = joinList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_JOIN", bw);
      // 添加joinSpec
      List<TzJoinSpec> joinSpecList = tzJoinSpecMapper.selectByIds(StringUtils.join(joinSpecIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = joinSpecList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_JOIN_SPEC", bw);
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
          if (tmppt != null) throw new RuntimeException("prompt:" + prompt.getPromptName() + "已经存在");
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
            if (fieldPromptList.size() != promptFldCollist.size()) throw new RuntimeException("prompt配置错误");
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

          // 回写字段配置
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
        if (tempFilter != null) throw new RuntimeException("filter:" + filter.getFilterName() + "已存在");
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
            // 添加操作符
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

      // 消息 be名称的消息集合
      String beName = be.getBeName();
      String tableComment = databaseUtil.getTableComment(be.getTableName());
      tableComment = StringUtils.isBlank(tableComment) ? beName : tableComment;
      tableComment = tableComment.replace("，", ",");
      tableComment = tableComment.replace("表", "");
      TzMessageInfo tzMessageInfo01 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ZHS", beName, beName + "." + beName, tableComment, "Y", 1, admin, date, admin, date);
      TzMessageInfo tzMessageInfo02 = new TzMessageInfo(nextMessageInfId(), tzMessageCollection.getId(), "ENG", beName, beName + "." + beName, beName, "Y", 1, admin, date, admin, date);
      tzMessageInfoMapper.insertSelective(tzMessageInfo01);
      tzMessageInfoMapper.insertSelective(tzMessageInfo02);

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
        // 提前添加好的转换值添加
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
          throw new RuntimeException("Field" + fieldName + "字段添加失败");
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
    String beId = beIdPre + String.format("%0" + (idNum - beIdPre.length()) + "d", beIdA++);
    beIdInsertList.add(beId);
    return beId;
  }
  private String nextFieldId() {
    String fieldId = fieldIdPre + String.format("%0" + (idNum - fieldIdPre.length()) + "d", fieldIdA++);
    fieldIdInsertList.add(fieldId);
    return fieldId;
  }
  private String nextJoinId() {
    String joinId = joinIdPre + String.format("%0" + (idNum - joinIdPre.length()) + "d", joinIdA++);
    joinIdInsertList.add(joinId);
    return joinId;
  }
  private String nextJoinSpecId() {
    String joinSpecId = joinSpecIdPre + String.format("%0" + (idNum - joinSpecIdPre.length()) + "d", joinSpecIdA++);
    joinSpecIdInsertList.add(joinSpecId);
    return joinSpecId;
  }

  private String nextBmId() {
    String bmId = bmIdPre + String.format("%0" + (idNum - bmIdPre.length()) + "d", bmIdA++);
    bmIdInsertList.add(bmId);
    return bmId;
  }
  private String nextBmBeId() {
    String bmbeId = bmBeIdPre + String.format("%0" + (idNum - bmBeIdPre.length()) + "d", bmBeIdA++);
    bmBeldIdInsertList.add(bmbeId);
    return bmbeId;
  }
  private String nextLinkId() {
    String linkId = linkIdPre + String.format("%0" + (idNum - linkIdPre.length()) + "d", linkIdA++);
    linkIdInsertList.add(linkId);
    return linkId;
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

  private String nextPermissionGroupId() {
    String permissionGroupId = permissionGroupIdPre + String.format("%0" + (idNum - permissionGroupIdPre.length()) + "d", permissionGroupIdA++);
    permissionGroupIdInsertList.add(permissionGroupId);
    return permissionGroupId;
  }
  private String nextPermissionId() {
    String permissionId = permissionIdPre + String.format("%0" + (idNum - permissionIdPre.length()) + "d", permissionIdA++);
    permissionIdInsertList.add(permissionId);
    return permissionId;
  }

  private String nextPromptId() {
    String promptId = promptIdPre + String.format("%0" + (idNum - promptIdPre.length()) + "d", promptIdA++);
    promptIdInsertList.add(promptId);
    return promptId;
  }
  private String nextPromptFieldId() {
    String promptFldId = promptFieldIdPre + String.format("%0" + (idNum - promptFieldIdPre.length()) + "d", promptFieldIdA++);
    promptFldIdInsertList.add(promptFldId);
    return promptFldId;
  }

  private String nextFilterDfnId() {
    String filterDfnId = filterDfnIdPre + String.format("%0" + (idNum - filterDfnIdPre.length()) + "d", filterDfnIdA++);
    filterDfnIdInsertList.add(filterDfnId);
    return filterDfnId;
  }
  private String nextFilterFldId() {
    String filterFldId = filterFldIdPre + String.format("%0" + (idNum - filterFldIdPre.length()) + "d", filterFldIdA++);
    filterFldIdInsertList.add(filterFldId);
    return filterFldId;
  }
  private String nextFilterFldOperatorId() {
    String filterFldOprId = filterFldOperatorIdPre + String.format("%0" + (idNum - filterFldOperatorIdPre.length()) + "d", filterFldOperatorIdA++);
    filterFldOprIdInsertList.add(filterFldOprId);
    return filterFldOprId;
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
    String comment = databaseUtil.getTableComment("TZ_IMPORT_HISTORY");
    System.out.println(comment);
  }

  @Test
  public void testjdbc() {
    tzBusentityMapper.selectAll();
  }

}