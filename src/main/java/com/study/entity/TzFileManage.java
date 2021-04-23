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
@Table(name = "TZ_FILE_MANAGE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzFileManage {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 文件名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 文件保存状态0正在保存，1保存成功，2保存失败
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 文件扩展名
     */
    @Column(name = "SUFFIX")
    private String suffix;

    /**
     * 文件大小
     */
    @Column(name = "SIZE")
    private Integer size;

    /**
     * 系统文件名
     */
    @Column(name = "SYSTEM_NAME")
    private String systemName;

    /**
     * 文件存储方式
     */
    @Column(name = "TYPE_ID")
    private String typeId;

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