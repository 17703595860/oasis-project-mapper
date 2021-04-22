package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_JC_FWQDX_T")
public class TzJcFwqdxT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 机构ID
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程服务器名称
     */
    @Column(name = "TZ_JCFWQ_MC")
    private String tzJcfwqMc;

    /**
     * 服务器IP地址
     */
    @Column(name = "TZ_FWQ_IP")
    private String tzFwqIp;

    /**
     * 描述
     */
    @Column(name = "TZ_JCFWQ_MS")
    private String tzJcfwqMs;

    /**
     * 运行平台类型
     */
    @Column(name = "TZ_CZXT_LX")
    private String tzCzxtLx;

    /**
     * 任务循环读取间隔时间
     */
    @Column(name = "TZ_RWXH_JG")
    private Integer tzRwxhJg;

    /**
     * 最大并行任务数
     */
    @Column(name = "TZ_ZDBX_RWS")
    private Integer tzZdbxRws;

    /**
     * 备注
     */
    @Column(name = "TZ_BEIZHU")
    private String tzBeizhu;

    /**
     * 运行状态
     */
    @Column(name = "TZ_YXZT")
    private String tzYxzt;

    /**
     * 最近心跳时间
     */
    @Column(name = "TZ_ZJXTSJ")
    private Date tzZjxtsj;

    /**
     * 实例识别ID
     */
    @Column(name = "TZ_BS_SLID")
    private String tzBsSlid;

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
     * 获取机构ID
     *
     * @return TZ_JG_ID - 机构ID
     */
    public String getTzJgId() {
        return tzJgId;
    }

    /**
     * 设置机构ID
     *
     * @param tzJgId 机构ID
     */
    public void setTzJgId(String tzJgId) {
        this.tzJgId = tzJgId;
    }

    /**
     * 获取进程服务器名称
     *
     * @return TZ_JCFWQ_MC - 进程服务器名称
     */
    public String getTzJcfwqMc() {
        return tzJcfwqMc;
    }

    /**
     * 设置进程服务器名称
     *
     * @param tzJcfwqMc 进程服务器名称
     */
    public void setTzJcfwqMc(String tzJcfwqMc) {
        this.tzJcfwqMc = tzJcfwqMc;
    }

    /**
     * 获取服务器IP地址
     *
     * @return TZ_FWQ_IP - 服务器IP地址
     */
    public String getTzFwqIp() {
        return tzFwqIp;
    }

    /**
     * 设置服务器IP地址
     *
     * @param tzFwqIp 服务器IP地址
     */
    public void setTzFwqIp(String tzFwqIp) {
        this.tzFwqIp = tzFwqIp;
    }

    /**
     * 获取描述
     *
     * @return TZ_JCFWQ_MS - 描述
     */
    public String getTzJcfwqMs() {
        return tzJcfwqMs;
    }

    /**
     * 设置描述
     *
     * @param tzJcfwqMs 描述
     */
    public void setTzJcfwqMs(String tzJcfwqMs) {
        this.tzJcfwqMs = tzJcfwqMs;
    }

    /**
     * 获取运行平台类型
     *
     * @return TZ_CZXT_LX - 运行平台类型
     */
    public String getTzCzxtLx() {
        return tzCzxtLx;
    }

    /**
     * 设置运行平台类型
     *
     * @param tzCzxtLx 运行平台类型
     */
    public void setTzCzxtLx(String tzCzxtLx) {
        this.tzCzxtLx = tzCzxtLx;
    }

    /**
     * 获取任务循环读取间隔时间
     *
     * @return TZ_RWXH_JG - 任务循环读取间隔时间
     */
    public Integer getTzRwxhJg() {
        return tzRwxhJg;
    }

    /**
     * 设置任务循环读取间隔时间
     *
     * @param tzRwxhJg 任务循环读取间隔时间
     */
    public void setTzRwxhJg(Integer tzRwxhJg) {
        this.tzRwxhJg = tzRwxhJg;
    }

    /**
     * 获取最大并行任务数
     *
     * @return TZ_ZDBX_RWS - 最大并行任务数
     */
    public Integer getTzZdbxRws() {
        return tzZdbxRws;
    }

    /**
     * 设置最大并行任务数
     *
     * @param tzZdbxRws 最大并行任务数
     */
    public void setTzZdbxRws(Integer tzZdbxRws) {
        this.tzZdbxRws = tzZdbxRws;
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
     * 获取运行状态
     *
     * @return TZ_YXZT - 运行状态
     */
    public String getTzYxzt() {
        return tzYxzt;
    }

    /**
     * 设置运行状态
     *
     * @param tzYxzt 运行状态
     */
    public void setTzYxzt(String tzYxzt) {
        this.tzYxzt = tzYxzt;
    }

    /**
     * 获取最近心跳时间
     *
     * @return TZ_ZJXTSJ - 最近心跳时间
     */
    public Date getTzZjxtsj() {
        return tzZjxtsj;
    }

    /**
     * 设置最近心跳时间
     *
     * @param tzZjxtsj 最近心跳时间
     */
    public void setTzZjxtsj(Date tzZjxtsj) {
        this.tzZjxtsj = tzZjxtsj;
    }

    /**
     * 获取实例识别ID
     *
     * @return TZ_BS_SLID - 实例识别ID
     */
    public String getTzBsSlid() {
        return tzBsSlid;
    }

    /**
     * 设置实例识别ID
     *
     * @param tzBsSlid 实例识别ID
     */
    public void setTzBsSlid(String tzBsSlid) {
        this.tzBsSlid = tzBsSlid;
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