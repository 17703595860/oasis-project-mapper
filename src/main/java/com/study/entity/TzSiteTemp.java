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
@Table(name = "TZ_SITE_TEMP")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSiteTemp {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 所属站点,站点表外键
     */
    @Column(name = "SITE_ID")
    private String siteId;

    /**
     * 模板名称,唯一键
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 模板类型,A：单页B:列表
     */
    @Column(name = "TEMP_TYPE")
    private String tempType;

    /**
     * 是否启用,Y：启用N：不启用
     */
    @Column(name = "TEMP_ENABLE")
    private String tempEnable;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

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
     * PC模板
     */
    @Column(name = "TZ_TEMP_PCCODE")
    private String tzTempPccode;

    /**
     * 手机模板
     */
    @Column(name = "TZ_TEMP_MSCODE")
    private String tzTempMscode;
}