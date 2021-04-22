package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_JCYX_LOG_T")
public class TzJcyxLogT {
    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程实例ID
     */
    @Id
    @Column(name = "TZ_JCSL_ID")
    private Long tzJcslId;

    /**
     * 序号
     */
    @Id
    @Column(name = "TZ_RZ_LSH")
    private Long tzRzLsh;

    /**
     * 日志级别
     */
    @Column(name = "TZ_RZ_JB")
    private String tzRzJb;

    /**
     * 日期时间
     */
    @Column(name = "TZ_RZ_DTTM")
    private Date tzRzDttm;

    /**
     * 日志详细内容
     */
    @Column(name = "TZ_RZ_NR")
    private String tzRzNr;

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
     * 获取进程实例ID
     *
     * @return TZ_JCSL_ID - 进程实例ID
     */
    public Long getTzJcslId() {
        return tzJcslId;
    }

    /**
     * 设置进程实例ID
     *
     * @param tzJcslId 进程实例ID
     */
    public void setTzJcslId(Long tzJcslId) {
        this.tzJcslId = tzJcslId;
    }

    /**
     * 获取序号
     *
     * @return TZ_RZ_LSH - 序号
     */
    public Long getTzRzLsh() {
        return tzRzLsh;
    }

    /**
     * 设置序号
     *
     * @param tzRzLsh 序号
     */
    public void setTzRzLsh(Long tzRzLsh) {
        this.tzRzLsh = tzRzLsh;
    }

    /**
     * 获取日志级别
     *
     * @return TZ_RZ_JB - 日志级别
     */
    public String getTzRzJb() {
        return tzRzJb;
    }

    /**
     * 设置日志级别
     *
     * @param tzRzJb 日志级别
     */
    public void setTzRzJb(String tzRzJb) {
        this.tzRzJb = tzRzJb;
    }

    /**
     * 获取日期时间
     *
     * @return TZ_RZ_DTTM - 日期时间
     */
    public Date getTzRzDttm() {
        return tzRzDttm;
    }

    /**
     * 设置日期时间
     *
     * @param tzRzDttm 日期时间
     */
    public void setTzRzDttm(Date tzRzDttm) {
        this.tzRzDttm = tzRzDttm;
    }

    /**
     * 获取日志详细内容
     *
     * @return TZ_RZ_NR - 日志详细内容
     */
    public String getTzRzNr() {
        return tzRzNr;
    }

    /**
     * 设置日志详细内容
     *
     * @param tzRzNr 日志详细内容
     */
    public void setTzRzNr(String tzRzNr) {
        this.tzRzNr = tzRzNr;
    }
}