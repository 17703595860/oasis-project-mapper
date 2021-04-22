package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FIELD")
@NoArgsConstructor
@AllArgsConstructor
public class TzField {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * BE表外键
     */
    @Column(name = "BUSENTITY_ID")
    private String busentityId;

    /**
     * Join名称
     */
    @Column(name = "JOIN_NAME")
    private String joinName;

    /**
     * 对应表Column名称
     */
    @Column(name = "COL_NAME")
    private String colName;

    /**
     * 是否计算字段
     */
    @Column(name = "CALCULATED")
    private String calculated;

    /**
     * 计算字段内容
     */
    @Column(name = "CALCVAL")
    private String calcval;

    /**
     * 字段类型
     */
    @Column(name = "DATA_TYPE")
    private String dataType;

    /**
     * 字符长度
     */
    @Column(name = "TEXTLEN")
    private Integer textlen;

    /**
     * 数字型位数
     */
    @Column(name = "PREC_NUM")
    private Integer precNum;

    /**
     * 小数位数
     */
    @Column(name = "SCALE")
    private Integer scale;

    /**
     * 是否必须字段
     */
    @Column(name = "REQUIRED")
    private String required;

    /**
     * 是否强制激活
     */
    @Column(name = "FORCEACTIVE")
    private String forceactive;

    /**
     * 生效标识
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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
     * 前端控件类型
     */
    @Column(name = "CONTROL_TYPE")
    private String controlType;

    /**
     * Prompt对应BE名称
     */
    @Column(name = "PT_BENAME")
    private String ptBename;

    /**
     * 对应转换值
     */
    @Column(name = "TRANSFORM_CODE")
    private String transformCode;

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
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取BE表外键
     *
     * @return BUSENTITY_ID - BE表外键
     */
    public String getBusentityId() {
        return busentityId;
    }

    /**
     * 设置BE表外键
     *
     * @param busentityId BE表外键
     */
    public void setBusentityId(String busentityId) {
        this.busentityId = busentityId;
    }

    /**
     * 获取Join名称
     *
     * @return JOIN_NAME - Join名称
     */
    public String getJoinName() {
        return joinName;
    }

    /**
     * 设置Join名称
     *
     * @param joinName Join名称
     */
    public void setJoinName(String joinName) {
        this.joinName = joinName;
    }

    /**
     * 获取对应表Column名称
     *
     * @return COL_NAME - 对应表Column名称
     */
    public String getColName() {
        return colName;
    }

    /**
     * 设置对应表Column名称
     *
     * @param colName 对应表Column名称
     */
    public void setColName(String colName) {
        this.colName = colName;
    }

    /**
     * 获取是否计算字段
     *
     * @return CALCULATED - 是否计算字段
     */
    public String getCalculated() {
        return calculated;
    }

    /**
     * 设置是否计算字段
     *
     * @param calculated 是否计算字段
     */
    public void setCalculated(String calculated) {
        this.calculated = calculated;
    }

    /**
     * 获取计算字段内容
     *
     * @return CALCVAL - 计算字段内容
     */
    public String getCalcval() {
        return calcval;
    }

    /**
     * 设置计算字段内容
     *
     * @param calcval 计算字段内容
     */
    public void setCalcval(String calcval) {
        this.calcval = calcval;
    }

    /**
     * 获取字段类型
     *
     * @return DATA_TYPE - 字段类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置字段类型
     *
     * @param dataType 字段类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取字符长度
     *
     * @return TEXTLEN - 字符长度
     */
    public Integer getTextlen() {
        return textlen;
    }

    /**
     * 设置字符长度
     *
     * @param textlen 字符长度
     */
    public void setTextlen(Integer textlen) {
        this.textlen = textlen;
    }

    /**
     * 获取数字型位数
     *
     * @return PREC_NUM - 数字型位数
     */
    public Integer getPrecNum() {
        return precNum;
    }

    /**
     * 设置数字型位数
     *
     * @param precNum 数字型位数
     */
    public void setPrecNum(Integer precNum) {
        this.precNum = precNum;
    }

    /**
     * 获取小数位数
     *
     * @return SCALE - 小数位数
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * 设置小数位数
     *
     * @param scale 小数位数
     */
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * 获取是否必须字段
     *
     * @return REQUIRED - 是否必须字段
     */
    public String getRequired() {
        return required;
    }

    /**
     * 设置是否必须字段
     *
     * @param required 是否必须字段
     */
    public void setRequired(String required) {
        this.required = required;
    }

    /**
     * 获取是否强制激活
     *
     * @return FORCEACTIVE - 是否强制激活
     */
    public String getForceactive() {
        return forceactive;
    }

    /**
     * 设置是否强制激活
     *
     * @param forceactive 是否强制激活
     */
    public void setForceactive(String forceactive) {
        this.forceactive = forceactive;
    }

    /**
     * 获取生效标识
     *
     * @return ACTIVE_FLG - 生效标识
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置生效标识
     *
     * @param activeFlg 生效标识
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
     * 获取前端控件类型
     *
     * @return CONTROL_TYPE - 前端控件类型
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置前端控件类型
     *
     * @param controlType 前端控件类型
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * 获取Prompt对应BE名称
     *
     * @return PT_BENAME - Prompt对应BE名称
     */
    public String getPtBename() {
        return ptBename;
    }

    /**
     * 设置Prompt对应BE名称
     *
     * @param ptBename Prompt对应BE名称
     */
    public void setPtBename(String ptBename) {
        this.ptBename = ptBename;
    }

    /**
     * 获取对应转换值
     *
     * @return TRANSFORM_CODE - 对应转换值
     */
    public String getTransformCode() {
        return transformCode;
    }

    /**
     * 设置对应转换值
     *
     * @param transformCode 对应转换值
     */
    public void setTransformCode(String transformCode) {
        this.transformCode = transformCode;
    }
}