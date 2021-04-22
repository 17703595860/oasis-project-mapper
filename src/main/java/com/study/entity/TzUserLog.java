package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_USER_LOG")
public class TzUserLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "PERSON_ID")
    private String personId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 凭证类型,token,密码,验证码,第三方token等
     */
    @Column(name = "CREDENTIALS_TYPE")
    private String credentialsType;

    /**
     * 动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     */
    @Column(name = "COMMAND")
    private String command;

    /**
     * 操作IP
     */
    @Column(name = "IP")
    private String ip;

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
     * @return ACCOUNT_ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取凭证类型,token,密码,验证码,第三方token等
     *
     * @return CREDENTIALS_TYPE - 凭证类型,token,密码,验证码,第三方token等
     */
    public String getCredentialsType() {
        return credentialsType;
    }

    /**
     * 设置凭证类型,token,密码,验证码,第三方token等
     *
     * @param credentialsType 凭证类型,token,密码,验证码,第三方token等
     */
    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType;
    }

    /**
     * 获取动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     *
     * @return COMMAND - 动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     */
    public String getCommand() {
        return command;
    }

    /**
     * 设置动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     *
     * @param command 动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * 获取操作IP
     *
     * @return IP - 操作IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置操作IP
     *
     * @param ip 操作IP
     */
    public void setIp(String ip) {
        this.ip = ip;
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