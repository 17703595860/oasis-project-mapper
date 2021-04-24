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
@Table(name = "TZ_PT_DEF")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPtDef {
    @Id
    @Column(name = "ID")
    private String id;

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

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * PT名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 业务组件
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * 其他查询条件
     */
    @Column(name = "SEARCHSPEC")
    private String searchspec;

    /**
     * 数据权限
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * PtLable字段
     */
    @Column(name = "LABEL_FIELD")
    private String labelField;

    /**
     * PtValue字段
     */
    @Column(name = "VALUE_FIELD")
    private String valueField;
}