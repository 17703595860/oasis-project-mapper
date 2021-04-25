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
@Table(name = "TZ_PT_FIELD_DEF")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPtFieldDef {
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
     * PT
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 是否展示
     */
    @Column(name = "DISPLAY_FLG")
    private String displayFlg;

    /**
     * 展示顺序
     */
    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    /**
     * 展示名称
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * field字段对应tagCode
     */
    @Column(name = "TAG_CODE")
    private String tagCode;

    /**
     * 是否作为PT上的搜索条件
     */
    @Column(name = "SEARCH_FLG")
    private String searchFlg;

    /**
     * 前端控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * 对应转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;
}