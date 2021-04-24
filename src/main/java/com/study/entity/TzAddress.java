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
@Table(name = "TZ_ADDRESS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzAddress {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 联系人
     */
    @Column(name = "CONTACT")
    private String contact;

    /**
     * 联系电话
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 国家
     */
    @Column(name = "COUNTRY")
    private String country;

    /**
     * 省份地区
     */
    @Column(name = "PROVINCE")
    private String province;

    /**
     * 城市
     */
    @Column(name = "CITY")
    private String city;

    /**
     * 区县
     */
    @Column(name = "DISTRICT")
    private String district;

    /**
     * 街道/村镇
     */
    @Column(name = "SUBDISTRICT")
    private String subdistrict;

    /**
     * 详细地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 邮编
     */
    @Column(name = "ZIPCODE")
    private String zipcode;

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