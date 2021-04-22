package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DISPFRAME_ELEMENT")
@AllArgsConstructor
@NoArgsConstructor
public class TzDispframeElement {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 数据集展现字段方案Id
     */
    @Column(name = "DISPFRAME_ID")
    private String dispframeId;

    /**
     * 元素名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 展现元素类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 字段Id
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 字段类型
     */
    @Column(name = "DATA_TYPE")
    private String dataType;

    /**
     * 字符长度
     */
    @Column(name = "TEXTLEN")
    private Integer textlen;

    /**
     * 数字型位数
     */
    @Column(name = "PREC_NUM")
    private Integer precNum;

    /**
     * 小数型位数
     */
    @Column(name = "SCALE")
    private Integer scale;

    /**
     * 是否必须
     */
    @Column(name = "FLD_REQUIRED")
    private String fldRequired;

    /**
     * 控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

    /**
     * PT对应BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * PormptId
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 是否只读
     */
    @Column(name = "FLD_READONLY")
    private String fldReadonly;

    /**
     * 是否隐藏
     */
    @Column(name = "FLD_HIDE")
    private String fldHide;

    /**
     * 是否下拉框
     */
    @Column(name = "FLD_ISDOWN")
    private String fldIsdown;

    /**
     * 是否跳转
     */
    @Column(name = "FLD_DRILLDOWN")
    private String fldDrilldown;

    /**
     * 跳转带过去的源ID字段
     */
    @Column(name = "DRILLDOWN_SOURCE_ID")
    private String drilldownSourceId;

    /**
     * 消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * buttonId
     */
    @Column(name = "BUTTON_CODE")
    private String buttonCode;

    /**
     * 点击弹出的页面框架
     */
    @Column(name = "BUTTON_TRIGGER_FRAMEID")
    private String buttonTriggerFrameid;

    /**
     * 展示顺序
     */
    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATED")
    private Date created;

    /**
     * 修改人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 修改时间
     */
    @Column(name = "LAST_UPD")
    private Date lastUpd;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取数据集展现字段方案Id
     *
     * @return DISPFRAME_ID - 数据集展现字段方案Id
     */
    public String getDispframeId() {
        return dispframeId;
    }

    /**
     * 设置数据集展现字段方案Id
     *
     * @param dispframeId 数据集展现字段方案Id
     */
    public void setDispframeId(String dispframeId) {
        this.dispframeId = dispframeId;
    }

    /**
     * 获取元素名称
     *
     * @return NAME - 元素名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置元素名称
     *
     * @param name 元素名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取展现元素类型
     *
     * @return TYPE - 展现元素类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置展现元素类型
     *
     * @param type 展现元素类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取字段Id
     *
     * @return FIELD_ID - 字段Id
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * 设置字段Id
     *
     * @param fieldId 字段Id
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取字段类型
     *
     * @return DATA_TYPE - 字段类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置字段类型
     *
     * @param dataType 字段类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取字符长度
     *
     * @return TEXTLEN - 字符长度
     */
    public Integer getTextlen() {
        return textlen;
    }

    /**
     * 设置字符长度
     *
     * @param textlen 字符长度
     */
    public void setTextlen(Integer textlen) {
        this.textlen = textlen;
    }

    /**
     * 获取数字型位数
     *
     * @return PREC_NUM - 数字型位数
     */
    public Integer getPrecNum() {
        return precNum;
    }

    /**
     * 设置数字型位数
     *
     * @param precNum 数字型位数
     */
    public void setPrecNum(Integer precNum) {
        this.precNum = precNum;
    }

    /**
     * 获取小数型位数
     *
     * @return SCALE - 小数型位数
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * 设置小数型位数
     *
     * @param scale 小数型位数
     */
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * 获取是否必须
     *
     * @return FLD_REQUIRED - 是否必须
     */
    public String getFldRequired() {
        return fldRequired;
    }

    /**
     * 设置是否必须
     *
     * @param fldRequired 是否必须
     */
    public void setFldRequired(String fldRequired) {
        this.fldRequired = fldRequired;
    }

    /**
     * 获取控件类型
     *
     * @return CONTROL_TYPE - 控件类型
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置控件类型
     *
     * @param controlType 控件类型
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * 获取转换值
     *
     * @return TRANSFORM_CODE - 转换值
     */
    public String getTransformCode() {
        return transformCode;
    }

    /**
     * 设置转换值
     *
     * @param transformCode 转换值
     */
    public void setTransformCode(String transformCode) {
        this.transformCode = transformCode;
    }

    /**
     * 获取PT对应BE名称
     *
     * @return PT_BENAME - PT对应BE名称
     */
    public String getPtBename() {
        return ptBename;
    }

    /**
     * 设置PT对应BE名称
     *
     * @param ptBename PT对应BE名称
     */
    public void setPtBename(String ptBename) {
        this.ptBename = ptBename;
    }

    /**
     * 获取PormptId
     *
     * @return PT_DEF_ID - PormptId
     */
    public String getPtDefId() {
        return ptDefId;
    }

    /**
     * 设置PormptId
     *
     * @param ptDefId PormptId
     */
    public void setPtDefId(String ptDefId) {
        this.ptDefId = ptDefId;
    }

    /**
     * 获取是否只读
     *
     * @return FLD_READONLY - 是否只读
     */
    public String getFldReadonly() {
        return fldReadonly;
    }

    /**
     * 设置是否只读
     *
     * @param fldReadonly 是否只读
     */
    public void setFldReadonly(String fldReadonly) {
        this.fldReadonly = fldReadonly;
    }

    /**
     * 获取是否隐藏
     *
     * @return FLD_HIDE - 是否隐藏
     */
    public String getFldHide() {
        return fldHide;
    }

    /**
     * 设置是否隐藏
     *
     * @param fldHide 是否隐藏
     */
    public void setFldHide(String fldHide) {
        this.fldHide = fldHide;
    }

    /**
     * 获取是否下拉框
     *
     * @return FLD_ISDOWN - 是否下拉框
     */
    public String getFldIsdown() {
        return fldIsdown;
    }

    /**
     * 设置是否下拉框
     *
     * @param fldIsdown 是否下拉框
     */
    public void setFldIsdown(String fldIsdown) {
        this.fldIsdown = fldIsdown;
    }

    /**
     * 获取是否跳转
     *
     * @return FLD_DRILLDOWN - 是否跳转
     */
    public String getFldDrilldown() {
        return fldDrilldown;
    }

    /**
     * 设置是否跳转
     *
     * @param fldDrilldown 是否跳转
     */
    public void setFldDrilldown(String fldDrilldown) {
        this.fldDrilldown = fldDrilldown;
    }

    /**
     * 获取跳转带过去的源ID字段
     *
     * @return DRILLDOWN_SOURCE_ID - 跳转带过去的源ID字段
     */
    public String getDrilldownSourceId() {
        return drilldownSourceId;
    }

    /**
     * 设置跳转带过去的源ID字段
     *
     * @param drilldownSourceId 跳转带过去的源ID字段
     */
    public void setDrilldownSourceId(String drilldownSourceId) {
        this.drilldownSourceId = drilldownSourceId;
    }

    /**
     * 获取消息CODE
     *
     * @return LABEL_MESSAGE_CODE - 消息CODE
     */
    public String getLabelMessageCode() {
        return labelMessageCode;
    }

    /**
     * 设置消息CODE
     *
     * @param labelMessageCode 消息CODE
     */
    public void setLabelMessageCode(String labelMessageCode) {
        this.labelMessageCode = labelMessageCode;
    }

    /**
     * 获取消息覆盖值
     *
     * @return LABEL_OVERRIDE - 消息覆盖值
     */
    public String getLabelOverride() {
        return labelOverride;
    }

    /**
     * 设置消息覆盖值
     *
     * @param labelOverride 消息覆盖值
     */
    public void setLabelOverride(String labelOverride) {
        this.labelOverride = labelOverride;
    }

    /**
     * 获取buttonId
     *
     * @return BUTTON_CODE - buttonId
     */
    public String getButtonCode() {
        return buttonCode;
    }

    /**
     * 设置buttonId
     *
     * @param buttonCode buttonId
     */
    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode;
    }

    /**
     * 获取点击弹出的页面框架
     *
     * @return BUTTON_TRIGGER_FRAMEID - 点击弹出的页面框架
     */
    public String getButtonTriggerFrameid() {
        return buttonTriggerFrameid;
    }

    /**
     * 设置点击弹出的页面框架
     *
     * @param buttonTriggerFrameid 点击弹出的页面框架
     */
    public void setButtonTriggerFrameid(String buttonTriggerFrameid) {
        this.buttonTriggerFrameid = buttonTriggerFrameid;
    }

    /**
     * 获取展示顺序
     *
     * @return DISPLAY_ORDER - 展示顺序
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 设置展示顺序
     *
     * @param displayOrder 展示顺序
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * 获取备注
     *
     * @return COMMENTS - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取修改记录号
     *
     * @return MODIFICATION_NUM - 修改记录号
     */
    public Integer getModificationNum() {
        return modificationNum;
    }

    /**
     * 设置修改记录号
     *
     * @param modificationNum 修改记录号
     */
    public void setModificationNum(Integer modificationNum) {
        this.modificationNum = modificationNum;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取修改人
     *
     * @return LAST_UPD_BY - 修改人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置修改人
     *
     * @param lastUpdBy 修改人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取修改时间
     *
     * @return LAST_UPD - 修改时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置修改时间
     *
     * @param lastUpd 修改时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}