package com.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_FILE_STORAGE_TYPE")
public class TzFileStorageType {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 存储方式唯一标识
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 存储方式描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 附件存储路径，如果存储到数据库，可以为空，否则，非空
     */
    @Column(name = "STORAGE_SRC")
    private String storageSrc;

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
     * 获取存储方式唯一标识
     *
     * @return CODE - 存储方式唯一标识
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置存储方式唯一标识
     *
     * @param code 存储方式唯一标识
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取存储方式描述
     *
     * @return DESCRIPTION - 存储方式描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置存储方式描述
     *
     * @param description 存储方式描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取附件存储路径，如果存储到数据库，可以为空，否则，非空
     *
     * @return STORAGE_SRC - 附件存储路径，如果存储到数据库，可以为空，否则，非空
     */
    public String getStorageSrc() {
        return storageSrc;
    }

    /**
     * 设置附件存储路径，如果存储到数据库，可以为空，否则，非空
     *
     * @param storageSrc 附件存储路径，如果存储到数据库，可以为空，否则，非空
     */
    public void setStorageSrc(String storageSrc) {
        this.storageSrc = storageSrc;
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