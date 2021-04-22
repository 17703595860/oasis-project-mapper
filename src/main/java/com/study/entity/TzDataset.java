package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DATASET")
public class TzDataset {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * BE业务实体id
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * BE业务实体名称
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 数据集名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 显示名称
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * BE业务实体的field记录所有权字段
     */
    @Column(name = "OWNER_FIELD")
    private String ownerField;

    /**
     * 自定义模式下基于的数据集id
     */
    @Column(name = "BASE_DS_ID")
    private String baseDsId;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取BE业务实体id
     *
     * @return BE_ID - BE业务实体id
     */
    public String getBeId() {
        return beId;
    }

    /**
     * 设置BE业务实体id
     *
     * @param beId BE业务实体id
     */
    public void setBeId(String beId) {
        this.beId = beId;
    }

    /**
     * 获取BE业务实体名称
     *
     * @return BE_NAME - BE业务实体名称
     */
    public String getBeName() {
        return beName;
    }

    /**
     * 设置BE业务实体名称
     *
     * @param beName BE业务实体名称
     */
    public void setBeName(String beName) {
        this.beName = beName;
    }

    /**
     * 获取数据集名称
     *
     * @return NAME - 数据集名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置数据集名称
     *
     * @param name 数据集名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取显示名称
     *
     * @return DISPLAY_NAME - 显示名称
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置显示名称
     *
     * @param displayName 显示名称
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取BE业务实体的field记录所有权字段
     *
     * @return OWNER_FIELD - BE业务实体的field记录所有权字段
     */
    public String getOwnerField() {
        return ownerField;
    }

    /**
     * 设置BE业务实体的field记录所有权字段
     *
     * @param ownerField BE业务实体的field记录所有权字段
     */
    public void setOwnerField(String ownerField) {
        this.ownerField = ownerField;
    }

    /**
     * 获取自定义模式下基于的数据集id
     *
     * @return BASE_DS_ID - 自定义模式下基于的数据集id
     */
    public String getBaseDsId() {
        return baseDsId;
    }

    /**
     * 设置自定义模式下基于的数据集id
     *
     * @param baseDsId 自定义模式下基于的数据集id
     */
    public void setBaseDsId(String baseDsId) {
        this.baseDsId = baseDsId;
    }

    /**
     * 获取备注
     *
     * @return COMMENTS - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取生效标识
     *
     * @return ACTIVE_FLG - 生效标识
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标识
     *
     * @param activeFlg 生效标识
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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