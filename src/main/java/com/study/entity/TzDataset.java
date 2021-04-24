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
@Table(name = "TZ_DATASET")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDataset {
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
     * BE业务实体名称
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 数据集名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 显示名称
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * BE业务实体的field记录所有权字段
     */
    @Column(name = "OWNER_FIELD")
    private String ownerField;

    /**
     * 自定义模式下基于的数据集id
     */
    @Column(name = "BASE_DS_ID")
    private String baseDsId;

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