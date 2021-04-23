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
@Table(name = "TZ_AQ_JCDD_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzAqJcddT {
    /**
     * CLASSID
     */
    @Id
    @Column(name = "CLASSID")
    private String classid;

    /**
     * 功能组件ID
     */
    @Id
    @Column(name = "TZ_COM_ID")
    private String tzComId;

    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程名称
     */
    @Id
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 是否启用
     */
    @Column(name = "TZ_DD_FLG")
    private String tzDdFlg;

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