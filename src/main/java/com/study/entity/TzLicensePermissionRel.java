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
@Table(name = "TZ_LICENSE_PERMISSION_REL")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzLicensePermissionRel {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "LICENSE_ID")
    private String licenseId;

    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    @Column(name = "LAST_UPD")
    private Date lastUpd;
}