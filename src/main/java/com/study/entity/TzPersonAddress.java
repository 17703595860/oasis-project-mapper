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
@Table(name = "TZ_PERSON_ADDRESS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPersonAddress {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 人员Id
     */
    @Column(name = "PERSON_ID")
    private String personId;

    /**
     * 是否为主要地址，1-是 0-否
     */
    @Column(name = "IS_PRIMARY")
    private Byte isPrimary;

    /**
     * 地址ID
     */
    @Column(name = "ADDRESS_ID")
    private String addressId;

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