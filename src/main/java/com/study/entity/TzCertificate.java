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
@Table(name = "TZ_CERTIFICATE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCertificate {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 人员Id
     */
    @Column(name = "PERSON_ID")
    private String personId;

    /**
     * 证件类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 证件号
     */
    @Column(name = "NUMBER")
    private String number;

    /**
     * 生效日期
     */
    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    /**
     * 失效日期
     */
    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;

    /**
     * 发证机构
     */
    @Column(name = "CA")
    private String ca;

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