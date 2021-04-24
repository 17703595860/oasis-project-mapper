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
@Table(name = "TZ_FILTER_PT_FLD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFilterPtFld {
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
     * 可配置搜索字段ID
     */
    @Column(name = "FILTER_FLD_ID")
    private String filterFldId;

    /**
     * Prompt定义id
     */
    @Column(name = "PT_DEF_ID")
    private String ptDefId;

    /**
     * 可配置查询BE字段ID
     */
    @Column(name = "SRC_FLD_ID")
    private String srcFldId;

    /**
     * PromptBE的字段ID号
     */
    @Column(name = "DEST_FLD_ID")
    private String destFldId;

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