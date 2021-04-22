package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILTERFLD_OPERATOR")
public class TzFilterfldOperator {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 元数据定义字段ID
     */
    @Column(name = "FILTER_FIELD_ID")
    private String filterFieldId;

    /**
     * 运算符
     */
    @Column(name = "OPERTOR")
    private String opertor;

    /**
     * 是否启用
     */
    @Column(name = "IS_ACTIVE")
    private String isActive;

    /**
     * 是否默认操作运算符
     */
    @Column(name = "IS_DEF_OPRT")
    private String isDefOprt;

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
     * 获取元数据定义字段ID
     *
     * @return FILTER_FIELD_ID - 元数据定义字段ID
     */
    public String getFilterFieldId() {
        return filterFieldId;
    }

    /**
     * 设置元数据定义字段ID
     *
     * @param filterFieldId 元数据定义字段ID
     */
    public void setFilterFieldId(String filterFieldId) {
        this.filterFieldId = filterFieldId;
    }

    /**
     * 获取运算符
     *
     * @return OPERTOR - 运算符
     */
    public String getOpertor() {
        return opertor;
    }

    /**
     * 设置运算符
     *
     * @param opertor 运算符
     */
    public void setOpertor(String opertor) {
        this.opertor = opertor;
    }

    /**
     * 获取是否启用
     *
     * @return IS_ACTIVE - 是否启用
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * 设置是否启用
     *
     * @param isActive 是否启用
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    /**
     * 获取是否默认操作运算符
     *
     * @return IS_DEF_OPRT - 是否默认操作运算符
     */
    public String getIsDefOprt() {
        return isDefOprt;
    }

    /**
     * 设置是否默认操作运算符
     *
     * @param isDefOprt 是否默认操作运算符
     */
    public void setIsDefOprt(String isDefOprt) {
        this.isDefOprt = isDefOprt;
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