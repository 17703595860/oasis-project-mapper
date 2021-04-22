package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DS_QRYCONDITON")
public class TzDsQryconditon {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 数据集id
     */
    @Column(name = "DATASET_ID")
    private String datasetId;

    /**
     * 排列顺序
     */
    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 条件与/或
     */
    @Column(name = "OPER_CONDITION")
    private String operCondition;

    /**
     * 左括号
     */
    @Column(name = "LEFT_BRACKET")
    private String leftBracket;

    /**
     * 字段ID
     */
    @Column(name = "FIELD_ID")
    private String fieldId;

    /**
     * 操作符
     */
    @Column(name = "OPERATOR")
    private String operator;

    /**
     * 字段取值
     */
    @Column(name = "FIELD_VAL")
    private String fieldVal;

    /**
     * 右括号
     */
    @Column(name = "RIGHT_BRACKET")
    private String rightBracket;

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
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取数据集id
     *
     * @return DATASET_ID - 数据集id
     */
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * 设置数据集id
     *
     * @param datasetId 数据集id
     */
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * 获取排列顺序
     *
     * @return SEQ - 排列顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置排列顺序
     *
     * @param seq 排列顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取条件与/或
     *
     * @return OPER_CONDITION - 条件与/或
     */
    public String getOperCondition() {
        return operCondition;
    }

    /**
     * 设置条件与/或
     *
     * @param operCondition 条件与/或
     */
    public void setOperCondition(String operCondition) {
        this.operCondition = operCondition;
    }

    /**
     * 获取左括号
     *
     * @return LEFT_BRACKET - 左括号
     */
    public String getLeftBracket() {
        return leftBracket;
    }

    /**
     * 设置左括号
     *
     * @param leftBracket 左括号
     */
    public void setLeftBracket(String leftBracket) {
        this.leftBracket = leftBracket;
    }

    /**
     * 获取字段ID
     *
     * @return FIELD_ID - 字段ID
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * 设置字段ID
     *
     * @param fieldId 字段ID
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取操作符
     *
     * @return OPERATOR - 操作符
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作符
     *
     * @param operator 操作符
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取字段取值
     *
     * @return FIELD_VAL - 字段取值
     */
    public String getFieldVal() {
        return fieldVal;
    }

    /**
     * 设置字段取值
     *
     * @param fieldVal 字段取值
     */
    public void setFieldVal(String fieldVal) {
        this.fieldVal = fieldVal;
    }

    /**
     * 获取右括号
     *
     * @return RIGHT_BRACKET - 右括号
     */
    public String getRightBracket() {
        return rightBracket;
    }

    /**
     * 设置右括号
     *
     * @param rightBracket 右括号
     */
    public void setRightBracket(String rightBracket) {
        this.rightBracket = rightBracket;
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
}