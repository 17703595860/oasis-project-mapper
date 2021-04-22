package com.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_IDCARD")
public class TzIdcard {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 学生ID
     */
    @Column(name = "STUDENT_ID")
    private String studentId;

    /**
     * 证件类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 证件号码
     */
    @Column(name = "IDNUMBER")
    private String idnumber;

    /**
     * 是否主要
     */
    @Column(name = "MAIN_FLG")
    private String mainFlg;

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
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

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
     * 获取学生ID
     *
     * @return STUDENT_ID - 学生ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学生ID
     *
     * @param studentId 学生ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取证件类型
     *
     * @return TYPE - 证件类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置证件类型
     *
     * @param type 证件类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取证件号码
     *
     * @return IDNUMBER - 证件号码
     */
    public String getIdnumber() {
        return idnumber;
    }

    /**
     * 设置证件号码
     *
     * @param idnumber 证件号码
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    /**
     * 获取是否主要
     *
     * @return MAIN_FLG - 是否主要
     */
    public String getMainFlg() {
        return mainFlg;
    }

    /**
     * 设置是否主要
     *
     * @param mainFlg 是否主要
     */
    public void setMainFlg(String mainFlg) {
        this.mainFlg = mainFlg;
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
}