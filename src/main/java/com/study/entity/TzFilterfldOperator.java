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
@Table(name = "TZ_FILTERFLD_OPERATOR")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFilterfldOperator {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 元数据定义字段ID
     */
    @Column(name = "FILTER_FIELD_ID")
    private String filterFieldId;

    /**
     * 运算符
     */
    @Column(name = "OPERTOR")
    private String opertor;

    /**
     * 是否启用
     */
    @Column(name = "IS_ACTIVE")
    private String isActive;

    /**
     * 是否默认操作运算符
     */
    @Column(name = "IS_DEF_OPRT")
    private String isDefOprt;

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