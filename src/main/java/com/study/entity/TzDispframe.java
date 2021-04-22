package com.study.entity;

import lombok.AllArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DISPFRAME")
@AllArgsConstructor
public class TzDispframe {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 业务实体ID
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * BE名称
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 展示框架名称
     */
    @Column(name = "DISPFRAME_NAME")
    private String dispframeName;

    /**
     * 展示要素类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * 可配置搜索ID
     */
    @Column(name = "FILTER_DEF_ID")
    private String filterDefId;

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
     * 获取业务实体ID
     *
     * @return BE_ID - 业务实体ID
     */
    public String getBeId() {
        return beId;
    }

    /**
     * 设置业务实体ID
     *
     * @param beId 业务实体ID
     */
    public void setBeId(String beId) {
        this.beId = beId;
    }

    /**
     * 获取BE名称
     *
     * @return BE_NAME - BE名称
     */
    public String getBeName() {
        return beName;
    }

    /**
     * 设置BE名称
     *
     * @param beName BE名称
     */
    public void setBeName(String beName) {
        this.beName = beName;
    }

    /**
     * 获取展示框架名称
     *
     * @return DISPFRAME_NAME - 展示框架名称
     */
    public String getDispframeName() {
        return dispframeName;
    }

    /**
     * 设置展示框架名称
     *
     * @param dispframeName 展示框架名称
     */
    public void setDispframeName(String dispframeName) {
        this.dispframeName = dispframeName;
    }

    /**
     * 获取展示要素类型
     *
     * @return TYPE - 展示要素类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置展示要素类型
     *
     * @param type 展示要素类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取消息CODE
     *
     * @return LABEL_MESSAGE_CODE - 消息CODE
     */
    public String getLabelMessageCode() {
        return labelMessageCode;
    }

    /**
     * 设置消息CODE
     *
     * @param labelMessageCode 消息CODE
     */
    public void setLabelMessageCode(String labelMessageCode) {
        this.labelMessageCode = labelMessageCode;
    }

    /**
     * 获取消息覆盖值
     *
     * @return LABEL_OVERRIDE - 消息覆盖值
     */
    public String getLabelOverride() {
        return labelOverride;
    }

    /**
     * 设置消息覆盖值
     *
     * @param labelOverride 消息覆盖值
     */
    public void setLabelOverride(String labelOverride) {
        this.labelOverride = labelOverride;
    }

    /**
     * 获取可配置搜索ID
     *
     * @return FILTER_DEF_ID - 可配置搜索ID
     */
    public String getFilterDefId() {
        return filterDefId;
    }

    /**
     * 设置可配置搜索ID
     *
     * @param filterDefId 可配置搜索ID
     */
    public void setFilterDefId(String filterDefId) {
        this.filterDefId = filterDefId;
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