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
@Table(name = "TZ_PAGE_ZONE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzPageZone {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * PageId
     */
    @Column(name = "PAGE_ID")
    private String pageId;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * BENAME
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 默认DISPLAYFRAME外键
     */
    @Column(name = "DEFAULT_DISPFRAME_ID")
    private String defaultDispframeId;

    /**
     * 是否有数据权限控制
     */
    @Column(name = "DATASET_FLG")
    private String datasetFlg;

    /**
     * 同一个PAGE内的父PAGEZONE_ID
     */
    @Column(name = "PAR_PAGEZONE_ID")
    private String parPagezoneId;

    /**
     * 区块的排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 区块的功能权限
     */
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * 区块的消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 区块的消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * 是否有效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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