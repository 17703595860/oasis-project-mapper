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
@Table(name = "TZ_CUSTOMER")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzCustomer {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 客户名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 客户编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 联系电话
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 员工人数
     */
    @Column(name = "STAFFNUM")
    private Integer staffnum;

    /**
     * 所属大区
     */
    @Column(name = "TERRITORY")
    private Byte territory;

    /**
     * 销售职位ID
     */
    @Column(name = "POSTN_ID")
    private String postnId;

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