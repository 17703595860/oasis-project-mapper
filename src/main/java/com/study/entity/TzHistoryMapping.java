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
@Table(name = "TZ_HISTORY_MAPPING")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzHistoryMapping {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 导入历史id
     */
    @Column(name = "HISTORY_ID")
    private String historyId;

    /**
     * 导入模板字段名称
     */
    @Column(name = "FIELD_NAME")
    private String fieldName;

    /**
     * 模板字段对应的预留字段
     */
    @Column(name = "FIELD_INDEX")
    private String fieldIndex;

    /**
     * 排序，序号
     */
    @Column(name = "SEQUENCE")
    private Integer sequence;

    /**
     * 字段描述（导入历史对应的 快照）
     */
    @Column(name = "DESCRIPTION")
    private String description;

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