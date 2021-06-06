package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/06/03
*/
@Table(name = "TZ_RECORD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzRecord {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 学院
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 学历名称
     */
    @Column(name = "RECORD_NAME")
    private String recordName;

    /**
     * 是否学历教育,Y 是 N 否
     */
    @Column(name = "IS_RECORD_EDU")
    private String isRecordEdu;

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