package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/25
*/
@Table(name = "TZ_COURSE_INST")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCourseInst {
    @Id
    @Column(name = "ID")
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
}