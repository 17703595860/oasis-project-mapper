package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_ADDRESS")
public class TzAddress {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
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

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取联系人
     *
     * @return CONTACT - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取联系电话
     *
     * @return PHONE_NO - 联系电话
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNo 联系电话
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取国家
     *
     * @return COUNTRY - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取省份地区
     *
     * @return PROVINCE - 省份地区
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份地区
     *
     * @param province 省份地区
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return CITY - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区县
     *
     * @return DISTRICT - 区县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区县
     *
     * @param district 区县
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取街道/村镇
     *
     * @return SUBDISTRICT - 街道/村镇
     */
    public String getSubdistrict() {
        return subdistrict;
    }

    /**
     * 设置街道/村镇
     *
     * @param subdistrict 街道/村镇
     */
    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    /**
     * 获取详细地址
     *
     * @return ADDRESS - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮编
     *
     * @return ZIPCODE - 邮编
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置邮编
     *
     * @param zipcode 邮编
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 获取修改记录号
     *
     * @return MODIFICATION_NUM - 修改记录号
     */
    public Integer getModificationNum() {
        return modificationNum;
    }

    /**
     * 设置修改记录号
     *
     * @param modificationNum 修改记录号
     */
    public void setModificationNum(Integer modificationNum) {
        this.modificationNum = modificationNum;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新人
     *
     * @return LAST_UPD_BY - 更新人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置更新人
     *
     * @param lastUpdBy 更新人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取更新时间
     *
     * @return LAST_UPD - 更新时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置更新时间
     *
     * @param lastUpd 更新时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}