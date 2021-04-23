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
@Table(name = "TZ_DISPFRAME_ELEMENT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDispframeElement {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 数据集展现字段方案Id
     */
    @Column(name = "DISPFRAME_ID")
    private String dispframeId;

    /**
     * 元素名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 展现元素类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 字段Id
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

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
     * 小数型位数
     */
    @Column(name = "SCALE")
    private Integer scale;

    /**
     * 是否必须
     */
    @Column(name = "FLD_REQUIRED")
    private String fldRequired;

    /**
     * 控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

    /**
     * PT对应BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * PormptId
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
     * 是否跳转
     */
    @Column(name = "FLD_DRILLDOWN")
    private String fldDrilldown;

    /**
     * 跳转带过去的源ID字段
     */
    @Column(name = "DRILLDOWN_SOURCE_ID")
    private String drilldownSourceId;

    /**
     * 消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * buttonId
     */
    @Column(name = "BUTTON_CODE")
    private String buttonCode;

    /**
     * 点击弹出的页面框架
     */
    @Column(name = "BUTTON_TRIGGER_FRAMEID")
    private String buttonTriggerFrameid;

    /**
     * 展示顺序
     */
    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

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