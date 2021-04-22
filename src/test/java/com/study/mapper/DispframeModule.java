package com.study.mapper;

import com.study.entity.*;
import com.study.utils.SnowFlake;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/21 21:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DispframeModule {

    @Autowired
    private TzFieldMapper tzFieldMapper;
    @Autowired
    private TzBusentityMapper tzBusentityMapper;
    @Autowired
    private TzDispframeMapper tzDispframeMapper;
    @Autowired
    private TzDispframeElementMapper tzDispframeElementMapper;
    @Autowired
    private TzDispframeFlddrilldownMapper tzDispframeFlddrilldownMapper;
    @Autowired
    private DataSourceTransactionManager transactionManager;


    String admin = "ADMIN0000000000001";
    Date date = new Date();
    Integer idNum = 18;

    private String dispFrameIdpre = "cmsDispFrame000";
    private String dispFrameElementIdpre = "cmsDispEl000000";
    private String dispFrameFldJumpIdpre = "cmsDispJump0000";

    private Integer dispFrameIdA = 1;
    private Integer dispFrameElementIdA = 1;
    private Integer dispFrameFldJumpIdA = 1;

    /**
     * 根据be名称添加ListAdmin展示框架和展示框架元素
     */
    @Test
    public void copyDisplayFrameAllByBeName() {
        String beName = "TZClass";
        String datasetFlg = "Admin";
        String DetailComponentId = "534420627126358027";
        String filterId = "151502154956802";
        boolean add = true;
        boolean edit = true;
        boolean search = true;
        boolean del = true;


        DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setName("copyFieldToDisplayFrame");
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
                setName(beName);
            }});
            if (tzBusentity == null) {
                throw new RuntimeException("BE不存在");
            }
            String beId = tzBusentity.getId();

            // Form
            String dispFrameFormId = nextDispFrameId();
            // 插入展示框架表
            TzDispframe tzDispframeForm = new TzDispframe(dispFrameFormId, beId, beName, beName + "Form" + datasetFlg, "Form", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag1 = tzDispframeMapper.insertSelective(tzDispframeForm);
            if (flag1 != 1) {
                throw new RuntimeException("展示框架" + "Form" + datasetFlg +"插入失败");
            }
            copyFieldElement(dispFrameFormId, beId, tzBusentity.getName(), "Form");

            // List
            String dispFrameListId = nextDispFrameId();
            // 插入展示框架表
            TzDispframe tzDispframeList = new TzDispframe(dispFrameListId, beId, beName, beName + "List" + datasetFlg, "List", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag2 = tzDispframeMapper.insertSelective(tzDispframeList);
            if (flag2 != 1) {
                throw new RuntimeException("展示框架" + "List" + datasetFlg +"插入失败");
            }
            copyFieldElement(dispFrameListId, beId, tzBusentity.getName(), "List");
            // 配置字段跳转
            TzDispframeElement NameDispElement = tzDispframeElementMapper.selectOne(new TzDispframeElement() {{
                setDispframeId(tzDispframeList.getId());
                setName("Name");
            }});
            TzField idField = tzFieldMapper.selectOne(new TzField() {{
                setBusentityId(beId);
                setName("Id");
            }});
            NameDispElement.setFldDrilldown("Y");
            NameDispElement.setDrilldownSourceId(idField.getId());
            tzDispframeElementMapper.updateByPrimaryKeySelective(NameDispElement);
            // 配置跳转
            TzDispframeFlddrilldown tzDispframeFlddrilldown = new TzDispframeFlddrilldown(nextDispFrameFldJumpId(), NameDispElement.getId(), 1L, null, DetailComponentId, null, null, 1, admin, date, admin, date);
            tzDispframeFlddrilldownMapper.insertSelective(tzDispframeFlddrilldown);

            // 配置list按钮元素
            if (add) {
                TzDispframeElement tzDispframeElementButton = new TzDispframeElement();
                tzDispframeElementButton.setId(nextDispFrameElementId());
                tzDispframeElementButton.setDispframeId(tzDispframeList.getId());
                tzDispframeElementButton.setType("Button");
                tzDispframeElementButton.setName("add");
                tzDispframeElementButton.setButtonCode("add");
                tzDispframeElementButton.setButtonTriggerFrameid(tzDispframeForm.getId());
                tzDispframeElementMapper.insertSelective(tzDispframeElementButton);
            }
            if (edit) {
                TzDispframeElement tzDispframeElementButton = new TzDispframeElement();
                tzDispframeElementButton.setId(nextDispFrameElementId());
                tzDispframeElementButton.setDispframeId(tzDispframeList.getId());
                tzDispframeElementButton.setType("Button");
                tzDispframeElementButton.setName("edit");
                tzDispframeElementButton.setButtonCode("edit");
                tzDispframeElementButton.setButtonTriggerFrameid(tzDispframeForm.getId());
                tzDispframeElementMapper.insertSelective(tzDispframeElementButton);
            }
            if (del) {
                TzDispframeElement tzDispframeElementButton = new TzDispframeElement();
                tzDispframeElementButton.setId(nextDispFrameElementId());
                tzDispframeElementButton.setDispframeId(tzDispframeList.getId());
                tzDispframeElementButton.setType("Button");
                tzDispframeElementButton.setName("del");
                tzDispframeElementButton.setButtonCode("del");
                tzDispframeElementButton.setButtonTriggerFrameid(null);
                tzDispframeElementMapper.insertSelective(tzDispframeElementButton);
            }
            if (search) {
                TzDispframeElement tzDispframeElementButton = new TzDispframeElement();
                tzDispframeElementButton.setId(nextDispFrameElementId());
                tzDispframeElementButton.setDispframeId(tzDispframeList.getId());
                tzDispframeElementButton.setType("Button");
                tzDispframeElementButton.setName("query");
                tzDispframeElementButton.setButtonCode("query");
                tzDispframeElementButton.setButtonTriggerFrameid(filterId);
                tzDispframeElementMapper.insertSelective(tzDispframeElementButton);
            }

            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
    }

    private String nextDispFrameId() {
        return dispFrameIdpre + String.format("%0" + (idNum-dispFrameIdpre.length()) + "d", dispFrameIdA++);
    }
    private String nextDispFrameElementId() {
        return dispFrameElementIdpre + String.format("%0" + (idNum-dispFrameElementIdpre.length()) + "d", dispFrameElementIdA++);
    }
    private String nextDispFrameFldJumpId() {
        return dispFrameFldJumpIdpre + String.format("%0" + (idNum-dispFrameFldJumpIdpre.length()) + "d", dispFrameFldJumpIdA++);
    }

    /**
     * 根据be名称添加ListAdmin展示框架和展示框架元素
     */
    @Test
    public void copyDisplayFrameListByBeName() {
        String beName = "TZClass";
        String dispFrameId = null;

        DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setName("copyFieldToDisplayFrame");
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
                setName(beName);
            }});
            if (tzBusentity == null) {
                throw new RuntimeException("BE不存在");
            }
            String beId = tzBusentity.getId();

            // 插入展示框架表
            dispFrameId = dispFrameIdpre + String.format("%0" + (idNum-dispFrameIdpre.length()) + "d", dispFrameIdA++);
            TzDispframe tzDispframe = new TzDispframe(dispFrameId, beId, beName, beName + "ListAdmin", "List", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag1 = tzDispframeMapper.insertSelective(tzDispframe);
            if (flag1 != 1) {
                throw new RuntimeException("展示框架ListAdmin插入失败");
            }

            copyFieldElement(dispFrameId, beId, tzBusentity.getName(), "List");
            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
    }


    /**
     * 根据be名称和展示框架ID添加字段展示框架元素
     */
    @Test
    public void copyFieldToDisplayFrame() {
        String beName = "TZStudent";
        String dispFrameId = "152495817031682";

        DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setName("copyFieldToDisplayFrame");
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
                setName(beName);
            }});
            String beId = tzBusentity.getId();

            TzDispframe tzDispframe = tzDispframeMapper.selectByPrimaryKey(dispFrameId);
            if (!StringUtils.equals(tzDispframe.getBeId(), beId)) {
                throw new RuntimeException("数据不匹配");
            }

            copyFieldElement(dispFrameId, beId, tzBusentity.getName(), "List");
            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
    }

    /**
     * 给对应的展示框架添加字段配置
     * @param dispFrameId
     * @param beId
     * @param beName
     * @param type
     */
    private void copyFieldElement(String dispFrameId, String beId, String beName, String type) {

        List<TzField> fieldList = tzFieldMapper.select(new TzField() {{
            setBusentityId(beId);
        }});

        AtomicInteger seqNum = new AtomicInteger();
        List<TzDispframeElement> tzDispframeElementList = fieldList.stream().map(field -> {
            String id = nextDispFrameElementId();
            TzDispframeElement tzDispframeElement = new TzDispframeElement(id, dispFrameId, field.getName(), "Field", field.getId(), field.getDataType(), field.getTextlen(), field.getPrecNum(), field.getScale(), field.getRequired(), StringUtils.isBlank(field.getControlType()) ? "string" : field.getControlType(), field.getTransformCode(), field.getPtBename(), null, "N", "N", "N", "N", null, beName + "." + field.getName(), null, null, null, seqNum.incrementAndGet(), null, 1, admin, date, admin, date);
            if (StringUtils.equalsIgnoreCase(type, "List")) {
                if (StringUtils.equalsAny(field.getName(), "Id", "CreatedByName", "ModificationNumber", "Created", "CreatedBy", "LastUpd", "LastUpdBy")) {
                    tzDispframeElement.setFldHide("Y");
                }
            } else if (StringUtils.equalsIgnoreCase(type, "Form")) {
                if (StringUtils.equalsAny(field.getName(), "Id", "ModificationNumber", "CreatedBy", "LastUpd", "LastUpdBy")) {
                    tzDispframeElement.setFldHide("Y");
                }
                if (StringUtils.equalsAny(field.getName(), "CreatedByName", "Created")) {
                    tzDispframeElement.setFldReadonly("Y");
                }
            }

            /*if (StringUtils.equals(field.getName(), "Name")) {
                tzDispframeElement.setFldDrilldown("Y");
            }*/

            return tzDispframeElement;
        }).collect(Collectors.toList());
        for (TzDispframeElement tzDispframeElement : tzDispframeElementList) {
            int flag = tzDispframeElementMapper.insert(tzDispframeElement);
            if (flag != 1) {
                throw new RuntimeException("失败");
            }
        }
    }

    @Test
    public void test() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i = atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
        System.out.println(i);

        System.out.println(SnowFlake.getSnowFlakeGenerator().nextId());

    }

}
