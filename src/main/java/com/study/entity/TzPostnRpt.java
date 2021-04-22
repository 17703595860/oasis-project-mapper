package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_POSTN_RPT")
public class TzPostnRpt {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 职位ID
     */
    @Column(name = "POSITION_ID")
    private String positionId;

    /**
     * 下级职位ID
     */
    @Column(name = "CHILD_POSITIONID")
    private String childPositionid;

    /**
     * 层级差
     */
    @Column(name = "HOP")
    private Integer hop;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     * 修改人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 修改时间
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
     * 获取职位ID
     *
     * @return POSITION_ID - 职位ID
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * 设置职位ID
     *
     * @param positionId 职位ID
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取下级职位ID
     *
     * @return CHILD_POSITIONID - 下级职位ID
     */
    public String getChildPositionid() {
        return childPositionid;
    }

    /**
     * 设置下级职位ID
     *
     * @param childPositionid 下级职位ID
     */
    public void setChildPositionid(String childPositionid) {
        this.childPositionid = childPositionid;
    }

    /**
     * 获取层级差
     *
     * @return HOP - 层级差
     */
    public Integer getHop() {
        return hop;
    }

    /**
     * 设置层级差
     *
     * @param hop 层级差
     */
    public void setHop(Integer hop) {
        this.hop = hop;
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
     * 获取修改人
     *
     * @return LAST_UPD_BY - 修改人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置修改人
     *
     * @param lastUpdBy 修改人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取修改时间
     *
     * @return LAST_UPD - 修改时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置修改时间
     *
     * @param lastUpd 修改时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}