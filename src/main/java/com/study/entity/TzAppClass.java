package com.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_APP_CLASS")
public class TzAppClass {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 应用程序类码值
     */
    @Column(name = "APP_CLASS_CODE")
    private String appClassCode;

    /**
     * 应用程序描述
     */
    @Column(name = "APP_CLASS_DESC")
    private String appClassDesc;

    /**
     * 应用程序类路径
     */
    @Column(name = "APP_CLASS_PATH")
    private String appClassPath;

    /**
     * 应用程序类名称
     */
    @Column(name = "APP_CLASS_NAME")
    private String appClassName;

    /**
     * 应用程序类方法
     */
    @Column(name = "APP_CLASS_METHOD")
    private String appClassMethod;

    /**
     * 生效标志
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

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
     * 获取应用程序类码值
     *
     * @return APP_CLASS_CODE - 应用程序类码值
     */
    public String getAppClassCode() {
        return appClassCode;
    }

    /**
     * 设置应用程序类码值
     *
     * @param appClassCode 应用程序类码值
     */
    public void setAppClassCode(String appClassCode) {
        this.appClassCode = appClassCode;
    }

    /**
     * 获取应用程序描述
     *
     * @return APP_CLASS_DESC - 应用程序描述
     */
    public String getAppClassDesc() {
        return appClassDesc;
    }

    /**
     * 设置应用程序描述
     *
     * @param appClassDesc 应用程序描述
     */
    public void setAppClassDesc(String appClassDesc) {
        this.appClassDesc = appClassDesc;
    }

    /**
     * 获取应用程序类路径
     *
     * @return APP_CLASS_PATH - 应用程序类路径
     */
    public String getAppClassPath() {
        return appClassPath;
    }

    /**
     * 设置应用程序类路径
     *
     * @param appClassPath 应用程序类路径
     */
    public void setAppClassPath(String appClassPath) {
        this.appClassPath = appClassPath;
    }

    /**
     * 获取应用程序类名称
     *
     * @return APP_CLASS_NAME - 应用程序类名称
     */
    public String getAppClassName() {
        return appClassName;
    }

    /**
     * 设置应用程序类名称
     *
     * @param appClassName 应用程序类名称
     */
    public void setAppClassName(String appClassName) {
        this.appClassName = appClassName;
    }

    /**
     * 获取应用程序类方法
     *
     * @return APP_CLASS_METHOD - 应用程序类方法
     */
    public String getAppClassMethod() {
        return appClassMethod;
    }

    /**
     * 设置应用程序类方法
     *
     * @param appClassMethod 应用程序类方法
     */
    public void setAppClassMethod(String appClassMethod) {
        this.appClassMethod = appClassMethod;
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
}