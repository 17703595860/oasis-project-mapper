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
@Table(name = "TZ_POSITION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPosition {
    @Id
    @Column(name = "ID")
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
}