package com.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_SYSTEM_PARAMETER")
public class TzSystemParameter {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 参数码值
     */
    @Column(name = "PARAMETER_CODE")
    private String parameterCode;

    /**
     * 参数vlaue
     */
    @Column(name = "PARAMETER_VALUE")
    private String parameterValue;

    /**
     * 参数描述
     */
    @Column(name = "PARAMETER_DESC")
    private String parameterDesc;

    /**
     * 参数详细描述
     */
    @Column(name = "PARAMETER_LONG_DESC")
    private String parameterLongDesc;

    /**
     * 类型 0-平台基础配置 1业务配置)
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     */
    @Column(name = "MODULE")
    private Byte module;

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
     * 获取参数码值
     *
     * @return PARAMETER_CODE - 参数码值
     */
    public String getParameterCode() {
        return parameterCode;
    }

    /**
     * 设置参数码值
     *
     * @param parameterCode 参数码值
     */
    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }

    /**
     * 获取参数vlaue
     *
     * @return PARAMETER_VALUE - 参数vlaue
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * 设置参数vlaue
     *
     * @param parameterValue 参数vlaue
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * 获取参数描述
     *
     * @return PARAMETER_DESC - 参数描述
     */
    public String getParameterDesc() {
        return parameterDesc;
    }

    /**
     * 设置参数描述
     *
     * @param parameterDesc 参数描述
     */
    public void setParameterDesc(String parameterDesc) {
        this.parameterDesc = parameterDesc;
    }

    /**
     * 获取参数详细描述
     *
     * @return PARAMETER_LONG_DESC - 参数详细描述
     */
    public String getParameterLongDesc() {
        return parameterLongDesc;
    }

    /**
     * 设置参数详细描述
     *
     * @param parameterLongDesc 参数详细描述
     */
    public void setParameterLongDesc(String parameterLongDesc) {
        this.parameterLongDesc = parameterLongDesc;
    }

    /**
     * 获取类型 0-平台基础配置 1业务配置)
     *
     * @return TYPE - 类型 0-平台基础配置 1业务配置)
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型 0-平台基础配置 1业务配置)
     *
     * @param type 类型 0-平台基础配置 1业务配置)
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     *
     * @return MODULE - 所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     */
    public Byte getModule() {
        return module;
    }

    /**
     * 设置所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     *
     * @param module 所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     */
    public void setModule(Byte module) {
        this.module = module;
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