package com.study.AA_Utils;

import com.study.mapper.*;
import com.study.entity.TzBmentity;
import com.study.entity.TzBusmodule;
import com.study.entity.TzComponent;
import com.study.entity.TzDispframe;
import com.study.entity.TzPage;
import com.study.entity.TzPageZone;
import com.study.entity.TzPermission;
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

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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

  /**
   * 根据be名称添加ListAdmin展示框架和展示框架元素
   */
  @Test
  public void createPageList() {
    String bmName = "TZStudent";

    String detailComponentId = "";
    String listComponentId = "";

    String listDispId = "cmsDispFrame000002";
    String detailDispId = "cmsDispFrame000001";
    List<String> detailListIds = Arrays.asList();


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

      transactionManager.commit(status);
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
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
    return pageIdPre + String.format("%0" + (idNum-pageIdPre.length()) + "d", pageIdA++);
  }
  private String nextpageZoneId() {
    return pageZoneIdPre + String.format("%0" + (idNum-pageZoneIdPre.length()) + "d", pageZoneIdA++);
  }
  private String nextpageZoneContentId() {
    return pageZoneContentIdPre + String.format("%0" + (idNum-pageZoneContentIdPre.length()) + "d", pageZoneContentIdA++);
  }

}
