package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_HISTORY_MAPPING")
public class TzHistoryMapping {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 导入历史id
     */
    @Column(name = "HISTORY_ID")
    private String historyId;

    /**
     * 导入模板字段名称
     */
    @Column(name = "FIELD_NAME")
    private String fieldName;

    /**
     * 模板字段对应的预留字段
     */
    @Column(name = "FIELD_INDEX")
    private String fieldIndex;

    /**
     * 排序，序号
     */
    @Column(name = "SEQUENCE")
    private Integer sequence;

    /**
     * 字段描述（导入历史对应的 快照）
     */
    @Column(name = "DESCRIPTION")
    private String description;

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
     * 获取主键id
     *
     * @return ID - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取导入历史id
     *
     * @return HISTORY_ID - 导入历史id
     */
    public String getHistoryId() {
        return historyId;
    }

    /**
     * 设置导入历史id
     *
     * @param historyId 导入历史id
     */
    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    /**
     * 获取导入模板字段名称
     *
     * @return FIELD_NAME - 导入模板字段名称
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置导入模板字段名称
     *
     * @param fieldName 导入模板字段名称
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取模板字段对应的预留字段
     *
     * @return FIELD_INDEX - 模板字段对应的预留字段
     */
    public String getFieldIndex() {
        return fieldIndex;
    }

    /**
     * 设置模板字段对应的预留字段
     *
     * @param fieldIndex 模板字段对应的预留字段
     */
    public void setFieldIndex(String fieldIndex) {
        this.fieldIndex = fieldIndex;
    }

    /**
     * 获取排序，序号
     *
     * @return SEQUENCE - 排序，序号
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置排序，序号
     *
     * @param sequence 排序，序号
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取字段描述（导入历史对应的 快照）
     *
     * @return DESCRIPTION - 字段描述（导入历史对应的 快照）
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置字段描述（导入历史对应的 快照）
     *
     * @param description 字段描述（导入历史对应的 快照）
     */
    public void setDescription(String description) {
        this.description = description;
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