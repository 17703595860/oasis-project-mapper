package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_BMENTITY_DATASET")
public class TzBmentityDataset {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * BMENTITY表外键
     */
    @Column(name = "BMENTITY_ID")
    private String bmentityId;

    /**
     * 数据集类型
     */
    @Column(name = "DATASET_TYPE")
    private String datasetType;

    /**
     * 数据集ID
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 数据集展现字段方案id
     */
    @Column(name = "DISPSCHEME_ID")
    private String dispschemeId;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 是否有效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 获取BMENTITY表外键
     *
     * @return BMENTITY_ID - BMENTITY表外键
     */
    public String getBmentityId() {
        return bmentityId;
    }

    /**
     * 设置BMENTITY表外键
     *
     * @param bmentityId BMENTITY表外键
     */
    public void setBmentityId(String bmentityId) {
        this.bmentityId = bmentityId;
    }

    /**
     * 获取数据集类型
     *
     * @return DATASET_TYPE - 数据集类型
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * 设置数据集类型
     *
     * @param datasetType 数据集类型
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * 获取数据集ID
     *
     * @return DATASET_ID - 数据集ID
     */
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * 设置数据集ID
     *
     * @param datasetId 数据集ID
     */
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * 获取数据集展现字段方案id
     *
     * @return DISPSCHEME_ID - 数据集展现字段方案id
     */
    public String getDispschemeId() {
        return dispschemeId;
    }

    /**
     * 设置数据集展现字段方案id
     *
     * @param dispschemeId 数据集展现字段方案id
     */
    public void setDispschemeId(String dispschemeId) {
        this.dispschemeId = dispschemeId;
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
     * 获取是否有效
     *
     * @return ACTIVE_FLG - 是否有效
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置是否有效
     *
     * @param activeFlg 是否有效
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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