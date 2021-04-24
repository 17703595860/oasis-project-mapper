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
@Table(name = "TZ_DS_QRYCONDITON")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDsQryconditon {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 数据集id
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 条件与/或
     */
    @Column(name = "OPER_CONDITION")
    private String operCondition;

    /**
     * 左括号
     */
    @Column(name = "LEFT_BRACKET")
    private String leftBracket;

    /**
     * 字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 操作符
     */
    @Column(name = "OPERATOR")
    private String operator;

    /**
     * 字段取值
     */
    @Column(name = "FIELD_VAL")
    private String fieldVal;

    /**
     * 右括号
     */
    @Column(name = "RIGHT_BRACKET")
    private String rightBracket;

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