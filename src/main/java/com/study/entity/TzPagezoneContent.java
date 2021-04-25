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
@Table(name = "TZ_PAGEZONE_CONTENT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPagezoneContent {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * Page区块外键
     */
    @Column(name = "PAGEZONE_ID")
    private String pagezoneId;

    /**
     * 数据集ID
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 数据集顺序
     */
    @Column(name = "DATASET_SEQ")
    private Integer datasetSeq;

    /**
     * 展示框架外键
     */
    @Column(name = "DISPLAYFRAME_ID")
    private String displayframeId;

    /**
     * 是否有效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 修改人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 修改时间
     */
    @Column(name = "LAST_UPD")
    private Date lastUpd;
}