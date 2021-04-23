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
@Table(name = "TZ_FILE_STORAGE_RULE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFileStorageRule {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 存储规则唯一标识
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 存储规则名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 是否限制文件大小，Y/N，默认N
     */
    @Column(name = "CHECK_SIZE")
    private String checkSize;

    /**
     * 文件下限（KB），如果限制文件大小，填写
     */
    @Column(name = "BOTTOM_SIZE")
    private Integer bottomSize;

    /**
     * 文件上限（KB），如果限制文件大小，填写
     */
    @Column(name = "TOP_SIZE")
    private Integer topSize;

    /**
     * 文件低于下限限提示信息
     */
    @Column(name = "BOTTOM_SIZE_TIP")
    private String bottomSizeTip;

    /**
     * 文件超出上限提示信息
     */
    @Column(name = "TOP_SIZE_TIP")
    private String topSizeTip;

    /**
     * 是否判断扩展名，Y/N，默认N
     */
    @Column(name = "CHECK_SUFFIX")
    private String checkSuffix;

    /**
     * 可以允许的文件扩展名，多个扩展名使用分号分割
     */
    @Column(name = "SUFFIX")
    private String suffix;

    /**
     * 扩展名错误提示信息
     */
    @Column(name = "SUFFIX_TIP")
    private String suffixTip;

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