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
@Table(name = "TZ_BUSENTITY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzBusentity {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * BE实现类名称
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * BE主表名称
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * BE查询条件
     */
    @Column(name = "SRCHSPEC")
    private String srchspec;

    /**
     * 数据源
     */
    @Column(name = "DATA_SOURCE")
    private String dataSource;

    /**
     * 是否使用外部数据源
     */
    @Column(name = "EBE_FLG")
    private String ebeFlg;

    /**
     * 消息集合id
     */
    @Column(name = "MSG_COLLECTION_ID")
    private String msgCollectionId;

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