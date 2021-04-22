package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_PERSON_ADDRESS")
public class TzPersonAddress {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 人员Id
     */
    @Column(name = "PERSON_ID")
    private String personId;

    /**
     * 是否为主要地址，1-是 0-否
     */
    @Column(name = "IS_PRIMARY")
    private Byte isPrimary;

    /**
     * 地址ID
     */
    @Column(name = "ADDRESS_ID")
    private String addressId;

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
     * 获取人员Id
     *
     * @return PERSON_ID - 人员Id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 设置人员Id
     *
     * @param personId 人员Id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 获取是否为主要地址，1-是 0-否
     *
     * @return IS_PRIMARY - 是否为主要地址，1-是 0-否
     */
    public Byte getIsPrimary() {
        return isPrimary;
    }

    /**
     * 设置是否为主要地址，1-是 0-否
     *
     * @param isPrimary 是否为主要地址，1-是 0-否
     */
    public void setIsPrimary(Byte isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * 获取地址ID
     *
     * @return ADDRESS_ID - 地址ID
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 设置地址ID
     *
     * @param addressId 地址ID
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
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