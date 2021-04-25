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
@Table(name = "TZ_PERMISSION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPermission {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "GROUP_ID")
    private String groupId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "WEB_ONLY")
    private Byte webOnly;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    @Column(name = "LAST_UPD")
    private Date lastUpd;
}