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
@Table(name = "TZ_MESSAGE_INFO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzMessageInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 消息集合ID
     */
    @Column(name = "COLLECTION_ID")
    private String collectionId;

    /**
     * 语言
     */
    @Column(name = "LANGUAGE")
    private String language;

    /**
     * 消息CODE
     */
    @Column(name = "MESSAGE_CODE")
    private String messageCode;

    /**
     * 标签CODE
     */
    @Column(name = "TAG_CODE")
    private String tagCode;

    /**
     * 消息描述
     */
    @Column(name = "MESSAGE_DESC")
    private String messageDesc;

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