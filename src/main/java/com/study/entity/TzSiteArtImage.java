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
@Table(name = "TZ_SITE_ART_IMAGE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSiteArtImage {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 内容ID
     */
    @Column(name = "ART_ID")
    private String artId;

    /**
     * 图片类型,A:标题图B:图片墙，标题图最多只有一张，图片墙可以有多张
     */
    @Column(name = "IMAGE_TYPE")
    private String imageType;

    /**
     * 标题图标题
     */
    @Column(name = "IMAGE_TITLE")
    private String imageTitle;

    /**
     * 标题图描述
     */
    @Column(name = "IMAGE_DESC")
    private String imageDesc;

    /**
     * 图片跳转URL
     */
    @Column(name = "IMG_TRS_URL")
    private String imgTrsUrl;

    /**
     * 图片排序,用于图片墙
     */
    @Column(name = "IMG_SORT")
    private Integer imgSort;

    /**
     * 附件表ID
     */
    @Column(name = "FILE_ID")
    private String fileId;

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