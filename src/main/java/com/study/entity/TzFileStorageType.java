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
@Table(name = "TZ_FILE_STORAGE_TYPE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFileStorageType {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 存储方式唯一标识
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 存储方式描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 附件存储路径，如果存储到数据库，可以为空，否则，非空
     */
    @Column(name = "STORAGE_SRC")
    private String storageSrc;

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