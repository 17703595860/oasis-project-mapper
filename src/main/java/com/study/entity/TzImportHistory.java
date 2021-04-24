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
@Table(name = "TZ_IMPORT_HISTORY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzImportHistory {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * AE线程id
     */
    @Column(name = "AE_ID")
    private String aeId;

    /**
     * 导入名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 模板id，外键
     */
    @Column(name = "TEMPLATE_ID")
    private String templateId;

    /**
     * 业务实体Id 外键
     */
    @Column(name = "METABE_ID")
    private String metabeId;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_TIME")
    private Date finishTime;

    /**
     * 导入总数量
     */
    @Column(name = "IMPORT_NUM")
    private Integer importNum;

    /**
     * 成功数量
     */
    @Column(name = "SUCCESS_NUM")
    private Integer successNum;

    /**
     * 完成状态，1进行中，2已完成，3失败
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 导入模板对应的FileId
     */
    @Column(name = "FILE_ID")
    private String fileId;

    /**
     * 自定义参数
     */
    @Column(name = "PARAM")
    private String param;

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

    /**
     * 失败的详细说明
     */
    @Column(name = "DESCRIPTION")
    private String description;
}