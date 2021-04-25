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
@Table(name = "TZ_FILTER_DFN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFilterDfn {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * BE业务实体id
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * 可配置搜索名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 返回搜索结果最大行数
     */
    @Column(name = "RESULT_MAX_NUM")
    private Integer resultMaxNum;

    /**
     * 默认进入高级搜索模式
     */
    @Column(name = "ADVANCE_MODEL")
    private String advanceModel;

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