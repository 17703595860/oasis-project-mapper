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
@Table(name = "TZ_COMPONENT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzComponent {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 文件名称,英文字母
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 菜单路径
     */
    @Column(name = "PATH")
    private String path;

    /**
     * 标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * TitleKey
     */
    @Column(name = "TITLE_KEY")
    private String titleKey;

    /**
     * 图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 权限,权限id
     */
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * Page,PageId
     */
    @Column(name = "PAGE_ID")
    private String pageId;

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

    /**
     * 变量
     */
    @Column(name = "VARIABLES")
    private String variables;
}