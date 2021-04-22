package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_CERTIFICATE")
public class TzCertificate {
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
     * 证件类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 证件号
     */
    @Column(name = "NUMBER")
    private String number;

    /**
     * 生效日期
     */
    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    /**
     * 失效日期
     */
    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;

    /**
     * 发证机构
     */
    @Column(name = "CA")
    private String ca;

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
     * 获取证件类型
     *
     * @return TYPE - 证件类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置证件类型
     *
     * @param type 证件类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取证件号
     *
     * @return NUMBER - 证件号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置证件号
     *
     * @param number 证件号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取生效日期
     *
     * @return EFFECTIVE_DATE - 生效日期
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取失效日期
     *
     * @return EXPIRY_DATE - 失效日期
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置失效日期
     *
     * @param expiryDate 失效日期
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * 获取发证机构
     *
     * @return CA - 发证机构
     */
    public String getCa() {
        return ca;
    }

    /**
     * 设置发证机构
     *
     * @param ca 发证机构
     */
    public void setCa(String ca) {
        this.ca = ca;
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