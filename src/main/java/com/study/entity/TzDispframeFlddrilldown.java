package com.study.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_DISPFRAME_FLDDRILLDOWN")
@NoArgsConstructor
@AllArgsConstructor
public class TzDispframeFlddrilldown {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 展示框架元素表Id
     */
    @Column(name = "DISPFRAME_DTL_ID")
    private String dispframeDtlId;

    /**
     * 判断顺序
     */
    @Column(name = "SEQ")
    private Long seq;

    /**
     * 判断条件
     */
    @Column(name = "CONDITION_MSG")
    private String conditionMsg;

    /**
     * 跳转到的ComponentID
     */
    @Column(name = "DEST_COMP_ID")
    private String destCompId;

    /**
     * 目标数据集类型
     */
    @Column(name = "DEST_DS_TYPE")
    private String destDsType;

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
     * 获取展示框架元素表Id
     *
     * @return DISPFRAME_DTL_ID - 展示框架元素表Id
     */
    public String getDispframeDtlId() {
        return dispframeDtlId;
    }

    /**
     * 设置展示框架元素表Id
     *
     * @param dispframeDtlId 展示框架元素表Id
     */
    public void setDispframeDtlId(String dispframeDtlId) {
        this.dispframeDtlId = dispframeDtlId;
    }

    /**
     * 获取判断顺序
     *
     * @return SEQ - 判断顺序
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * 设置判断顺序
     *
     * @param seq 判断顺序
     */
    public void setSeq(Long seq) {
        this.seq = seq;
    }

    /**
     * 获取判断条件
     *
     * @return CONDITION_MSG - 判断条件
     */
    public String getConditionMsg() {
        return conditionMsg;
    }

    /**
     * 设置判断条件
     *
     * @param conditionMsg 判断条件
     */
    public void setConditionMsg(String conditionMsg) {
        this.conditionMsg = conditionMsg;
    }

    /**
     * 获取跳转到的ComponentID
     *
     * @return DEST_COMP_ID - 跳转到的ComponentID
     */
    public String getDestCompId() {
        return destCompId;
    }

    /**
     * 设置跳转到的ComponentID
     *
     * @param destCompId 跳转到的ComponentID
     */
    public void setDestCompId(String destCompId) {
        this.destCompId = destCompId;
    }

    /**
     * 获取目标数据集类型
     *
     * @return DEST_DS_TYPE - 目标数据集类型
     */
    public String getDestDsType() {
        return destDsType;
    }

    /**
     * 设置目标数据集类型
     *
     * @param destDsType 目标数据集类型
     */
    public void setDestDsType(String destDsType) {
        this.destDsType = destDsType;
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