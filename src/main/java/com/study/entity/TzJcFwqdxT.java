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
@Table(name = "TZ_JC_FWQDX_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJcFwqdxT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构ID
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程服务器名称
     */
    @Column(name = "TZ_JCFWQ_MC")
    private String tzJcfwqMc;

    /**
     * 服务器IP地址
     */
    @Column(name = "TZ_FWQ_IP")
    private String tzFwqIp;

    /**
     * 描述
     */
    @Column(name = "TZ_JCFWQ_MS")
    private String tzJcfwqMs;

    /**
     * 运行平台类型
     */
    @Column(name = "TZ_CZXT_LX")
    private String tzCzxtLx;

    /**
     * 任务循环读取间隔时间
     */
    @Column(name = "TZ_RWXH_JG")
    private Integer tzRwxhJg;

    /**
     * 最大并行任务数
     */
    @Column(name = "TZ_ZDBX_RWS")
    private Integer tzZdbxRws;

    /**
     * 备注
     */
    @Column(name = "TZ_BEIZHU")
    private String tzBeizhu;

    /**
     * 运行状态
     */
    @Column(name = "TZ_YXZT")
    private String tzYxzt;

    /**
     * 最近心跳时间
     */
    @Column(name = "TZ_ZJXTSJ")
    private Date tzZjxtsj;

    /**
     * 实例识别ID
     */
    @Column(name = "TZ_BS_SLID")
    private String tzBsSlid;

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