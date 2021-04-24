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
@Table(name = "TZ_EMPLOYEE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzEmployee {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户主要职位ID
     */
    @Column(name = "PR_POSTN_ID")
    private String prPostnId;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

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
}