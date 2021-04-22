package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_PT_DEF")
public class TzPtDef {
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
     * PT名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 业务组件
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * 其他查询条件
     */
    @Column(name = "SEARCHSPEC")
    private String searchspec;

    /**
     * 数据权限
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * PtLable字段
     */
    @Column(name = "LABEL_FIELD")
    private String labelField;

    /**
     * PtValue字段
     */
    @Column(name = "VALUE_FIELD")
    private String valueField;

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
     * 获取PT名称
     *
     * @return NAME - PT名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置PT名称
     *
     * @param name PT名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取业务组件
     *
     * @return BE_ID - 业务组件
     */
    public String getBeId() {
        return beId;
    }

    /**
     * 设置业务组件
     *
     * @param beId 业务组件
     */
    public void setBeId(String beId) {
        this.beId = beId;
    }

    /**
     * 获取其他查询条件
     *
     * @return SEARCHSPEC - 其他查询条件
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * 设置其他查询条件
     *
     * @param searchspec 其他查询条件
     */
    public void setSearchspec(String searchspec) {
        this.searchspec = searchspec;
    }

    /**
     * 获取数据权限
     *
     * @return DATASET_ID - 数据权限
     */
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * 设置数据权限
     *
     * @param datasetId 数据权限
     */
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * 获取PtLable字段
     *
     * @return LABEL_FIELD - PtLable字段
     */
    public String getLabelField() {
        return labelField;
    }

    /**
     * 设置PtLable字段
     *
     * @param labelField PtLable字段
     */
    public void setLabelField(String labelField) {
        this.labelField = labelField;
    }

    /**
     * 获取PtValue字段
     *
     * @return VALUE_FIELD - PtValue字段
     */
    public String getValueField() {
        return valueField;
    }

    /**
     * 设置PtValue字段
     *
     * @param valueField PtValue字段
     */
    public void setValueField(String valueField) {
        this.valueField = valueField;
    }
}