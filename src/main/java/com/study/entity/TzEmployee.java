package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_EMPLOYEE")
public class TzEmployee {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户主要职位ID
     */
    @Column(name = "PR_POSTN_ID")
    private String prPostnId;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

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
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户主要职位ID
     *
     * @return PR_POSTN_ID - 用户主要职位ID
     */
    public String getPrPostnId() {
        return prPostnId;
    }

    /**
     * 设置用户主要职位ID
     *
     * @param prPostnId 用户主要职位ID
     */
    public void setPrPostnId(String prPostnId) {
        this.prPostnId = prPostnId;
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