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
@Table(name = "TZ_APP_CLASS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzAppClass {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 应用程序类码值
     */
    @Column(name = "APP_CLASS_CODE")
    private String appClassCode;

    /**
     * 应用程序描述
     */
    @Column(name = "APP_CLASS_DESC")
    private String appClassDesc;

    /**
     * 应用程序类路径
     */
    @Column(name = "APP_CLASS_PATH")
    private String appClassPath;

    /**
     * 应用程序类名称
     */
    @Column(name = "APP_CLASS_NAME")
    private String appClassName;

    /**
     * 应用程序类方法
     */
    @Column(name = "APP_CLASS_METHOD")
    private String appClassMethod;

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