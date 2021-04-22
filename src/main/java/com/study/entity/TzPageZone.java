package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_PAGE_ZONE")
@NoArgsConstructor
@AllArgsConstructor
public class TzPageZone {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * PageId
     */
    @Column(name = "PAGE_ID")
    private String pageId;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * BENAME
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 默认DISPLAYFRAME外键
     */
    @Column(name = "DEFAULT_DISPFRAME_ID")
    private String defaultDispframeId;

    /**
     * 是否有数据权限控制
     */
    @Column(name = "DATASET_FLG")
    private String datasetFlg;

    /**
     * 同一个PAGE内的父PAGEZONE_ID
     */
    @Column(name = "PAR_PAGEZONE_ID")
    private String parPagezoneId;

    /**
     * 区块的排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 区块的功能权限
     */
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * 区块的消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 区块的消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * 是否有效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

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
     * 修改人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 修改时间
     */
    @Column(name = "LAST_UPD")
    private Date lastUpd;

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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取PageId
     *
     * @return PAGE_ID - PageId
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * 设置PageId
     *
     * @param pageId PageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
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
     * 获取BENAME
     *
     * @return BE_NAME - BENAME
     */
    public String getBeName() {
        return beName;
    }

    /**
     * 设置BENAME
     *
     * @param beName BENAME
     */
    public void setBeName(String beName) {
        this.beName = beName;
    }

    /**
     * 获取默认DISPLAYFRAME外键
     *
     * @return DEFAULT_DISPFRAME_ID - 默认DISPLAYFRAME外键
     */
    public String getDefaultDispframeId() {
        return defaultDispframeId;
    }

    /**
     * 设置默认DISPLAYFRAME外键
     *
     * @param defaultDispframeId 默认DISPLAYFRAME外键
     */
    public void setDefaultDispframeId(String defaultDispframeId) {
        this.defaultDispframeId = defaultDispframeId;
    }

    /**
     * 获取是否有数据权限控制
     *
     * @return DATASET_FLG - 是否有数据权限控制
     */
    public String getDatasetFlg() {
        return datasetFlg;
    }

    /**
     * 设置是否有数据权限控制
     *
     * @param datasetFlg 是否有数据权限控制
     */
    public void setDatasetFlg(String datasetFlg) {
        this.datasetFlg = datasetFlg;
    }

    /**
     * 获取同一个PAGE内的父PAGEZONE_ID
     *
     * @return PAR_PAGEZONE_ID - 同一个PAGE内的父PAGEZONE_ID
     */
    public String getParPagezoneId() {
        return parPagezoneId;
    }

    /**
     * 设置同一个PAGE内的父PAGEZONE_ID
     *
     * @param parPagezoneId 同一个PAGE内的父PAGEZONE_ID
     */
    public void setParPagezoneId(String parPagezoneId) {
        this.parPagezoneId = parPagezoneId;
    }

    /**
     * 获取区块的排列顺序
     *
     * @return SEQ - 区块的排列顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置区块的排列顺序
     *
     * @param seq 区块的排列顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取区块的功能权限
     *
     * @return PERMISSION_ID - 区块的功能权限
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 设置区块的功能权限
     *
     * @param permissionId 区块的功能权限
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取区块的消息CODE
     *
     * @return LABEL_MESSAGE_CODE - 区块的消息CODE
     */
    public String getLabelMessageCode() {
        return labelMessageCode;
    }

    /**
     * 设置区块的消息CODE
     *
     * @param labelMessageCode 区块的消息CODE
     */
    public void setLabelMessageCode(String labelMessageCode) {
        this.labelMessageCode = labelMessageCode;
    }

    /**
     * 获取区块的消息覆盖值
     *
     * @return LABEL_OVERRIDE - 区块的消息覆盖值
     */
    public String getLabelOverride() {
        return labelOverride;
    }

    /**
     * 设置区块的消息覆盖值
     *
     * @param labelOverride 区块的消息覆盖值
     */
    public void setLabelOverride(String labelOverride) {
        this.labelOverride = labelOverride;
    }

    /**
     * 获取是否有效
     *
     * @return ACTIVE_FLG - 是否有效
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置是否有效
     *
     * @param activeFlg 是否有效
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
     * 获取修改人
     *
     * @return LAST_UPD_BY - 修改人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置修改人
     *
     * @param lastUpdBy 修改人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取修改时间
     *
     * @return LAST_UPD - 修改时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置修改时间
     *
     * @param lastUpd 修改时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}