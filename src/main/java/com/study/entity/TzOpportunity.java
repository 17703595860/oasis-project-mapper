package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_OPPORTUNITY")
public class TzOpportunity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 商机名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 商机编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 客户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 商机状态 0-未开始 1-进行中 2-已关闭
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 预签单金额
     */
    @Column(name = "AMT")
    private Long amt;

    /**
     * 销售阶段
     */
    @Column(name = "STAGE")
    private String stage;

    /**
     * 可能性
     */
    @Column(name = "POSSIBLE")
    private Integer possible;

    /**
     * 销售职位ID
     */
    @Column(name = "POSTN_ID")
    private String postnId;

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
     * 获取商机名称
     *
     * @return NAME - 商机名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商机名称
     *
     * @param name 商机名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商机编号
     *
     * @return CODE - 商机编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置商机编号
     *
     * @param code 商机编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取客户ID
     *
     * @return CUSTOMER_ID - 客户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户ID
     *
     * @param customerId 客户ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取商机状态 0-未开始 1-进行中 2-已关闭
     *
     * @return STATUS - 商机状态 0-未开始 1-进行中 2-已关闭
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置商机状态 0-未开始 1-进行中 2-已关闭
     *
     * @param status 商机状态 0-未开始 1-进行中 2-已关闭
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取预签单金额
     *
     * @return AMT - 预签单金额
     */
    public Long getAmt() {
        return amt;
    }

    /**
     * 设置预签单金额
     *
     * @param amt 预签单金额
     */
    public void setAmt(Long amt) {
        this.amt = amt;
    }

    /**
     * 获取销售阶段
     *
     * @return STAGE - 销售阶段
     */
    public String getStage() {
        return stage;
    }

    /**
     * 设置销售阶段
     *
     * @param stage 销售阶段
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * 获取可能性
     *
     * @return POSSIBLE - 可能性
     */
    public Integer getPossible() {
        return possible;
    }

    /**
     * 设置可能性
     *
     * @param possible 可能性
     */
    public void setPossible(Integer possible) {
        this.possible = possible;
    }

    /**
     * 获取销售职位ID
     *
     * @return POSTN_ID - 销售职位ID
     */
    public String getPostnId() {
        return postnId;
    }

    /**
     * 设置销售职位ID
     *
     * @param postnId 销售职位ID
     */
    public void setPostnId(String postnId) {
        this.postnId = postnId;
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