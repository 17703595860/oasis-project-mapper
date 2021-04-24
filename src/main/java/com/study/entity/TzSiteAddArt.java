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
@Table(name = "TZ_SITE_ADD_ART")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzSiteAddArt {
    /**
     * 主键,雪花算法和TZ_SITE_ART表一致
     */
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "TZ_TXT1")
    private String tzTxt1;

    @Column(name = "TZ_TXT2")
    private String tzTxt2;

    @Column(name = "TZ_TXT3")
    private String tzTxt3;

    @Column(name = "TZ_TXT4")
    private String tzTxt4;

    @Column(name = "TZ_DATE1")
    private Date tzDate1;

    @Column(name = "TZ_DATE2")
    private Date tzDate2;

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

    @Column(name = "TZ_LONG1")
    private String tzLong1;

    @Column(name = "TZ_LONG2")
    private String tzLong2;

    @Column(name = "TZ_LONG3")
    private String tzLong3;
}