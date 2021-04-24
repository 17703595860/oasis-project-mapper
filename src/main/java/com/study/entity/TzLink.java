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
@Table(name = "TZ_LINK")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzLink {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 查询条件
     */
    @Column(name = "SRCHSPEC")
    private String srchspec;

    /**
     * 父BE名称
     */
    @Column(name = "PARENT_BE_NAME")
    private String parentBeName;

    /**
     * 子BE名称	
     */
    @Column(name = "CHILD_BE_NAME")
    private String childBeName;

    /**
     * 父BE字段名称
     */
    @Column(name = "SRC_FLD_NAME")
    private String srcFldName;

    /**
     * 子BE字段名称
     */
    @Column(name = "DST_FLD_NAME")
    private String dstFldName;

    /**
     * 中间表名称
     */
    @Column(name = "INTER_TBL_NAME")
    private String interTblName;

    /**
     * 中间表关联父BE的Column名称
     */
    @Column(name = "IPARENT_COL_NAME")
    private String iparentColName;

    /**
     * 中间表关联子BE的Column名称
     */
    @Column(name = "ICHILD_COL_NAME")
    private String ichildColName;

    /**
     * 所属模块
     */
    @Column(name = "MODULE")
    private String module;

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
}