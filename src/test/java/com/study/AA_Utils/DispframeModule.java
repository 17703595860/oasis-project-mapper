package com.study.AA_Utils;

import com.study.entity.*;
import com.study.mapper.*;
import com.study.utils.SnowFlake;
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
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;
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
    @Autowired
    private TzFilterDfnMapper tzFilterDfnMapper;
    @Autowired
    private TzJoinMapper tzJoinMapper;
    @Autowired
    private TzJoinSpecMapper tzJoinSpecMapper;


    String admin = "ADMIN0000000000001";
    Date date = new Date();
    Integer idNum = 18;

    private String dispFrameIdpre = "cmsDispFrame000";
    private String dispFrameElementIdpre = "cmsDispEl000000";
    private String dispFrameFldJumpIdpre = "cmsDispJump0000";

    private Integer dispFrameIdA = 1;
    private Integer dispFrameElementIdA = 1;
    private Integer dispFrameFldJumpIdA = 1;

    private List<String> dispFrameIdInsertList = new ArrayList<>();
    private List<String> dispFrameElementIdInsertList = new ArrayList<>();
    private List<String> dispFrameFldJumpIdInsertList = new ArrayList<>();

    String beName = "TZOrgSite";
    String datasetFlg = "Admin";
    String filterName = "TZOrgSiteFilter";

    boolean jumpFlag = true;
    String DetailComponentId = "cmsCOM000000000002";

    boolean add = true;
    boolean edit = true;
    boolean search = true;
    boolean del = true;

    // ?????????????????????
    private String module = "cms";
    private boolean fileFlag = false;
    private String descFilePath = "D:/??????/sql/";
    private boolean transactionCommit = false;

    /**
     * ??????be????????????ListAdmin?????????????????????????????????
     */
    @Test
    public void copyDisplayFrameAllByBeName() {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setName("copyFieldToDisplayFrame");
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            TzBusentity tzBusentity = tzBusentityMapper.selectOne(new TzBusentity() {{
                setName(beName);
            }});
            if (tzBusentity == null) {
                throw new RuntimeException("BE?????????");
            }
            String beId = tzBusentity.getId();

            // Form
            String dispFrameFormId = nextDispFrameId();
            // ?????????????????????
            TzDispframe tzDispframeForm = new TzDispframe(dispFrameFormId, beId, beName, beName + "Form" + datasetFlg, "Form", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag1 = tzDispframeMapper.insertSelective(tzDispframeForm);
            if (flag1 != 1) {
                throw new RuntimeException("????????????" + "Form" + datasetFlg +"????????????");
            }
            copyFieldElement(dispFrameFormId, beId, tzBusentity.getName(), "Form");

            // List
            String dispFrameListId = nextDispFrameId();
            // ?????????????????????
            TzDispframe tzDispframeList = new TzDispframe(dispFrameListId, beId, beName, beName + "List" + datasetFlg, "List", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag2 = tzDispframeMapper.insertSelective(tzDispframeList);
            if (flag2 != 1) {
                throw new RuntimeException("????????????" + "List" + datasetFlg +"????????????");
            }
            copyFieldElement(dispFrameListId, beId, tzBusentity.getName(), "List");

            if (jumpFlag) {
                // ??????????????????
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
                // ????????????
                TzDispframeFlddrilldown tzDispframeFlddrilldown = new TzDispframeFlddrilldown(nextDispFrameFldJumpId(), NameDispElement.getId(), 1L, null, DetailComponentId, null, null, 1, admin, date, admin, date);
                tzDispframeFlddrilldownMapper.insertSelective(tzDispframeFlddrilldown);
            }

            // ??????list????????????
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

                TzFilterDfn tzFilterDfn = tzFilterDfnMapper.selectOne(new TzFilterDfn() {{
                    setName(filterName);
                }});
                String filterId = tzFilterDfn.getId();

                TzDispframeElement tzDispframeElementButton = new TzDispframeElement();
                tzDispframeElementButton.setId(nextDispFrameElementId());
                tzDispframeElementButton.setDispframeId(tzDispframeList.getId());
                tzDispframeElementButton.setType("Button");
                tzDispframeElementButton.setName("query");
                tzDispframeElementButton.setButtonCode("query");
                tzDispframeElementButton.setButtonTriggerFrameid(filterId);
                tzDispframeElementMapper.insertSelective(tzDispframeElementButton);
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
        addframe(srcFilePath);
    }

    private void addframe(String srcFilePath) {
        String filePath = srcFilePath + "10-DISPFRAME.sql";
        if (new File(filePath).exists()) {
            new File(filePath).delete();
        }
        if (CollectionUtils.isEmpty(dispFrameIdInsertList)) {
            return;
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            String beId = tzBusentityMapper.selectOne(new TzBusentity() {{
                setName(beName);
            }}).getId();

            bw.write("delete from TZ_DISPFRAME_FLDDRILLDOWN where DISPFRAME_DTL_ID in (select ID from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('" + beId + "')));");
            bw.newLine();
            bw.write("delete from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('" + beId + "'));");
            bw.newLine();
            bw.write("delete from TZ_DISPFRAME where BE_ID in ('" + beId + "');");
            bw.newLine();bw.newLine();

            // ??????frame
            List<TzDispframe> tzDispframeList = tzDispframeMapper.selectByIds(StringUtils.join(dispFrameIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
            List<Map<String, List<String>>> objList = tzDispframeList.stream().map(this::getColAndVal).collect(Collectors.toList());
            createSql(objList, "TZ_DISPFRAME", bw);
            // ??????frameElement
            List<TzDispframeElement> tzDispframeElementList = tzDispframeElementMapper.selectByIds(StringUtils.join(dispFrameElementIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
            objList = tzDispframeElementList.stream().map(this::getColAndVal).collect(Collectors.toList());
            createSql(objList, "TZ_DISPFRAME_ELEMENT", bw);
            // ??????frameFldJump
            List<TzDispframeFlddrilldown> dispframeFlddrilldownList = tzDispframeFlddrilldownMapper.selectByIds(StringUtils.join(dispFrameFldJumpIdInsertList.stream().map(e -> "'" + e + "'").collect(Collectors.toList()), ","));
            objList = dispframeFlddrilldownList.stream().map(this::getColAndVal).collect(Collectors.toList());
            createSql(objList, "TZ_DISPFRAME_FLDDRILLDOWN", bw);
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
                    throw new RuntimeException("?????????????????????");
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

    private String nextDispFrameId() {
        String frameId = dispFrameIdpre + String.format("%0" + (idNum - dispFrameIdpre.length()) + "d", dispFrameIdA++);
        dispFrameIdInsertList.add(frameId);
        return frameId;
    }
    private String nextDispFrameElementId() {
        String dispframeElementId = dispFrameElementIdpre + String.format("%0" + (idNum - dispFrameElementIdpre.length()) + "d", dispFrameElementIdA++);
        dispFrameElementIdInsertList.add(dispframeElementId);
        return dispframeElementId;
    }
    private String nextDispFrameFldJumpId() {
        String dispframeFldJumpId = dispFrameFldJumpIdpre + String.format("%0" + (idNum - dispFrameFldJumpIdpre.length()) + "d", dispFrameFldJumpIdA++);
        dispFrameFldJumpIdInsertList.add(dispframeFldJumpId);
        return dispframeFldJumpId;
    }

    /**
     * ??????be????????????ListAdmin?????????????????????????????????
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
                throw new RuntimeException("BE?????????");
            }
            String beId = tzBusentity.getId();

            // ?????????????????????
            dispFrameId = dispFrameIdpre + String.format("%0" + (idNum-dispFrameIdpre.length()) + "d", dispFrameIdA++);
            TzDispframe tzDispframe = new TzDispframe(dispFrameId, beId, beName, beName + "ListAdmin", "List", beName + "." + beName, null, null, null, 1, admin, date, admin, date);
            int flag1 = tzDispframeMapper.insertSelective(tzDispframe);
            if (flag1 != 1) {
                throw new RuntimeException("????????????ListAdmin????????????");
            }

            copyFieldElement(dispFrameId, beId, tzBusentity.getName(), "List");
            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
    }


    /**
     * ??????be?????????????????????ID??????????????????????????????
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
                throw new RuntimeException("???????????????");
            }

            copyFieldElement(dispFrameId, beId, tzBusentity.getName(), "List");
            transactionManager.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback(status);
        }
    }

    /**
     * ??????????????????????????????????????????
     * @param dispFrameId
     * @param beId
     * @param beName
     * @param type
     */
    private void copyFieldElement(String dispFrameId, String beId, String beName, String type) {

        Example fieldExample = new Example(TzField.class);
        Example.Criteria fieldCriteria = fieldExample.createCriteria();
        fieldCriteria.andEqualTo("busentityId", beId);
        fieldExample.orderBy("id").asc();
        List<TzField> fieldList = tzFieldMapper.selectByExample(fieldExample);

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

        // ??????????????????
        List<TzField> joinFieldList = fieldList.stream().filter(e -> StringUtils.isNotBlank(e.getJoinName())).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(joinFieldList)) {
            for (TzField joinField : joinFieldList) {
                if (joinField.getName().equals("CreatedByName")){
                    continue;
                }
                // ??????????????????????????????????????????????????????????????????????????????????????????????????????
                if (StringUtils.equalsIgnoreCase(type, "List")) {
                    TzJoin tzJoin = tzJoinMapper.selectOne(new TzJoin() {{
                        setBusentityId(joinField.getBusentityId());
                        setName(joinField.getJoinName());
                    }});
                    if (tzJoin == null || StringUtils.isBlank(tzJoin.getId())) throw new RuntimeException("join??????" + joinField.getName() + "????????????");
                    Example example = new Example(TzJoinSpec.class);
                    Example.Criteria criteria = example.createCriteria();
                    criteria.andEqualTo("joinId", tzJoin.getId());
                    example.orderBy("id").asc();
                    List<TzJoinSpec> tzJoinSpecList = tzJoinSpecMapper.selectByExample(example);
                    Integer seq = Integer.MAX_VALUE;
                    if (CollectionUtils.isEmpty(tzJoinSpecList)) throw new RuntimeException("join??????" + joinField.getName() + "????????????");
                    for (TzJoinSpec joinSpec : tzJoinSpecList) {
                        List<TzField> ownFieldList = fieldList.stream().filter(e -> e.getName().equals(joinSpec.getSrcFldName()) && StringUtils.isBlank(e.getJoinName())).collect(Collectors.toList());
                        if (!CollectionUtils.isEmpty(ownFieldList)) {
                            TzField ownField = ownFieldList.get(0);
                            if (ownField != null) {
                                TzDispframeElement dispframeElement = tzDispframeElementList.stream().filter(e -> e.getFieldId().equals(ownField.getId())).collect(Collectors.toList()).get(0);
                                dispframeElement.setFldHide("Y");
                                if (dispframeElement.getDisplayOrder() < seq) {
                                    seq = dispframeElement.getDisplayOrder();
                                }
                            }
                        }
                    }
                    // ?????????????????????????????????
                    if (!seq.equals(Integer.MAX_VALUE)) {
                        TzDispframeElement dispframeElement = tzDispframeElementList.stream().filter(e -> e.getFieldId().equals(joinField.getId())).collect(Collectors.toList()).get(0);
                        dispframeElement.setFldHide("N");
                        dispframeElement.setDisplayOrder(seq);
                    }

                } else if (StringUtils.equalsIgnoreCase(type, "Form")) {
                    TzDispframeElement dispframeElement = tzDispframeElementList.stream().filter(e -> e.getFieldId().equals(joinField.getId())).collect(Collectors.toList()).get(0);
                    dispframeElement.setFldHide("Y");
                }
            }
        }

        for (TzDispframeElement tzDispframeElement : tzDispframeElementList) {
            int flag = tzDispframeElementMapper.insert(tzDispframeElement);
            if (flag != 1) {
                throw new RuntimeException("??????");
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
