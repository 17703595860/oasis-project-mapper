package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_COURSE_INST")
public class TzCourseInst {
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
     * 开课课程名称
     */
    @Column(name = "COURSE_NAME")
    private String courseName;

    /**
     * 学分
     */
    @Column(name = "CREDIT")
    private Float credit;

    /**
     * 学时
     */
    @Column(name = "STUDYHOUR")
    private Float studyhour;

    /**
     * 课程状态
     */
    @Column(name = "STATUS")
    private String status;

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
     * 获取开课课程名称
     *
     * @return COURSE_NAME - 开课课程名称
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 设置开课课程名称
     *
     * @param courseName 开课课程名称
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 获取学分
     *
     * @return CREDIT - 学分
     */
    public Float getCredit() {
        return credit;
    }

    /**
     * 设置学分
     *
     * @param credit 学分
     */
    public void setCredit(Float credit) {
        this.credit = credit;
    }

    /**
     * 获取学时
     *
     * @return STUDYHOUR - 学时
     */
    public Float getStudyhour() {
        return studyhour;
    }

    /**
     * 设置学时
     *
     * @param studyhour 学时
     */
    public void setStudyhour(Float studyhour) {
        this.studyhour = studyhour;
    }

    /**
     * 获取课程状态
     *
     * @return STATUS - 课程状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置课程状态
     *
     * @param status 课程状态
     */
    public void setStatus(String status) {
        this.status = status;
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