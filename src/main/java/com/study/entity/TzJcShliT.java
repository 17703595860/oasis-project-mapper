package com.study.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_JC_SHLI_T")
public class TzJcShliT {
    @Id
    @Column(name = "TZ_JCSL_ID")
    private Long tzJcslId;

    /**
     * 机构ID
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 运行控制ID
     */
    @Column(name = "TZ_YUNX_KZID")
    private String tzYunxKzid;

    /**
     * 用户
     */
    @Column(name = "TZ_DLZH_ID")
    private String tzDlzhId;

    /**
     * 进程名称
     */
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 循环
     */
    @Column(name = "TZ_XH_QZBDS")
    private String tzXhQzbds;

    /**
     * 服务器名称
     */
    @Column(name = "TZ_JCFWQ_MC")
    private String tzJcfwqMc;

    /**
     * 运行状态
     */
    @Column(name = "TZ_JOB_YXZT")
    private String tzJobYxzt;

    /**
     * 最近循环时间
     */
    @Column(name = "TZ_ZJXTSJ")
    private Date tzZjxtsj;

    /**
     * 请求创建时间
     */
    @Column(name = "TZ_QQCJ_DTTM")
    private Date tzQqcjDttm;

    /**
     * 可运行开始时间
     */
    @Column(name = "TZ_JHZX_DTTM")
    private Date tzJhzxDttm;

    /**
     * 进程开始时间
     */
    @Column(name = "TZ_JCKS_DTTM")
    private Date tzJcksDttm;

    /**
     * 进程结束时间
     */
    @Column(name = "TZ_JCJS_DTTM")
    private Date tzJcjsDttm;

    /**
     * @return TZ_JCSL_ID
     */
    public Long getTzJcslId() {
        return tzJcslId;
    }

    /**
     * @param tzJcslId
     */
    public void setTzJcslId(Long tzJcslId) {
        this.tzJcslId = tzJcslId;
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
     * 获取运行控制ID
     *
     * @return TZ_YUNX_KZID - 运行控制ID
     */
    public String getTzYunxKzid() {
        return tzYunxKzid;
    }

    /**
     * 设置运行控制ID
     *
     * @param tzYunxKzid 运行控制ID
     */
    public void setTzYunxKzid(String tzYunxKzid) {
        this.tzYunxKzid = tzYunxKzid;
    }

    /**
     * 获取用户
     *
     * @return TZ_DLZH_ID - 用户
     */
    public String getTzDlzhId() {
        return tzDlzhId;
    }

    /**
     * 设置用户
     *
     * @param tzDlzhId 用户
     */
    public void setTzDlzhId(String tzDlzhId) {
        this.tzDlzhId = tzDlzhId;
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
     * 获取循环
     *
     * @return TZ_XH_QZBDS - 循环
     */
    public String getTzXhQzbds() {
        return tzXhQzbds;
    }

    /**
     * 设置循环
     *
     * @param tzXhQzbds 循环
     */
    public void setTzXhQzbds(String tzXhQzbds) {
        this.tzXhQzbds = tzXhQzbds;
    }

    /**
     * 获取服务器名称
     *
     * @return TZ_JCFWQ_MC - 服务器名称
     */
    public String getTzJcfwqMc() {
        return tzJcfwqMc;
    }

    /**
     * 设置服务器名称
     *
     * @param tzJcfwqMc 服务器名称
     */
    public void setTzJcfwqMc(String tzJcfwqMc) {
        this.tzJcfwqMc = tzJcfwqMc;
    }

    /**
     * 获取运行状态
     *
     * @return TZ_JOB_YXZT - 运行状态
     */
    public String getTzJobYxzt() {
        return tzJobYxzt;
    }

    /**
     * 设置运行状态
     *
     * @param tzJobYxzt 运行状态
     */
    public void setTzJobYxzt(String tzJobYxzt) {
        this.tzJobYxzt = tzJobYxzt;
    }

    /**
     * 获取最近循环时间
     *
     * @return TZ_ZJXTSJ - 最近循环时间
     */
    public Date getTzZjxtsj() {
        return tzZjxtsj;
    }

    /**
     * 设置最近循环时间
     *
     * @param tzZjxtsj 最近循环时间
     */
    public void setTzZjxtsj(Date tzZjxtsj) {
        this.tzZjxtsj = tzZjxtsj;
    }

    /**
     * 获取请求创建时间
     *
     * @return TZ_QQCJ_DTTM - 请求创建时间
     */
    public Date getTzQqcjDttm() {
        return tzQqcjDttm;
    }

    /**
     * 设置请求创建时间
     *
     * @param tzQqcjDttm 请求创建时间
     */
    public void setTzQqcjDttm(Date tzQqcjDttm) {
        this.tzQqcjDttm = tzQqcjDttm;
    }

    /**
     * 获取可运行开始时间
     *
     * @return TZ_JHZX_DTTM - 可运行开始时间
     */
    public Date getTzJhzxDttm() {
        return tzJhzxDttm;
    }

    /**
     * 设置可运行开始时间
     *
     * @param tzJhzxDttm 可运行开始时间
     */
    public void setTzJhzxDttm(Date tzJhzxDttm) {
        this.tzJhzxDttm = tzJhzxDttm;
    }

    /**
     * 获取进程开始时间
     *
     * @return TZ_JCKS_DTTM - 进程开始时间
     */
    public Date getTzJcksDttm() {
        return tzJcksDttm;
    }

    /**
     * 设置进程开始时间
     *
     * @param tzJcksDttm 进程开始时间
     */
    public void setTzJcksDttm(Date tzJcksDttm) {
        this.tzJcksDttm = tzJcksDttm;
    }

    /**
     * 获取进程结束时间
     *
     * @return TZ_JCJS_DTTM - 进程结束时间
     */
    public Date getTzJcjsDttm() {
        return tzJcjsDttm;
    }

    /**
     * 设置进程结束时间
     *
     * @param tzJcjsDttm 进程结束时间
     */
    public void setTzJcjsDttm(Date tzJcjsDttm) {
        this.tzJcjsDttm = tzJcjsDttm;
    }
}