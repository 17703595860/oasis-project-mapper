package com.study.cms.站点;

import com.study.entity.*;
import com.study.mapper.*;
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
public class PageModule {

  @Autowired
  private TzFieldMapper tzFieldMapper;
  @Autowired
  private TzBusentityMapper tzBusentityMapper;
  @Autowired
  private TzBusmoduleMapper tzBusmoduleMapper;
  @Autowired
  private TzPermissionMapper tzPermissionMapper;
  @Autowired
  private TzComponentMapper tzComponentMapper;
  @Autowired
  private TzDispframeMapper tzDispframeMapper;
  @Autowired
  private TzDispframeElementMapper tzDispframeElementMapper;
  @Autowired
  private TzDispframeFlddrilldownMapper tzDispframeFlddrilldownMapper;
  @Autowired
  private DataSourceTransactionManager transactionManager;
  @Autowired
  private TzPageMapper tzPageMapper;
  @Autowired
  private TzPageZoneMapper tzPageZoneMapper;
  @Autowired
  private TzPagezoneContentMapper tzPagezoneContentMapper;
  @Autowired
  private TzLinkMapper tzLinkMapper;
  @Autowired
  private TzBmentityMapper tzBmentityMapper;


  String admin = "ADMIN0000000000001";
  Integer idNum = 18;

  private String pageIdPre = "cmspage00000000";
  private String pageZoneIdPre = "cmspagezone0000";
  private String pageZoneContentIdPre = "cmspageCont0000";

  private Integer pageIdA = 1;
  private Integer pageZoneIdA = 1;
  private Integer pageZoneContentIdA = 1;

  private List<String> pageIdInsertList = new ArrayList<>();
  private List<String> pageZoneIdInsertList = new ArrayList<>();
  private List<String> pageZoneContentInsertList = new ArrayList<>();

  // 是否自定义路径
  private String module = "cms";
  private boolean fileFlag = false;
  private String descFilePath = "D:/桌面/sql/";
  private boolean transactionCommit = false;

  String bmName = "TZOrgSite";

  String detailComponentId = "";
  String listComponentId = "";

  String listDispId = "cmsDispFrame000002";
  String detailDispId = "cmsDispFrame000001";
  List<String> detailListIds = Arrays.asList("cmsDispFrame000014", "cmsDispFrame000025");


  /**
   * 根据be名称添加ListAdmin展示框架和展示框架元素
   */
  @Test
  public void createPageList() {

    DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
    def.setName("copyFieldToDisplayFrame");
    TransactionStatus status = transactionManager.getTransaction(def);
    try {
      Date date = new Date();
      TzBusmodule tzBusmodule = tzBusmoduleMapper.selectOne(new TzBusmodule() {{
        setName(bmName);
      }});
      if (tzBusmodule == null) {
        throw new RuntimeException("bmbe不存在");
      }

      // 插入list
      TzPage tzPageList = new TzPage(nextpageId(), bmName + "ListPage", tzBusmodule.getId(), "ListPage", tzBusmodule.getModule(), "Y", null, 1, admin, date, admin, date);
      tzPageMapper.insertSelective(tzPageList);
      // 插入List pageZone
      TzDispframe tzDispframeList = tzDispframeMapper.selectByPrimaryKey(listDispId);
      TzPermission tzPermission = null;

      tzPermission = getTzPermission(tzBusmodule, tzDispframeList);

      if (tzDispframeList == null) throw new RuntimeException("listDis" + listDispId + "不存在");
      TzPageZone tzPageZone = new TzPageZone(nextpageZoneId(), tzDispframeList.getDispframeName(), tzPageList.getId(), tzDispframeList.getType(), tzDispframeList.getBeName(), tzDispframeList.getId(), null, null
          , 1, tzPermission.getId(), tzDispframeList.getBeName() + "." + tzDispframeList.getBeName(), null, "Y", null, 1, admin, date, admin, date);
      tzPageZoneMapper.insertSelective(tzPageZone);

      // 插入"DetailPage"
      AtomicInteger seq = new AtomicInteger(0);
      TzPage tzPageDetail = new TzPage(nextpageId(), bmName + "DetailPage", tzBusmodule.getId(), "DetailPage", tzBusmodule.getModule(), "Y", null, 1, admin, date, admin, date);
      tzPageMapper.insertSelective(tzPageDetail);
      // 插入 detail form
      TzDispframe tzDispframeDetail = tzDispframeMapper.selectByPrimaryKey(detailDispId);
      if (tzDispframeDetail == null) throw new RuntimeException("detailDis" + detailDispId + "不存在");
      TzPageZone tzPageZoneDetail = new TzPageZone(nextpageZoneId(), tzDispframeDetail.getDispframeName(), tzPageDetail.getId(), tzDispframeDetail.getType(), tzDispframeDetail.getBeName(), tzDispframeDetail.getId(), null, null
          , seq.incrementAndGet(), tzPermission.getId(), tzDispframeDetail.getBeName() + "." + tzDispframeDetail.getBeName(), null, "Y", null, 1, admin, date, admin, date);
      tzPageZoneMapper.insertSelective(tzPageZoneDetail);
      // 插入detail list
      if (!CollectionUtils.isEmpty(detailListIds)) {
        for (String detailListId : detailListIds) {
          //  插入detail List pageZone
          TzDispframe tzDispframeDetailList = tzDispframeMapper.selectByPrimaryKey(detailListId);
          TzPermission tzPermissiondetailList = getTzPermission(tzBusmodule, tzDispframeDetailList);
          if (tzDispframeDetailList == null) throw new RuntimeException("DetailListDis" + detailListId + "不存在");
          TzPageZone tzPageZoneDetailList = new TzPageZone(nextpageZoneId(), tzDispframeDetailList.getDispframeName(), tzPageDetail.getId(), tzDispframeDetailList.getType(), tzDispframeDetailList.getBeName(), tzDispframeDetailList.getId(), null, tzPageZoneDetail.getId()
              , seq.incrementAndGet(), tzPermissiondetailList.getId(), tzDispframeDetailList.getBeName() + "." + tzDispframeDetailList.getBeName(), null, "Y", null, 1, admin, date, admin, date);
          tzPageZoneMapper.insertSelective(tzPageZoneDetailList);
        }
      }

      // 如果List中包含跳转字端，Name跳转到详情页面，给对应component添加对应的pageId
      if (StringUtils.isNotBlank(detailComponentId)) {
        TzComponent tzComponent = tzComponentMapper.selectByPrimaryKey(detailComponentId);
        tzComponent.setPageId(tzPageDetail.getId());
        tzComponentMapper.updateByPrimaryKeySelective(tzComponent);
      }
      if (StringUtils.isNotBlank(listComponentId)) {
        TzComponent tzComponent = tzComponentMapper.selectByPrimaryKey(listComponentId);
        tzComponent.setPageId(tzPageList.getId());
        tzComponentMapper.updateByPrimaryKeySelective(tzComponent);
      }

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
    addPage(srcFilePath);
  }

  private void addPage(String srcFilePath) {
    String filePath = srcFilePath + "11-PAGE.sql";
    if (new File(filePath).exists()) {
      new File(filePath).delete();
    }
    if (CollectionUtils.isEmpty(pageIdInsertList)) {
      return;
    }
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {

      String bmId = tzBusmoduleMapper.selectOne(new TzBusmodule() {{
        setName(bmName);
      }}).getId();

      bw.write("delete from TZ_PAGEZONE_CONTENT where PAGEZONE_ID in (select ID from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('" + bmId + "')));");
      bw.newLine();
      bw.write("delete from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('" + bmId + "'));");
      bw.newLine();
      bw.write("delete from TZ_PAGE where BUSMODULE_ID in ('" + bmId + "');");
      bw.newLine();bw.newLine();

      // 添加frame
      List<TzPage> pageList = tzPageMapper.selectByIds(StringUtils.join(pageIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      List<Map<String, List<String>>> objList = pageList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PAGE", bw);
      // 添加frameElement
      List<TzPageZone> pageZoneList = tzPageZoneMapper.selectByIds(StringUtils.join(pageZoneIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = pageZoneList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PAGE_ZONE", bw);
      // 添加frameFldJump
      List<TzPagezoneContent> pagezoneContentList = tzPagezoneContentMapper.selectByIds(StringUtils.join(pageZoneContentInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
      objList = pagezoneContentList.stream().map(this::getColAndVal).collect(Collectors.toList());
      createSql(objList, "TZ_PAGEZONE_CONTENT", bw);
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

  private TzPermission getTzPermission(TzBusmodule tzBusmodule, TzDispframe tzDispframeList) {
    TzPermission tzPermission;
    String linkName = tzBmentityMapper.selectOne(new TzBmentity() {{
      setBusmoduleId(tzBusmodule.getId());
      setBeName(tzDispframeList.getBeName());
    }}).getLinkName();
    if (StringUtils.isBlank(linkName)) {
      tzPermission = tzPermissionMapper.selectOne(new TzPermission() {{
        setCode(tzBusmodule.getName() + ":" + tzDispframeList.getBeName() + ":retrieve");
      }});
    } else {
      tzPermission = tzPermissionMapper.selectOne(new TzPermission() {{
        setCode(tzBusmodule.getName() + ":" + linkName.split("/")[0] + ":" + linkName.split("/")[1] + ":retrieve");
      }});
    }
    return tzPermission;
  }

  private String nextpageId() {
    String pageId = pageIdPre + String.format("%0" + (idNum - pageIdPre.length()) + "d", pageIdA++);
    pageIdInsertList.add(pageId);
    return pageId;
  }
  private String nextpageZoneId() {
    String pageZoneId = pageZoneIdPre + String.format("%0" + (idNum - pageZoneIdPre.length()) + "d", pageZoneIdA++);
    pageZoneIdInsertList.add(pageZoneId);
    return pageZoneId;
  }
  private String nextpageZoneContentId() {
    String pageZoneContentId = pageZoneContentIdPre + String.format("%0" + (idNum - pageZoneContentIdPre.length()) + "d", pageZoneContentIdA++);
    pageZoneContentInsertList.add(pageZoneContentId);
    return pageZoneContentId;
  }

}
