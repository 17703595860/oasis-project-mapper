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
@Table(name = "TZ_ACCOUNT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzAccount {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户类型
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 标识符类型
     */
    @Column(name = "IDENTITY_TYPE")
    private String identityType;

    /**
     * 标识符
     */
    @Column(name = "IDENTIFIER")
    private String identifier;

    /**
     * 凭证
     */
    @Column(name = "CERTIFICATE")
    private String certificate;

    /**
     * 是否可用	0-不可用 1-可用
     */
    @Column(name = "AVAILABLE")
    private Byte available;

    /**
     * 是否验证通过	0-不可用 1-可用
     */
    @Column(name = "VERIFY")
    private Byte verify;

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