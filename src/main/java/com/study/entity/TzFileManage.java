package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILE_MANAGE")
public class TzFileManage {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 文件名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 文件保存状态0正在保存，1保存成功，2保存失败
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 文件扩展名
     */
    @Column(name = "SUFFIX")
    private String suffix;

    /**
     * 文件大小
     */
    @Column(name = "SIZE")
    private Integer size;

    /**
     * 系统文件名
     */
    @Column(name = "SYSTEM_NAME")
    private String systemName;

    /**
     * 文件存储方式
     */
    @Column(name = "TYPE_ID")
    private String typeId;

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
     * 获取主键ID
     *
     * @return ID - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取文件名称
     *
     * @return NAME - 文件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名称
     *
     * @param name 文件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取文件保存状态0正在保存，1保存成功，2保存失败
     *
     * @return STATUS - 文件保存状态0正在保存，1保存成功，2保存失败
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置文件保存状态0正在保存，1保存成功，2保存失败
     *
     * @param status 文件保存状态0正在保存，1保存成功，2保存失败
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取文件扩展名
     *
     * @return SUFFIX - 文件扩展名
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * 设置文件扩展名
     *
     * @param suffix 文件扩展名
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 获取文件大小
     *
     * @return SIZE - 文件大小
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置文件大小
     *
     * @param size 文件大小
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取系统文件名
     *
     * @return SYSTEM_NAME - 系统文件名
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * 设置系统文件名
     *
     * @param systemName 系统文件名
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    /**
     * 获取文件存储方式
     *
     * @return TYPE_ID - 文件存储方式
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设置文件存储方式
     *
     * @param typeId 文件存储方式
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新人
     *
     * @return LAST_UPD_BY - 更新人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdBy 更新人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取更新时间
     *
     * @return LAST_UPD - 更新时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpd 更新时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}