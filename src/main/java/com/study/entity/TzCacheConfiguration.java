package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_CACHE_CONFIGURATION")
public class TzCacheConfiguration {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 配置名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * Bean
     */
    @Column(name = "BEAN_NAME")
    private String beanName;

    /**
     * Method
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 操作类型
     */
    @Column(name = "OPERATION_TYPE")
    private String operationType;

    /**
     * 缓存名称
     */
    @Column(name = "CACHE_NAME")
    private String cacheName;

    /**
     * 缓存描述
     */
    @Column(name = "CACHE_DEPICT")
    private String cacheDepict;

    /**
     * 是否开启一级缓存
     */
    @Column(name = "ENABLE_FIRST_CACHE")
    private String enableFirstCache;

    /**
     * 是否删除所有缓存
     */
    @Column(name = "REMOVE_ALL_ENTRIES")
    private String removeAllEntries;

    /**
     * 一级缓存策略
     */
    @Column(name = "FIRST_CACHE_POLICY_ID")
    private String firstCachePolicyId;

    /**
     * 二级缓存策略
     */
    @Column(name = "SECONDARY_CACHE_POLICY_ID")
    private String secondaryCachePolicyId;

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
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取配置名称
     *
     * @return NAME - 配置名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置配置名称
     *
     * @param name 配置名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取Bean
     *
     * @return BEAN_NAME - Bean
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 设置Bean
     *
     * @param beanName Bean
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    /**
     * 获取Method
     *
     * @return METHOD_NAME - Method
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置Method
     *
     * @param methodName Method
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取操作类型
     *
     * @return OPERATION_TYPE - 操作类型
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 设置操作类型
     *
     * @param operationType 操作类型
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * 获取缓存名称
     *
     * @return CACHE_NAME - 缓存名称
     */
    public String getCacheName() {
        return cacheName;
    }

    /**
     * 设置缓存名称
     *
     * @param cacheName 缓存名称
     */
    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

    /**
     * 获取缓存描述
     *
     * @return CACHE_DEPICT - 缓存描述
     */
    public String getCacheDepict() {
        return cacheDepict;
    }

    /**
     * 设置缓存描述
     *
     * @param cacheDepict 缓存描述
     */
    public void setCacheDepict(String cacheDepict) {
        this.cacheDepict = cacheDepict;
    }

    /**
     * 获取是否开启一级缓存
     *
     * @return ENABLE_FIRST_CACHE - 是否开启一级缓存
     */
    public String getEnableFirstCache() {
        return enableFirstCache;
    }

    /**
     * 设置是否开启一级缓存
     *
     * @param enableFirstCache 是否开启一级缓存
     */
    public void setEnableFirstCache(String enableFirstCache) {
        this.enableFirstCache = enableFirstCache;
    }

    /**
     * 获取是否删除所有缓存
     *
     * @return REMOVE_ALL_ENTRIES - 是否删除所有缓存
     */
    public String getRemoveAllEntries() {
        return removeAllEntries;
    }

    /**
     * 设置是否删除所有缓存
     *
     * @param removeAllEntries 是否删除所有缓存
     */
    public void setRemoveAllEntries(String removeAllEntries) {
        this.removeAllEntries = removeAllEntries;
    }

    /**
     * 获取一级缓存策略
     *
     * @return FIRST_CACHE_POLICY_ID - 一级缓存策略
     */
    public String getFirstCachePolicyId() {
        return firstCachePolicyId;
    }

    /**
     * 设置一级缓存策略
     *
     * @param firstCachePolicyId 一级缓存策略
     */
    public void setFirstCachePolicyId(String firstCachePolicyId) {
        this.firstCachePolicyId = firstCachePolicyId;
    }

    /**
     * 获取二级缓存策略
     *
     * @return SECONDARY_CACHE_POLICY_ID - 二级缓存策略
     */
    public String getSecondaryCachePolicyId() {
        return secondaryCachePolicyId;
    }

    /**
     * 设置二级缓存策略
     *
     * @param secondaryCachePolicyId 二级缓存策略
     */
    public void setSecondaryCachePolicyId(String secondaryCachePolicyId) {
        this.secondaryCachePolicyId = secondaryCachePolicyId;
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