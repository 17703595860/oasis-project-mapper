package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FIRST_CACHE_POLICY")
public class TzFirstCachePolicy {
    /**
     * Id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 策略名称
     */
    @Column(name = "POLICY_NAME")
    private String policyName;

    /**
     * 初始Size
     */
    @Column(name = "INITIAL_CAPACITY")
    private Integer initialCapacity;

    /**
     * 最大Size
     */
    @Column(name = "MAXIMUM_SIZE")
    private Integer maximumSize;

    /**
     * 有效时间
     */
    @Column(name = "EXPIRE_TIME")
    private Integer expireTime;

    /**
     * 时间单位
     */
    @Column(name = "TIME_UNIT")
    private String timeUnit;

    /**
     * 失效模式
     */
    @Column(name = "EXPIRE_MODE")
    private String expireMode;

    /**
     * 生效标志
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    /**
     * 获取Id
     *
     * @return ID - Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置Id
     *
     * @param id Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取策略名称
     *
     * @return POLICY_NAME - 策略名称
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * 设置策略名称
     *
     * @param policyName 策略名称
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * 获取初始Size
     *
     * @return INITIAL_CAPACITY - 初始Size
     */
    public Integer getInitialCapacity() {
        return initialCapacity;
    }

    /**
     * 设置初始Size
     *
     * @param initialCapacity 初始Size
     */
    public void setInitialCapacity(Integer initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    /**
     * 获取最大Size
     *
     * @return MAXIMUM_SIZE - 最大Size
     */
    public Integer getMaximumSize() {
        return maximumSize;
    }

    /**
     * 设置最大Size
     *
     * @param maximumSize 最大Size
     */
    public void setMaximumSize(Integer maximumSize) {
        this.maximumSize = maximumSize;
    }

    /**
     * 获取有效时间
     *
     * @return EXPIRE_TIME - 有效时间
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    /**
     * 设置有效时间
     *
     * @param expireTime 有效时间
     */
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取时间单位
     *
     * @return TIME_UNIT - 时间单位
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * 设置时间单位
     *
     * @param timeUnit 时间单位
     */
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * 获取失效模式
     *
     * @return EXPIRE_MODE - 失效模式
     */
    public String getExpireMode() {
        return expireMode;
    }

    /**
     * 设置失效模式
     *
     * @param expireMode 失效模式
     */
    public void setExpireMode(String expireMode) {
        this.expireMode = expireMode;
    }

    /**
     * 获取生效标志
     *
     * @return ACTIVE_FLG - 生效标志
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标志
     *
     * @param activeFlg 生效标志
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
}