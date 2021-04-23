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
@Table(name = "TZ_SECONDARY_CACHE_POLICY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSecondaryCachePolicy {
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
     * 有效时间
     */
    @Column(name = "EXPIRE_TIME")
    private Integer expireTime;

    /**
     * 刷新时间
     */
    @Column(name = "PRELOAD_TIME")
    private Integer preloadTime;

    /**
     * 时间单位
     */
    @Column(name = "TIME_UNIT")
    private String timeUnit;

    /**
     * 强制刷新
     */
    @Column(name = "FORCE_REFRESH")
    private String forceRefresh;

    /**
     * 允许空值
     */
    @Column(name = "IS_ALLOW_NULL_VALUE")
    private String isAllowNullValue;

    /**
     * 时间倍率
     */
    @Column(name = "MAGNIFICATION")
    private Integer magnification;

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