package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_BUSMODULE")
public class TzBusmodule {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * BM名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 主BE名称
     */
    @Column(name = "PR_BUSENTITY_NAME")
    private String prBusentityName;

    /**
     * 所属模块
     */
    @Column(name = "MODULE")
    private String module;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

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
     * 获取BM名称
     *
     * @return NAME - BM名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置BM名称
     *
     * @param name BM名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取主BE名称
     *
     * @return PR_BUSENTITY_NAME - 主BE名称
     */
    public String getPrBusentityName() {
        return prBusentityName;
    }

    /**
     * 设置主BE名称
     *
     * @param prBusentityName 主BE名称
     */
    public void setPrBusentityName(String prBusentityName) {
        this.prBusentityName = prBusentityName;
    }

    /**
     * 获取所属模块
     *
     * @return MODULE - 所属模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置所属模块
     *
     * @param module 所属模块
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * 获取生效标识
     *
     * @return ACTIVE_FLG - 生效标识
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标识
     *
     * @param activeFlg 生效标识
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
    }

    /**
     * 获取备注
     *
     * @return COMMENTS - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
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