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
@Table(name = "TZ_JOIN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJoin {
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
     * 关联表名称
     */
    @Column(name = "DEST_TBL_NAME")
    private String destTblName;

    /**
     * 是否左外连接
     */
    @Column(name = "OUTER_JOIN")
    private String outerJoin;

    /**
     * 是否扩展表
     */
    @Column(name = "EXTENSION_FLG")
    private String extensionFlg;

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