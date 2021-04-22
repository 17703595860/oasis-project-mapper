package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_EMP_POSTN")
public class TzEmpPostn {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 职位ID
     */
    @Column(name = "POSTN_ID")
    private String postnId;

    /**
     * 员工ID
     */
    @Column(name = "EMP_ID")
    private String empId;

    /**
     * 是否职位主要员工
     */
    @Column(name = "PR_EMP_FLG")
    private String prEmpFlg;

    /**
     * 是否员工主要职位
     */
    @Column(name = "PR_POSTN_FLG")
    private String prPostnFlg;

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
     * @return POSTN_ID - 职位ID
     */
    public String getPostnId() {
        return postnId;
    }

    /**
     * 设置职位ID
     *
     * @param postnId 职位ID
     */
    public void setPostnId(String postnId) {
        this.postnId = postnId;
    }

    /**
     * 获取员工ID
     *
     * @return EMP_ID - 员工ID
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * 设置员工ID
     *
     * @param empId 员工ID
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * 获取是否职位主要员工
     *
     * @return PR_EMP_FLG - 是否职位主要员工
     */
    public String getPrEmpFlg() {
        return prEmpFlg;
    }

    /**
     * 设置是否职位主要员工
     *
     * @param prEmpFlg 是否职位主要员工
     */
    public void setPrEmpFlg(String prEmpFlg) {
        this.prEmpFlg = prEmpFlg;
    }

    /**
     * 获取是否员工主要职位
     *
     * @return PR_POSTN_FLG - 是否员工主要职位
     */
    public String getPrPostnFlg() {
        return prPostnFlg;
    }

    /**
     * 设置是否员工主要职位
     *
     * @param prPostnFlg 是否员工主要职位
     */
    public void setPrPostnFlg(String prPostnFlg) {
        this.prPostnFlg = prPostnFlg;
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