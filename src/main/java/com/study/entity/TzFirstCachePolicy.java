package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_FIRST_CACHE_POLICY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFirstCachePolicy {
    /**
     * Id
     */
    @Id
    @Column(name = "ID")
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
}