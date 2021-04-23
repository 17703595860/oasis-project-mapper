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
@Table(name = "TZ_COMPONENT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzComponent {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PATH")
    private String path;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TITLE_KEY")
    private String titleKey;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * PAGE_ID
     */
    @Column(name = "PAGE_ID")
    private String pageId;

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

    @Column(name = "VARIABLES")
    private String variables;
}