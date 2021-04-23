package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_POSTN_RPT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPostnRpt {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 职位ID
     */
    @Column(name = "POSITION_ID")
    private String positionId;

    /**
     * 下级职位ID
     */
    @Column(name = "CHILD_POSITIONID")
    private String childPositionid;

    /**
     * 层级差
     */
    @Column(name = "HOP")
    private Integer hop;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
}