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
@Table(name = "TZ_MENU_TREE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzMenuTree {
    /**
     * 主键id,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 菜单树名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 菜单树描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 机构,机构id
     */
    @Column(name = "ORG_ID")
    private String orgId;

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