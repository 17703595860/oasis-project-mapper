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
@Table(name = "TZ_TRANSFORM_COLLECTION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzTransformCollection {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 转换值集合CODE
     */
    @Column(name = "COLLECTION_CODE")
    private String collectionCode;

    /**
     * 转换值集合描述
     */
    @Column(name = "COLLECTION_DESC")
    private String collectionDesc;

    /**
     * 生效标志
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;
}