package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_LINK")
public class TzLink {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 查询条件
     */
    @Column(name = "SRCHSPEC")
    private String srchspec;

    /**
     * 父BE名称
     */
    @Column(name = "PARENT_BE_NAME")
    private String parentBeName;

    /**
     * 子BE名称	
     */
    @Column(name = "CHILD_BE_NAME")
    private String childBeName;

    /**
     * 父BE字段名称
     */
    @Column(name = "SRC_FLD_NAME")
    private String srcFldName;

    /**
     * 子BE字段名称
     */
    @Column(name = "DST_FLD_NAME")
    private String dstFldName;

    /**
     * 中间表名称
     */
    @Column(name = "INTER_TBL_NAME")
    private String interTblName;

    /**
     * 中间表关联父BE的Column名称
     */
    @Column(name = "IPARENT_COL_NAME")
    private String iparentColName;

    /**
     * 中间表关联子BE的Column名称
     */
    @Column(name = "ICHILD_COL_NAME")
    private String ichildColName;

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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取查询条件
     *
     * @return SRCHSPEC - 查询条件
     */
    public String getSrchspec() {
        return srchspec;
    }

    /**
     * 设置查询条件
     *
     * @param srchspec 查询条件
     */
    public void setSrchspec(String srchspec) {
        this.srchspec = srchspec;
    }

    /**
     * 获取父BE名称
     *
     * @return PARENT_BE_NAME - 父BE名称
     */
    public String getParentBeName() {
        return parentBeName;
    }

    /**
     * 设置父BE名称
     *
     * @param parentBeName 父BE名称
     */
    public void setParentBeName(String parentBeName) {
        this.parentBeName = parentBeName;
    }

    /**
     * 获取子BE名称	
     *
     * @return CHILD_BE_NAME - 子BE名称	
     */
    public String getChildBeName() {
        return childBeName;
    }

    /**
     * 设置子BE名称	
     *
     * @param childBeName 子BE名称	
     */
    public void setChildBeName(String childBeName) {
        this.childBeName = childBeName;
    }

    /**
     * 获取父BE字段名称
     *
     * @return SRC_FLD_NAME - 父BE字段名称
     */
    public String getSrcFldName() {
        return srcFldName;
    }

    /**
     * 设置父BE字段名称
     *
     * @param srcFldName 父BE字段名称
     */
    public void setSrcFldName(String srcFldName) {
        this.srcFldName = srcFldName;
    }

    /**
     * 获取子BE字段名称
     *
     * @return DST_FLD_NAME - 子BE字段名称
     */
    public String getDstFldName() {
        return dstFldName;
    }

    /**
     * 设置子BE字段名称
     *
     * @param dstFldName 子BE字段名称
     */
    public void setDstFldName(String dstFldName) {
        this.dstFldName = dstFldName;
    }

    /**
     * 获取中间表名称
     *
     * @return INTER_TBL_NAME - 中间表名称
     */
    public String getInterTblName() {
        return interTblName;
    }

    /**
     * 设置中间表名称
     *
     * @param interTblName 中间表名称
     */
    public void setInterTblName(String interTblName) {
        this.interTblName = interTblName;
    }

    /**
     * 获取中间表关联父BE的Column名称
     *
     * @return IPARENT_COL_NAME - 中间表关联父BE的Column名称
     */
    public String getIparentColName() {
        return iparentColName;
    }

    /**
     * 设置中间表关联父BE的Column名称
     *
     * @param iparentColName 中间表关联父BE的Column名称
     */
    public void setIparentColName(String iparentColName) {
        this.iparentColName = iparentColName;
    }

    /**
     * 获取中间表关联子BE的Column名称
     *
     * @return ICHILD_COL_NAME - 中间表关联子BE的Column名称
     */
    public String getIchildColName() {
        return ichildColName;
    }

    /**
     * 设置中间表关联子BE的Column名称
     *
     * @param ichildColName 中间表关联子BE的Column名称
     */
    public void setIchildColName(String ichildColName) {
        this.ichildColName = ichildColName;
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