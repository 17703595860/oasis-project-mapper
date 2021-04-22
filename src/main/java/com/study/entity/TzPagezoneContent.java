package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_PAGEZONE_CONTENT")
public class TzPagezoneContent {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * Page区块外键
     */
    @Column(name = "PAGEZONE_ID")
    private String pagezoneId;

    /**
     * 数据集ID
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 数据集顺序
     */
    @Column(name = "DATASET_SEQ")
    private Integer datasetSeq;

    /**
     * 展示框架外键
     */
    @Column(name = "DISPLAYFRAME_ID")
    private String displayframeId;

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
     * 获取Page区块外键
     *
     * @return PAGEZONE_ID - Page区块外键
     */
    public String getPagezoneId() {
        return pagezoneId;
    }

    /**
     * 设置Page区块外键
     *
     * @param pagezoneId Page区块外键
     */
    public void setPagezoneId(String pagezoneId) {
        this.pagezoneId = pagezoneId;
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
     * 获取数据集顺序
     *
     * @return DATASET_SEQ - 数据集顺序
     */
    public Integer getDatasetSeq() {
        return datasetSeq;
    }

    /**
     * 设置数据集顺序
     *
     * @param datasetSeq 数据集顺序
     */
    public void setDatasetSeq(Integer datasetSeq) {
        this.datasetSeq = datasetSeq;
    }

    /**
     * 获取展示框架外键
     *
     * @return DISPLAYFRAME_ID - 展示框架外键
     */
    public String getDisplayframeId() {
        return displayframeId;
    }

    /**
     * 设置展示框架外键
     *
     * @param displayframeId 展示框架外键
     */
    public void setDisplayframeId(String displayframeId) {
        this.displayframeId = displayframeId;
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