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
@Table(name = "TZ_IMPORT_TEMPLATE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzImportTemplate {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 模板编号
     */
    @Column(name = "NUMBER")
    private String number;

    /**
     * 模板名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 业务实体Id 外键
     */
    @Column(name = "METABE_ID")
    private String metabeId;

    /**
     * 模板类型，1:通用导入，2:自定义导入
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 如果模板类型为自定义导入，填写类方法
     */
    @Column(name = "CLASS_METHOD")
    private String classMethod;

    /**
     * 有效状态，Y有效，N无效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 导入模板对应的FileId
     */
    @Column(name = "FILE_ID")
    private String fileId;

    /**
     * 备注
     */
    @Column(name = "COMMENT")
    private String comment;

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