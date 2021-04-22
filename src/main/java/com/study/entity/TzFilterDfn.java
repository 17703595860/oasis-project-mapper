package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILTER_DFN")
public class TzFilterDfn {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * BE业务实体id
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * 可配置搜索名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 返回搜索结果最大行数
     */
    @Column(name = "RESULT_MAX_NUM")
    private Integer resultMaxNum;

    /**
     * 默认进入高级搜索模式
     */
    @Column(name = "ADVANCE_MODEL")
    private String advanceModel;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取BE业务实体id
     *
     * @return BE_ID - BE业务实体id
     */
    public String getBeId() {
        return beId;
    }

    /**
     * 设置BE业务实体id
     *
     * @param beId BE业务实体id
     */
    public void setBeId(String beId) {
        this.beId = beId;
    }

    /**
     * 获取可配置搜索名称
     *
     * @return NAME - 可配置搜索名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置可配置搜索名称
     *
     * @param name 可配置搜索名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取返回搜索结果最大行数
     *
     * @return RESULT_MAX_NUM - 返回搜索结果最大行数
     */
    public Integer getResultMaxNum() {
        return resultMaxNum;
    }

    /**
     * 设置返回搜索结果最大行数
     *
     * @param resultMaxNum 返回搜索结果最大行数
     */
    public void setResultMaxNum(Integer resultMaxNum) {
        this.resultMaxNum = resultMaxNum;
    }

    /**
     * 获取默认进入高级搜索模式
     *
     * @return ADVANCE_MODEL - 默认进入高级搜索模式
     */
    public String getAdvanceModel() {
        return advanceModel;
    }

    /**
     * 设置默认进入高级搜索模式
     *
     * @param advanceModel 默认进入高级搜索模式
     */
    public void setAdvanceModel(String advanceModel) {
        this.advanceModel = advanceModel;
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