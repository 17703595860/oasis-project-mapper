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
@Table(name = "TZ_BMENTITY_DATASET")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzBmentityDataset {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * BMENTITY表外键
     */
    @Column(name = "BMENTITY_ID")
    private String bmentityId;

    /**
     * 数据集类型
     */
    @Column(name = "DATASET_TYPE")
    private String datasetType;

    /**
     * 数据集ID
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 数据集展现字段方案id
     */
    @Column(name = "DISPSCHEME_ID")
    private String dispschemeId;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

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