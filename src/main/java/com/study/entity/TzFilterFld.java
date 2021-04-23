package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_FILTER_FLD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFilterFld {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 可配置搜索ID
     */
    @Column(name = "FILTER_ID")
    private String filterId;

    /**
     * 元数据定义字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 元数据定义字段描述
     */
    @Column(name = "FIELD_DESC")
    private String fieldDesc;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 转换值编号
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

    /**
     * Prompt对应的BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * Prompt定义id
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 是否只读
     */
    @Column(name = "FLD_READONLY")
    private String fldReadonly;

    /**
     * 是否隐藏
     */
    @Column(name = "FLD_HIDE")
    private String fldHide;

    /**
     * 是否下拉框
     */
    @Column(name = "FLD_ISDOWN")
    private String fldIsdown;

    /**
     * field字段对应tagCode
     */
    @Column(name = "FIELD_TAG_CODE")
    private String fieldTagCode;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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