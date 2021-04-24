package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/24
*/
@Table(name = "TZ_IDCARD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzIdcard {
    @Id
    @Column(name = "ID")
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
}