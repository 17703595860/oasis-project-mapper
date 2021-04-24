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
@Table(name = "TZ_MESSAGE_COLLECTION")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzMessageCollection {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 消息集合码值
     */
    @Column(name = "COLLECTION_CODE")
    private String collectionCode;

    /**
     * 消息集合描述
     */
    @Column(name = "COLLECTION_DESC")
    private String collectionDesc;

    /**
     * 生效标志
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