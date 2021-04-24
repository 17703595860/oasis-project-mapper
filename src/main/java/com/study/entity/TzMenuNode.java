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
@Table(name = "TZ_MENU_NODE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzMenuNode {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 菜单树,菜单树id
     */
    @Column(name = "TREE_ID")
    private String treeId;

    /**
     * 菜单节点名称,英文字母
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 父节点,父节点id
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 排序字段,无符号
     */
    @Column(name = "SEQUENCE")
    private Short sequence;

    /**
     * 是否隐藏,1隐藏，0不隐藏，无符号
     */
    @Column(name = "HIDDEN")
    private Byte hidden;

    /**
     * 节点类型,节点类型，0目录，1菜单，2外链，无符号
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 菜单路径,菜单路径，类型为1菜单时填写
     */
    @Column(name = "PATH")
    private String path;

    /**
     * 外链url,外链url，如果为外部链接填写
     */
    @Column(name = "URL")
    private String url;

    /**
     * 菜单组件,菜单组件id，类型为1菜单时填写
     */
    @Column(name = "COMPONENT_ID")
    private String componentId;

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