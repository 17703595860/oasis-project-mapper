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
@Table(name = "TZ_ART_ADD_TYPE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzArtAddType {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 名称,唯一
     */
    @Column(name = "NAME")
    private String name;

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