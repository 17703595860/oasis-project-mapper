package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_POSITION")
public class TzPosition {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 部门ID
     */
    @Column(name = "BU_ID")
    private String buId;

    /**
     * 职位名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 父职位ID
     */
    @Column(name = "PAR_POSTN_ID")
    private String parPostnId;

    /**
     * 主员工ID
     */
    @Column(name = "PR_EMP_ID")
    private String prEmpId;

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
     * 获取部门ID
     *
     * @return BU_ID - 部门ID
     */
    public String getBuId() {
        return buId;
    }

    /**
     * 设置部门ID
     *
     * @param buId 部门ID
     */
    public void setBuId(String buId) {
        this.buId = buId;
    }

    /**
     * 获取职位名称
     *
     * @return NAME - 职位名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置职位名称
     *
     * @param name 职位名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父职位ID
     *
     * @return PAR_POSTN_ID - 父职位ID
     */
    public String getParPostnId() {
        return parPostnId;
    }

    /**
     * 设置父职位ID
     *
     * @param parPostnId 父职位ID
     */
    public void setParPostnId(String parPostnId) {
        this.parPostnId = parPostnId;
    }

    /**
     * 获取主员工ID
     *
     * @return PR_EMP_ID - 主员工ID
     */
    public String getPrEmpId() {
        return prEmpId;
    }

    /**
     * 设置主员工ID
     *
     * @param prEmpId 主员工ID
     */
    public void setPrEmpId(String prEmpId) {
        this.prEmpId = prEmpId;
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