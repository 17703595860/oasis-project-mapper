package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILTER_PT_FLD")
public class TzFilterPtFld {
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
     * 可配置搜索字段ID
     */
    @Column(name = "FILTER_FLD_ID")
    private String filterFldId;

    /**
     * Prompt定义id
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 可配置查询BE字段ID
     */
    @Column(name = "SRC_FLD_ID")
    private String srcFldId;

    /**
     * PromptBE的字段ID号
     */
    @Column(name = "DEST_FLD_ID")
    private String destFldId;

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
     * 获取可配置搜索字段ID
     *
     * @return FILTER_FLD_ID - 可配置搜索字段ID
     */
    public String getFilterFldId() {
        return filterFldId;
    }

    /**
     * 设置可配置搜索字段ID
     *
     * @param filterFldId 可配置搜索字段ID
     */
    public void setFilterFldId(String filterFldId) {
        this.filterFldId = filterFldId;
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
     * 获取可配置查询BE字段ID
     *
     * @return SRC_FLD_ID - 可配置查询BE字段ID
     */
    public String getSrcFldId() {
        return srcFldId;
    }

    /**
     * 设置可配置查询BE字段ID
     *
     * @param srcFldId 可配置查询BE字段ID
     */
    public void setSrcFldId(String srcFldId) {
        this.srcFldId = srcFldId;
    }

    /**
     * 获取PromptBE的字段ID号
     *
     * @return DEST_FLD_ID - PromptBE的字段ID号
     */
    public String getDestFldId() {
        return destFldId;
    }

    /**
     * 设置PromptBE的字段ID号
     *
     * @param destFldId PromptBE的字段ID号
     */
    public void setDestFldId(String destFldId) {
        this.destFldId = destFldId;
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