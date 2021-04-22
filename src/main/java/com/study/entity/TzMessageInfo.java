package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_MESSAGE_INFO")
@NoArgsConstructor
@AllArgsConstructor
public class TzMessageInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 消息集合ID
     */
    @Column(name = "COLLECTION_ID")
    private String collectionId;

    /**
     * 语言
     */
    @Column(name = "LANGUAGE")
    private String language;

    /**
     * 消息CODE
     */
    @Column(name = "MESSAGE_CODE")
    private String messageCode;

    /**
     * 标签CODE
     */
    @Column(name = "TAG_CODE")
    private String tagCode;

    /**
     * 消息描述
     */
    @Column(name = "MESSAGE_DESC")
    private String messageDesc;

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
     * 获取消息集合ID
     *
     * @return COLLECTION_ID - 消息集合ID
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * 设置消息集合ID
     *
     * @param collectionId 消息集合ID
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 获取语言
     *
     * @return LANGUAGE - 语言
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置语言
     *
     * @param language 语言
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取消息CODE
     *
     * @return MESSAGE_CODE - 消息CODE
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * 设置消息CODE
     *
     * @param messageCode 消息CODE
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    /**
     * 获取标签CODE
     *
     * @return TAG_CODE - 标签CODE
     */
    public String getTagCode() {
        return tagCode;
    }

    /**
     * 设置标签CODE
     *
     * @param tagCode 标签CODE
     */
    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    /**
     * 获取消息描述
     *
     * @return MESSAGE_DESC - 消息描述
     */
    public String getMessageDesc() {
        return messageDesc;
    }

    /**
     * 设置消息描述
     *
     * @param messageDesc 消息描述
     */
    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
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