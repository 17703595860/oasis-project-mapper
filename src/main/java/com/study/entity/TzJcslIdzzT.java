package com.study.entity;

import javax.persistence.*;

@Table(name = "TZ_JCSL_IDZZ_T")
public class TzJcslIdzzT {
    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程实例号种子
     */
    @Column(name = "TZ_JCSL_IDSEED")
    private Integer tzJcslIdseed;

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
     * 获取进程实例号种子
     *
     * @return TZ_JCSL_IDSEED - 进程实例号种子
     */
    public Integer getTzJcslIdseed() {
        return tzJcslIdseed;
    }

    /**
     * 设置进程实例号种子
     *
     * @param tzJcslIdseed 进程实例号种子
     */
    public void setTzJcslIdseed(Integer tzJcslIdseed) {
        this.tzJcslIdseed = tzJcslIdseed;
    }
}