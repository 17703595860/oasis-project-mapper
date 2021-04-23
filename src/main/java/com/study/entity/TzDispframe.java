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
@Table(name = "TZ_DISPFRAME")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDispframe {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 业务实体ID
     */
    @Column(name = "BE_ID")
    private String beId;

    /**
     * BE名称
     */
    @Column(name = "BE_NAME")
    private String beName;

    /**
     * 展示框架名称
     */
    @Column(name = "DISPFRAME_NAME")
    private String dispframeName;

    /**
     * 展示要素类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 消息CODE
     */
    @Column(name = "LABEL_MESSAGE_CODE")
    private String labelMessageCode;

    /**
     * 消息覆盖值
     */
    @Column(name = "LABEL_OVERRIDE")
    private String labelOverride;

    /**
     * 可配置搜索ID
     */
    @Column(name = "FILTER_DEF_ID")
    private String filterDefId;

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