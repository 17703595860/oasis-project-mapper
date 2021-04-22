package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_ACCOUNT")
public class TzAccount {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户类型
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 标识符类型
     */
    @Column(name = "IDENTITY_TYPE")
    private String identityType;

    /**
     * 标识符
     */
    @Column(name = "IDENTIFIER")
    private String identifier;

    /**
     * 凭证
     */
    @Column(name = "CERTIFICATE")
    private String certificate;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

    /**
     * 是否验证通过	0-不可用 1-可用
     */
    @Column(name = "VERIFY")
    private Byte verify;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

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
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户类型
     *
     * @return USER_TYPE - 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取标识符类型
     *
     * @return IDENTITY_TYPE - 标识符类型
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * 设置标识符类型
     *
     * @param identityType 标识符类型
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * 获取标识符
     *
     * @return IDENTIFIER - 标识符
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置标识符
     *
     * @param identifier 标识符
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * 获取凭证
     *
     * @return CERTIFICATE - 凭证
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * 设置凭证
     *
     * @param certificate 凭证
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * 获取是否可用	0-不可用 1-可用
     *
     * @return AVAILABLE - 是否可用	0-不可用 1-可用
     */
    public Byte getAvailable() {
        return available;
    }

    /**
     * 设置是否可用	0-不可用 1-可用
     *
     * @param available 是否可用	0-不可用 1-可用
     */
    public void setAvailable(Byte available) {
        this.available = available;
    }

    /**
     * 获取是否验证通过	0-不可用 1-可用
     *
     * @return VERIFY - 是否验证通过	0-不可用 1-可用
     */
    public Byte getVerify() {
        return verify;
    }

    /**
     * 设置是否验证通过	0-不可用 1-可用
     *
     * @param verify 是否验证通过	0-不可用 1-可用
     */
    public void setVerify(Byte verify) {
        this.verify = verify;
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
     * @return CREATED_BY
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return CREATED
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return LAST_UPD_BY
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * @param lastUpdBy
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * @return LAST_UPD
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * @param lastUpd
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}