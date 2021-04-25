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
@Table(name = "TZ_ART_ADD_TYPE_FIELD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzArtAddTypeField {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 内容类型,内容类型表外键
     */
    @Column(name = "TYPE_ID")
    private String typeId;

    /**
     * 类型的值,站点内容附加内容表里面附加字段
     */
    @Column(name = "FIELD_VALUE")
    private String fieldValue;

    /**
     * 类型的描述
     */
    @Column(name = "FIELD_DESC")
    private String fieldDesc;

    /**
     * 显示的排序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 是否启用,Y：启用N：不启用
     */
    @Column(name = "TYPE_ENABLE")
    private String typeEnable;

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