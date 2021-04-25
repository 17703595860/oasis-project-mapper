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
@Table(name = "TZ_PERSON")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPerson {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 性别
     */
    @Column(name = "GENDER")
    private Byte gender;

    /**
     * 生日
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

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