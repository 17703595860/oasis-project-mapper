package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/06/04
*/
@Table(name = "TZ_ORG_BU")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzOrgBu {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 部门编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 部门名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 父部门
     */
    @Column(name = "PAR_BUID")
    private String parBuid;

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
     * 类型，1系所中心，2其他
     */
    @Column(name = "TYPE")
    private String type;
}