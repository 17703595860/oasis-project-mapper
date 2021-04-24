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
@Table(name = "TZ_JC_SHLI_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJcShliT {
    @Id
    @Column(name = "TZ_JCSL_ID")
    private Long tzJcslId;

    /**
     * 机构ID
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 运行控制ID
     */
    @Column(name = "TZ_YUNX_KZID")
    private String tzYunxKzid;

    /**
     * 用户
     */
    @Column(name = "TZ_DLZH_ID")
    private String tzDlzhId;

    /**
     * 进程名称
     */
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 循环
     */
    @Column(name = "TZ_XH_QZBDS")
    private String tzXhQzbds;

    /**
     * 服务器名称
     */
    @Column(name = "TZ_JCFWQ_MC")
    private String tzJcfwqMc;

    /**
     * 运行状态
     */
    @Column(name = "TZ_JOB_YXZT")
    private String tzJobYxzt;

    /**
     * 最近循环时间
     */
    @Column(name = "TZ_ZJXTSJ")
    private Date tzZjxtsj;

    /**
     * 请求创建时间
     */
    @Column(name = "TZ_QQCJ_DTTM")
    private Date tzQqcjDttm;

    /**
     * 可运行开始时间
     */
    @Column(name = "TZ_JHZX_DTTM")
    private Date tzJhzxDttm;

    /**
     * 进程开始时间
     */
    @Column(name = "TZ_JCKS_DTTM")
    private Date tzJcksDttm;

    /**
     * 进程结束时间
     */
    @Column(name = "TZ_JCJS_DTTM")
    private Date tzJcjsDttm;
}