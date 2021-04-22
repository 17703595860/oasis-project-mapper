package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_USER")
public class TzUser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "PERSON_ID")
    private String personId;

    @Column(name = "USERNAME")
    private String username;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

    /**
     * 用户类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 用户来源
     */
    @Column(name = "SOURCE")
    private String source;

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
     * @return PERSON_ID
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取用户类型
     *
     * @return TYPE - 用户类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置用户类型
     *
     * @param type 用户类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取用户来源
     *
     * @return SOURCE - 用户来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置用户来源
     *
     * @param source 用户来源
     */
    public void setSource(String source) {
        this.source = source;
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