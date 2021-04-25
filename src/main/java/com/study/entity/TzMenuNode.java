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
@Table(name = "TZ_MENU_NODE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzMenuNode {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "TREE_ID")
    private String treeId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "SEQUENCE")
    private Short sequence;

    @Column(name = "HIDDEN")
    private Byte hidden;

    @Column(name = "TYPE")
    private Byte type;

    @Column(name = "PATH")
    private String path;

    @Column(name = "URL")
    private String url;

    @Column(name = "COMPONENT_ID")
    private String componentId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TITLE_KEY")
    private String titleKey;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * 栏目,栏目ID
     */
    @Column(name = "SITE_COLU_ID")
    private String siteColuId;

    /**
     * 模板,模板id
     */
    @Column(name = "SITE_TEMP_ID")
    private String siteTempId;

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