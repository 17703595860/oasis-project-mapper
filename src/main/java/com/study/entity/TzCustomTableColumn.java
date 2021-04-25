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
@Table(name = "TZ_CUSTOM_TABLE_COLUMN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCustomTableColumn {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 表名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 数据集ID
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 可解析的显示隐藏列信息
     */
    @Column(name = "INFO")
    private String info;

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