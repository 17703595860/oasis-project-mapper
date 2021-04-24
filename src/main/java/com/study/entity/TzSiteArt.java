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
@Table(name = "TZ_SITE_ART")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSiteArt {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构编号,站点表外键
     */
    @Column(name = "SITE_ID")
    private String siteId;

    /**
     * 内容标题,唯一键
     */
    @Column(name = "ART_TITLE")
    private String artTitle;

    /**
     * 带样式标题
     */
    @Column(name = "ART_TITLE_STYLE")
    private String artTitleStyle;

    /**
     * 短标题
     */
    @Column(name = "ART_SHORTTITLE")
    private String artShorttitle;

    /**
     * 副标题
     */
    @Column(name = "SUBHEAD")
    private String subhead;

    /**
     * 内容附加字段类型,内容类型表主键
     */
    @Column(name = "ART_ADD_TYPE")
    private String artAddType;

    /**
     * 内容类型,A:自建文章B:外部引用
     */
    @Column(name = "ART_TYPE")
    private String artType;

    /**
     * 开始日期,用于活动
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 开始时间,用于活动
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 开始日期,用于活动
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 开始时间,用于活动
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 外部链接URL
     */
    @Column(name = "OUT_ART_URL")
    private String outArtUrl;

    /**
     * META描述
     */
    @Column(name = "METADESC")
    private String metadesc;

    /**
     * 编辑模式,A:富文本编辑器B:文本编辑器
     */
    @Column(name = "ART_EDITTYPE")
    private String artEdittype;

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
     * 具体内容
     */
    @Column(name = "ART_CONENT")
    private String artConent;

    /**
     * METAkey
     */
    @Column(name = "METAKEYS")
    private String metakeys;

    /**
     * 内容简介
     */
    @Column(name = "ABOUT")
    private String about;
}