package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_MESSAGE_COLLECTION")
public class TzMessageCollection {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 消息集合码值
     */
    @Column(name = "COLLECTION_CODE")
    private String collectionCode;

    /**
     * 消息集合描述
     */
    @Column(name = "COLLECTION_DESC")
    private String collectionDesc;

    /**
     * 生效标志
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
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取消息集合码值
     *
     * @return COLLECTION_CODE - 消息集合码值
     */
    public String getCollectionCode() {
        return collectionCode;
    }

    /**
     * 设置消息集合码值
     *
     * @param collectionCode 消息集合码值
     */
    public void setCollectionCode(String collectionCode) {
        this.collectionCode = collectionCode;
    }

    /**
     * 获取消息集合描述
     *
     * @return COLLECTION_DESC - 消息集合描述
     */
    public String getCollectionDesc() {
        return collectionDesc;
    }

    /**
     * 设置消息集合描述
     *
     * @param collectionDesc 消息集合描述
     */
    public void setCollectionDesc(String collectionDesc) {
        this.collectionDesc = collectionDesc;
    }

    /**
     * 获取生效标志
     *
     * @return ACTIVE_FLG - 生效标志
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标志
     *
     * @param activeFlg 生效标志
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