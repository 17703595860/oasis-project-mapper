package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_MENU_NODE")
public class TzMenuNode {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
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

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return TREE_ID
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * @param treeId
     */
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return PARENT_ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return SEQUENCE
     */
    public Short getSequence() {
        return sequence;
    }

    /**
     * @param sequence
     */
    public void setSequence(Short sequence) {
        this.sequence = sequence;
    }

    /**
     * @return HIDDEN
     */
    public Byte getHidden() {
        return hidden;
    }

    /**
     * @param hidden
     */
    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    /**
     * @return TYPE
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return PATH
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return COMPONENT_ID
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * @param componentId
     */
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return TITLE_KEY
     */
    public String getTitleKey() {
        return titleKey;
    }

    /**
     * @param titleKey
     */
    public void setTitleKey(String titleKey) {
        this.titleKey = titleKey;
    }

    /**
     * @return ICON
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return PERMISSION_ID
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取修改记录号
     *
     * @return MODIFICATION_NUM - 修改记录号
     */
    public Integer getModificationNum() {
        return modificationNum;
    }

    /**
     * 设置修改记录号
     *
     * @param modificationNum 修改记录号
     */
    public void setModificationNum(Integer modificationNum) {
        this.modificationNum = modificationNum;
    }

    /**
     * @return CREATED_BY
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return CREATED
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return LAST_UPD_BY
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * @param lastUpdBy
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * @return LAST_UPD
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * @param lastUpd
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }

    /**
     * @return VARIABLES
     */
    public String getVariables() {
        return variables;
    }

    /**
     * @param variables
     */
    public void setVariables(String variables) {
        this.variables = variables;
    }
}