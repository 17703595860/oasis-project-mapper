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
@Table(name = "TZ_USER")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzUser {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "PERSON_ID")
    private String personId;

    @Column(name = "USERNAME")
    private String username;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

    /**
     * 用户类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 用户来源
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    @Column(name = "LAST_UPD")
    private Date lastUpd;
}