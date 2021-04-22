package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DATA_ARGUMENT")
public class TzDataArgument {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 变量名
     */
    @Column(name = "VARIABLE_CODE")
    private String variableCode;

    /**
     * 变量名称
     */
    @Column(name = "VARIABLE_NAME")
    private String variableName;

    /**
     * 变量描述
     */
    @Column(name = "VARIABLE_DESC")
    private String variableDesc;

    /**
     * 类方法
     */
    @Column(name = "CLASS_METHOD_ID")
    private String classMethodId;

    /**
     * 生效标志
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取变量名
     *
     * @return VARIABLE_CODE - 变量名
     */
    public String getVariableCode() {
        return variableCode;
    }

    /**
     * 设置变量名
     *
     * @param variableCode 变量名
     */
    public void setVariableCode(String variableCode) {
        this.variableCode = variableCode;
    }

    /**
     * 获取变量名称
     *
     * @return VARIABLE_NAME - 变量名称
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * 设置变量名称
     *
     * @param variableName 变量名称
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * 获取变量描述
     *
     * @return VARIABLE_DESC - 变量描述
     */
    public String getVariableDesc() {
        return variableDesc;
    }

    /**
     * 设置变量描述
     *
     * @param variableDesc 变量描述
     */
    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
    }

    /**
     * 获取类方法
     *
     * @return CLASS_METHOD_ID - 类方法
     */
    public String getClassMethodId() {
        return classMethodId;
    }

    /**
     * 设置类方法
     *
     * @param classMethodId 类方法
     */
    public void setClassMethodId(String classMethodId) {
        this.classMethodId = classMethodId;
    }

    /**
     * 获取生效标志
     *
     * @return ACTIVE_FLG - 生效标志
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标志
     *
     * @param activeFlg 生效标志
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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