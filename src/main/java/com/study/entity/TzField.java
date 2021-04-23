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
@Table(name = "TZ_FIELD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzField {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * BE表外键
     */
    @Column(name = "BUSENTITY_ID")
    private String busentityId;

    /**
     * Join名称
     */
    @Column(name = "JOIN_NAME")
    private String joinName;

    /**
     * 对应表Column名称
     */
    @Column(name = "COL_NAME")
    private String colName;

    /**
     * 是否计算字段
     */
    @Column(name = "CALCULATED")
    private String calculated;

    /**
     * 计算字段内容
     */
    @Column(name = "CALCVAL")
    private String calcval;

    /**
     * 字段类型
     */
    @Column(name = "DATA_TYPE")
    private String dataType;

    /**
     * 字符长度
     */
    @Column(name = "TEXTLEN")
    private Integer textlen;

    /**
     * 数字型位数
     */
    @Column(name = "PREC_NUM")
    private Integer precNum;

    /**
     * 小数位数
     */
    @Column(name = "SCALE")
    private Integer scale;

    /**
     * 是否必须字段
     */
    @Column(name = "REQUIRED")
    private String required;

    /**
     * 是否强制激活
     */
    @Column(name = "FORCEACTIVE")
    private String forceactive;

    /**
     * 生效标识
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

    /**
     * 前端控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * Prompt对应BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * 对应转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;
}