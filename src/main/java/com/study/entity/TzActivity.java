package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_ACTIVITY")
public class TzActivity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 主题
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 优先级
     */
    @Column(name = "PRIORITY")
    private String priority;

    /**
     * 截止日期
     */
    @Column(name = "ENDDATE")
    private Date enddate;

    /**
     * 商机ID
     */
    @Column(name = "OPPTY_ID")
    private String opptyId;

    /**
     * 客户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 执行结果
     */
    @Column(name = "OUTCOME")
    private String outcome;

    /**
     * ‘Y’-活动的 ‘N’-已关闭
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 负责人ID
     */
    @Column(name = "OWNER_ID")
    private String ownerId;

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
     * 获取主题
     *
     * @return NAME - 主题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置主题
     *
     * @param name 主题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取优先级
     *
     * @return PRIORITY - 优先级
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * 获取截止日期
     *
     * @return ENDDATE - 截止日期
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置截止日期
     *
     * @param enddate 截止日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 获取商机ID
     *
     * @return OPPTY_ID - 商机ID
     */
    public String getOpptyId() {
        return opptyId;
    }

    /**
     * 设置商机ID
     *
     * @param opptyId 商机ID
     */
    public void setOpptyId(String opptyId) {
        this.opptyId = opptyId;
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
     * 获取执行结果
     *
     * @return OUTCOME - 执行结果
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * 设置执行结果
     *
     * @param outcome 执行结果
     */
    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    /**
     * 获取‘Y’-活动的 ‘N’-已关闭
     *
     * @return ACTIVE_FLG - ‘Y’-活动的 ‘N’-已关闭
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置‘Y’-活动的 ‘N’-已关闭
     *
     * @param activeFlg ‘Y’-活动的 ‘N’-已关闭
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
    }

    /**
     * 获取负责人ID
     *
     * @return OWNER_ID - 负责人ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 设置负责人ID
     *
     * @param ownerId 负责人ID
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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