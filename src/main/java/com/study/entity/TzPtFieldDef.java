package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_PT_FIELD_DEF")
public class TzPtFieldDef {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

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
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * PT
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 是否展示
     */
    @Column(name = "DISPLAY_FLG")
    private String displayFlg;

    /**
     * 展示顺序
     */
    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    /**
     * 展示名称
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * field字段对应tagCode
     */
    @Column(name = "TAG_CODE")
    private String tagCode;

    /**
     * 是否作为PT上的搜索条件
     */
    @Column(name = "SEARCH_FLG")
    private String searchFlg;

    /**
     * 前端控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 对应转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

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
     * 获取PT
     *
     * @return PT_DEF_ID - PT
     */
    public String getPtDefId() {
        return ptDefId;
    }

    /**
     * 设置PT
     *
     * @param ptDefId PT
     */
    public void setPtDefId(String ptDefId) {
        this.ptDefId = ptDefId;
    }

    /**
     * 获取字段ID
     *
     * @return FIELD_ID - 字段ID
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * 设置字段ID
     *
     * @param fieldId 字段ID
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取是否展示
     *
     * @return DISPLAY_FLG - 是否展示
     */
    public String getDisplayFlg() {
        return displayFlg;
    }

    /**
     * 设置是否展示
     *
     * @param displayFlg 是否展示
     */
    public void setDisplayFlg(String displayFlg) {
        this.displayFlg = displayFlg;
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
     * 获取展示名称
     *
     * @return DISPLAY_NAME - 展示名称
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置展示名称
     *
     * @param displayName 展示名称
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 获取field字段对应tagCode
     *
     * @return TAG_CODE - field字段对应tagCode
     */
    public String getTagCode() {
        return tagCode;
    }

    /**
     * 设置field字段对应tagCode
     *
     * @param tagCode field字段对应tagCode
     */
    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    /**
     * 获取是否作为PT上的搜索条件
     *
     * @return SEARCH_FLG - 是否作为PT上的搜索条件
     */
    public String getSearchFlg() {
        return searchFlg;
    }

    /**
     * 设置是否作为PT上的搜索条件
     *
     * @param searchFlg 是否作为PT上的搜索条件
     */
    public void setSearchFlg(String searchFlg) {
        this.searchFlg = searchFlg;
    }

    /**
     * 获取前端控件类型
     *
     * @return CONTROL_TYPE - 前端控件类型
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置前端控件类型
     *
     * @param controlType 前端控件类型
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * 获取对应转换值
     *
     * @return TRANSFORM_CODE - 对应转换值
     */
    public String getTransformCode() {
        return transformCode;
    }

    /**
     * 设置对应转换值
     *
     * @param transformCode 对应转换值
     */
    public void setTransformCode(String transformCode) {
        this.transformCode = transformCode;
    }
}