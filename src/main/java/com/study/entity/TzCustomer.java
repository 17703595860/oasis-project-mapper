package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_CUSTOMER")
public class TzCustomer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
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
     * 获取客户名称
     *
     * @return NAME - 客户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置客户名称
     *
     * @param name 客户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取客户编号
     *
     * @return CODE - 客户编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置客户编号
     *
     * @param code 客户编号
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取员工人数
     *
     * @return STAFFNUM - 员工人数
     */
    public Integer getStaffnum() {
        return staffnum;
    }

    /**
     * 设置员工人数
     *
     * @param staffnum 员工人数
     */
    public void setStaffnum(Integer staffnum) {
        this.staffnum = staffnum;
    }

    /**
     * 获取所属大区
     *
     * @return TERRITORY - 所属大区
     */
    public Byte getTerritory() {
        return territory;
    }

    /**
     * 设置所属大区
     *
     * @param territory 所属大区
     */
    public void setTerritory(Byte territory) {
        this.territory = territory;
    }

    /**
     * 获取销售职位ID
     *
     * @return POSTN_ID - 销售职位ID
     */
    public String getPostnId() {
        return postnId;
    }

    /**
     * 设置销售职位ID
     *
     * @param postnId 销售职位ID
     */
    public void setPostnId(String postnId) {
        this.postnId = postnId;
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