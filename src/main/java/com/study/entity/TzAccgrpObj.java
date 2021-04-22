package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_ACCGRP_OBJ")
public class TzAccgrpObj {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 公共组ID
     */
    @Column(name = "ACCGRP_ID")
    private String accgrpId;

    /**
     * 对象类型
     */
    @Column(name = "OBJ_TYPE")
    private String objType;

    /**
     * 对象ID
     */
    @Column(name = "OBJ_ID")
    private String objId;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

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
     * 修改人
     */
    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    /**
     * 修改时间
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
     * 获取公共组ID
     *
     * @return ACCGRP_ID - 公共组ID
     */
    public String getAccgrpId() {
        return accgrpId;
    }

    /**
     * 设置公共组ID
     *
     * @param accgrpId 公共组ID
     */
    public void setAccgrpId(String accgrpId) {
        this.accgrpId = accgrpId;
    }

    /**
     * 获取对象类型
     *
     * @return OBJ_TYPE - 对象类型
     */
    public String getObjType() {
        return objType;
    }

    /**
     * 设置对象类型
     *
     * @param objType 对象类型
     */
    public void setObjType(String objType) {
        this.objType = objType;
    }

    /**
     * 获取对象ID
     *
     * @return OBJ_ID - 对象ID
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 设置对象ID
     *
     * @param objId 对象ID
     */
    public void setObjId(String objId) {
        this.objId = objId;
    }

    /**
     * 获取备注
     *
     * @return COMMENTS - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * 获取修改人
     *
     * @return LAST_UPD_BY - 修改人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 设置修改人
     *
     * @param lastUpdBy 修改人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    /**
     * 获取修改时间
     *
     * @return LAST_UPD - 修改时间
     */
    public Date getLastUpd() {
        return lastUpd;
    }

    /**
     * 设置修改时间
     *
     * @param lastUpd 修改时间
     */
    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }
}