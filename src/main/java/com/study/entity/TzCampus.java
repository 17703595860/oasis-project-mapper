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
@Table(name = "TZ_CAMPUS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCampus {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 所属机构
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 校区名称
     */
    @Column(name = "CAMPUS_NAME")
    private String campusName;

    /**
     * 校区地址
     */
    @Column(name = "CAMPUS_ADDR")
    private String campusAddr;

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