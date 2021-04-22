package com.study.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_AQ_JCDD_T")
public class TzAqJcddT {
    /**
     * CLASSID
     */
    @Id
    @Column(name = "CLASSID")
    private String classid;

    /**
     * 功能组件ID
     */
    @Id
    @Column(name = "TZ_COM_ID")
    private String tzComId;

    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程名称
     */
    @Id
    @Column(name = "TZ_JC_MC")
    private String tzJcMc;

    /**
     * 是否启用
     */
    @Column(name = "TZ_DD_FLG")
    private String tzDdFlg;

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

    /**
     * 获取CLASSID
     *
     * @return CLASSID - CLASSID
     */
    public String getClassid() {
        return classid;
    }

    /**
     * 设置CLASSID
     *
     * @param classid CLASSID
     */
    public void setClassid(String classid) {
        this.classid = classid;
    }

    /**
     * 获取功能组件ID
     *
     * @return TZ_COM_ID - 功能组件ID
     */
    public String getTzComId() {
        return tzComId;
    }

    /**
     * 设置功能组件ID
     *
     * @param tzComId 功能组件ID
     */
    public void setTzComId(String tzComId) {
        this.tzComId = tzComId;
    }

    /**
     * 获取机构ID
     *
     * @return TZ_JG_ID - 机构ID
     */
    public String getTzJgId() {
        return tzJgId;
    }

    /**
     * 设置机构ID
     *
     * @param tzJgId 机构ID
     */
    public void setTzJgId(String tzJgId) {
        this.tzJgId = tzJgId;
    }

    /**
     * 获取进程名称
     *
     * @return TZ_JC_MC - 进程名称
     */
    public String getTzJcMc() {
        return tzJcMc;
    }

    /**
     * 设置进程名称
     *
     * @param tzJcMc 进程名称
     */
    public void setTzJcMc(String tzJcMc) {
        this.tzJcMc = tzJcMc;
    }

    /**
     * 获取是否启用
     *
     * @return TZ_DD_FLG - 是否启用
     */
    public String getTzDdFlg() {
        return tzDdFlg;
    }

    /**
     * 设置是否启用
     *
     * @param tzDdFlg 是否启用
     */
    public void setTzDdFlg(String tzDdFlg) {
        this.tzDdFlg = tzDdFlg;
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
}