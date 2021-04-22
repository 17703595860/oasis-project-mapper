package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_JOIN")
@NoArgsConstructor
@AllArgsConstructor
public class TzJoin {
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
     * BE表外键
     */
    @Column(name = "BUSENTITY_ID")
    private String busentityId;

    /**
     * 关联表名称
     */
    @Column(name = "DEST_TBL_NAME")
    private String destTblName;

    /**
     * 是否左外连接
     */
    @Column(name = "OUTER_JOIN")
    private String outerJoin;

    /**
     * 是否扩展表
     */
    @Column(name = "EXTENSION_FLG")
    private String extensionFlg;

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
     * 获取BE表外键
     *
     * @return BUSENTITY_ID - BE表外键
     */
    public String getBusentityId() {
        return busentityId;
    }

    /**
     * 设置BE表外键
     *
     * @param busentityId BE表外键
     */
    public void setBusentityId(String busentityId) {
        this.busentityId = busentityId;
    }

    /**
     * 获取关联表名称
     *
     * @return DEST_TBL_NAME - 关联表名称
     */
    public String getDestTblName() {
        return destTblName;
    }

    /**
     * 设置关联表名称
     *
     * @param destTblName 关联表名称
     */
    public void setDestTblName(String destTblName) {
        this.destTblName = destTblName;
    }

    /**
     * 获取是否左外连接
     *
     * @return OUTER_JOIN - 是否左外连接
     */
    public String getOuterJoin() {
        return outerJoin;
    }

    /**
     * 设置是否左外连接
     *
     * @param outerJoin 是否左外连接
     */
    public void setOuterJoin(String outerJoin) {
        this.outerJoin = outerJoin;
    }

    /**
     * 获取是否扩展表
     *
     * @return EXTENSION_FLG - 是否扩展表
     */
    public String getExtensionFlg() {
        return extensionFlg;
    }

    /**
     * 设置是否扩展表
     *
     * @param extensionFlg 是否扩展表
     */
    public void setExtensionFlg(String extensionFlg) {
        this.extensionFlg = extensionFlg;
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