package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_JINC_DY_T")
public class TzJincDyT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 机构编号
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程名称
     */
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 进程描述
     */
    @Column(name = "TZ_JC_MS")
    private String tzJcMs;

    /**
     * 运行平台类型
     */
    @Column(name = "TZ_YXPT_LX")
    private String tzYxptLx;

    /**
     * 备注
     */
    @Column(name = "TZ_BEIZHU")
    private String tzBeizhu;

    /**
     * 组件ID
     */
    @Column(name = "TZ_ZCZJ_ID")
    private String tzZczjId;

    /**
     * java类
     */
    @Column(name = "TZ_JAVA_CLASS")
    private String tzJavaClass;

    /**
     * 是否自动重启
     */
    @Column(name = "TZ_IS_DISPATCH")
    private String tzIsDispatch;

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
     * 获取机构编号
     *
     * @return TZ_JG_ID - 机构编号
     */
    public String getTzJgId() {
        return tzJgId;
    }

    /**
     * 设置机构编号
     *
     * @param tzJgId 机构编号
     */
    public void setTzJgId(String tzJgId) {
        this.tzJgId = tzJgId;
    }

    /**
     * 获取进程名称
     *
     * @return TZ_JC_MC - 进程名称
     */
    public String getTzJcMc() {
        return tzJcMc;
    }

    /**
     * 设置进程名称
     *
     * @param tzJcMc 进程名称
     */
    public void setTzJcMc(String tzJcMc) {
        this.tzJcMc = tzJcMc;
    }

    /**
     * 获取进程描述
     *
     * @return TZ_JC_MS - 进程描述
     */
    public String getTzJcMs() {
        return tzJcMs;
    }

    /**
     * 设置进程描述
     *
     * @param tzJcMs 进程描述
     */
    public void setTzJcMs(String tzJcMs) {
        this.tzJcMs = tzJcMs;
    }

    /**
     * 获取运行平台类型
     *
     * @return TZ_YXPT_LX - 运行平台类型
     */
    public String getTzYxptLx() {
        return tzYxptLx;
    }

    /**
     * 设置运行平台类型
     *
     * @param tzYxptLx 运行平台类型
     */
    public void setTzYxptLx(String tzYxptLx) {
        this.tzYxptLx = tzYxptLx;
    }

    /**
     * 获取备注
     *
     * @return TZ_BEIZHU - 备注
     */
    public String getTzBeizhu() {
        return tzBeizhu;
    }

    /**
     * 设置备注
     *
     * @param tzBeizhu 备注
     */
    public void setTzBeizhu(String tzBeizhu) {
        this.tzBeizhu = tzBeizhu;
    }

    /**
     * 获取组件ID
     *
     * @return TZ_ZCZJ_ID - 组件ID
     */
    public String getTzZczjId() {
        return tzZczjId;
    }

    /**
     * 设置组件ID
     *
     * @param tzZczjId 组件ID
     */
    public void setTzZczjId(String tzZczjId) {
        this.tzZczjId = tzZczjId;
    }

    /**
     * 获取java类
     *
     * @return TZ_JAVA_CLASS - java类
     */
    public String getTzJavaClass() {
        return tzJavaClass;
    }

    /**
     * 设置java类
     *
     * @param tzJavaClass java类
     */
    public void setTzJavaClass(String tzJavaClass) {
        this.tzJavaClass = tzJavaClass;
    }

    /**
     * 获取是否自动重启
     *
     * @return TZ_IS_DISPATCH - 是否自动重启
     */
    public String getTzIsDispatch() {
        return tzIsDispatch;
    }

    /**
     * 设置是否自动重启
     *
     * @param tzIsDispatch 是否自动重启
     */
    public void setTzIsDispatch(String tzIsDispatch) {
        this.tzIsDispatch = tzIsDispatch;
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