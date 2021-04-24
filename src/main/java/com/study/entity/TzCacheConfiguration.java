package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/24
*/
@Table(name = "TZ_CACHE_CONFIGURATION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCacheConfiguration {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
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
}