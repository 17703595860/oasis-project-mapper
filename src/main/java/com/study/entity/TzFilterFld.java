package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILTER_FLD")
public class TzFilterFld {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 可配置搜索ID
     */
    @Column(name = "FILTER_ID")
    private String filterId;

    /**
     * 元数据定义字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 元数据定义字段描述
     */
    @Column(name = "FIELD_DESC")
    private String fieldDesc;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 转换值编号
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

    /**
     * Prompt对应的BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * Prompt定义id
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
     * field字段对应tagCode
     */
    @Column(name = "FIELD_TAG_CODE")
    private String fieldTagCode;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 更新人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 更新时间
     */
    @Column(name = "LAST_UPD")
    private Date lastUpd;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取可配置搜索ID
     *
     * @return FILTER_ID - 可配置搜索ID
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * 设置可配置搜索ID
     *
     * @param filterId 可配置搜索ID
     */
    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * 获取元数据定义字段ID
     *
     * @return FIELD_ID - 元数据定义字段ID
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * 设置元数据定义字段ID
     *
     * @param fieldId 元数据定义字段ID
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取元数据定义字段描述
     *
     * @return FIELD_DESC - 元数据定义字段描述
     */
    public String getFieldDesc() {
        return fieldDesc;
    }

    /**
     * 设置元数据定义字段描述
     *
     * @param fieldDesc 元数据定义字段描述
     */
    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    /**
     * 获取排列顺序
     *
     * @return SEQ - 排列顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置排列顺序
     *
     * @param seq 排列顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取类型
     *
     * @return CONTROL_TYPE - 类型
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置类型
     *
     * @param controlType 类型
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * 获取转换值编号
     *
     * @return TRANSFORM_CODE - 转换值编号
     */
    public String getTransformCode() {
        return transformCode;
    }

    /**
     * 设置转换值编号
     *
     * @param transformCode 转换值编号
     */
    public void setTransformCode(String transformCode) {
        this.transformCode = transformCode;
    }

    /**
     * 获取Prompt对应的BE名称
     *
     * @return PT_BENAME - Prompt对应的BE名称
     */
    public String getPtBename() {
        return ptBename;
    }

    /**
     * 设置Prompt对应的BE名称
     *
     * @param ptBename Prompt对应的BE名称
     */
    public void setPtBename(String ptBename) {
        this.ptBename = ptBename;
    }

    /**
     * 获取Prompt定义id
     *
     * @return PT_DEF_ID - Prompt定义id
     */
    public String getPtDefId() {
        return ptDefId;
    }

    /**
     * 设置Prompt定义id
     *
     * @param ptDefId Prompt定义id
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
     * 获取field字段对应tagCode
     *
     * @return FIELD_TAG_CODE - field字段对应tagCode
     */
    public String getFieldTagCode() {
        return fieldTagCode;
    }

    /**
     * 设置field字段对应tagCode
     *
     * @param fieldTagCode field字段对应tagCode
     */
    public void setFieldTagCode(String fieldTagCode) {
        this.fieldTagCode = fieldTagCode;
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
     * 获取生效标识
     *
     * @return ACTIVE_FLG - 生效标识
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标识
     *
     * @param activeFlg 生效标识
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
     * 获取更新人
     *
     * @return LAST_UPD_BY - 更新人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdBy 更新人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取更新时间
     *
     * @return LAST_UPD - 更新时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpd 更新时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}