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
@Table(name = "TZ_ACCGRP_OBJ")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzAccgrpObj {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 公共组ID
     */
    @Column(name = "ACCGRP_ID")
    private String accgrpId;

    /**
     * 对象类型
     */
    @Column(name = "OBJ_TYPE")
    private String objType;

    /**
     * 对象ID
     */
    @Column(name = "OBJ_ID")
    private String objId;

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