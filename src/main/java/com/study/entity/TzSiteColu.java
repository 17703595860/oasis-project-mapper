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
@Table(name = "TZ_SITE_COLU")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSiteColu {
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
     * 栏目名称,唯一键
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 栏目类型,A：单页B:列表C:跳转D:活动
     */
    @Column(name = "COLU_TYPE")
    private String coluType;

    /**
     * 是否启用,Y：启用N：不启用
     */
    @Column(name = "COLU_ENABLE")
    private String coluEnable;

    /**
     * 栏目路径
     */
    @Column(name = "COLE_PATH")
    private String colePath;

    /**
     * 站点模板,模板表主键
     */
    @Column(name = "TEMP_ID")
    private String tempId;

    /**
     * 内容类型,内容类型表主键
     */
    @Column(name = "ART_TYPE_ID")
    private String artTypeId;

    /**
     * 上级栏目,用于树型栏目
     */
    @Column(name = "F_COLU_ID")
    private String fColuId;

    /**
     * 栏目级别,用于树型栏目，从0开始
     */
    @Column(name = "COLU_LEVEL")
    private Integer coluLevel;

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
}