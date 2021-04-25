package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/25
*/
@Table(name = "TZ_SYSTEM_PARAMETER")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSystemParameter {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 参数码值
     */
    @Column(name = "PARAMETER_CODE")
    private String parameterCode;

    /**
     * 参数vlaue
     */
    @Column(name = "PARAMETER_VALUE")
    private String parameterValue;

    /**
     * 参数描述
     */
    @Column(name = "PARAMETER_DESC")
    private String parameterDesc;

    /**
     * 参数详细描述
     */
    @Column(name = "PARAMETER_LONG_DESC")
    private String parameterLongDesc;

    /**
     * 类型 0-平台基础配置 1业务配置)
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 所属模块 0-系统管理 1-机构管理 2-用户管理 3-功能权限 4-数据权限
     */
    @Column(name = "MODULE")
    private Byte module;

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