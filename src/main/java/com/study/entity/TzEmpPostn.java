package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_EMP_POSTN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzEmpPostn {
    @Id
    @Column(name = "ID")
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
}