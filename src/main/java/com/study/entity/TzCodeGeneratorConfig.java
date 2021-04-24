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
@Table(name = "TZ_CODE_GENERATOR_CONFIG")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCodeGeneratorConfig {
    /**
     * Id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * BMENTITY_ID
     */
    @Column(name = "BMENTITY_ID")
    private String bmentityId;

    /**
     * BUSMODULE_NAME
     */
    @Column(name = "BUSMODULE_NAME")
    private String busmoduleName;

    /**
     * 主BUSENTITY
     */
    @Column(name = "PR_BUSENTITY_NAME")
    private String prBusentityName;

    /**
     * BUSENTITY_NAME
     */
    @Column(name = "BUSENTITY_NAME")
    private String busentityName;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 作者
     */
    @Column(name = "AUTHOR")
    private String author;

    /**
     * 至于包下
     */
    @Column(name = "PACK")
    private String pack;

    /**
     * 前端view路径
     */
    @Column(name = "PATH")
    private String path;

    /**
     * API_PATH
     */
    @Column(name = "API_PATH")
    private String apiPath;

    /**
     * 接口前缀
     */
    @Column(name = "API_PREFIX")
    private String apiPrefix;

    /**
     * 去除TZ前缀
     */
    @Column(name = "REMOVE_TZ_PREFIX")
    private String removeTzPrefix;

    /**
     * 是否覆盖
     */
    @Column(name = "COVER")
    private String cover;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

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