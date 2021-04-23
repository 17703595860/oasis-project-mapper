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
@Table(name = "TZ_JINC_DY_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJincDyT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构编号
     */
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程名称
     */
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 进程描述
     */
    @Column(name = "TZ_JC_MS")
    private String tzJcMs;

    /**
     * 运行平台类型
     */
    @Column(name = "TZ_YXPT_LX")
    private String tzYxptLx;

    /**
     * 备注
     */
    @Column(name = "TZ_BEIZHU")
    private String tzBeizhu;

    /**
     * 组件ID
     */
    @Column(name = "TZ_ZCZJ_ID")
    private String tzZczjId;

    /**
     * java类
     */
    @Column(name = "TZ_JAVA_CLASS")
    private String tzJavaClass;

    /**
     * 是否自动重启
     */
    @Column(name = "TZ_IS_DISPATCH")
    private String tzIsDispatch;

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