package com.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TZ_TRANSFORM_INFO")
public class TzTransformInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 转换值集合ID
     */
    @Column(name = "COLLECTION_ID")
    private String collectionId;

    /**
     * 转换值value
     */
    @Column(name = "TRANSFORM_VALUE")
    private String transformValue;

    /**
     * 转换值label
     */
    @Column(name = "TRANSFORM_LABEL")
    private String transformLabel;

    /**
     * 转换值长label
     */
    @Column(name = "TRANSFORM_LONG_LABEL")
    private String transformLongLabel;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

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
     * 获取转换值集合ID
     *
     * @return COLLECTION_ID - 转换值集合ID
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * 设置转换值集合ID
     *
     * @param collectionId 转换值集合ID
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 获取转换值value
     *
     * @return TRANSFORM_VALUE - 转换值value
     */
    public String getTransformValue() {
        return transformValue;
    }

    /**
     * 设置转换值value
     *
     * @param transformValue 转换值value
     */
    public void setTransformValue(String transformValue) {
        this.transformValue = transformValue;
    }

    /**
     * 获取转换值label
     *
     * @return TRANSFORM_LABEL - 转换值label
     */
    public String getTransformLabel() {
        return transformLabel;
    }

    /**
     * 设置转换值label
     *
     * @param transformLabel 转换值label
     */
    public void setTransformLabel(String transformLabel) {
        this.transformLabel = transformLabel;
    }

    /**
     * 获取转换值长label
     *
     * @return TRANSFORM_LONG_LABEL - 转换值长label
     */
    public String getTransformLongLabel() {
        return transformLongLabel;
    }

    /**
     * 设置转换值长label
     *
     * @param transformLongLabel 转换值长label
     */
    public void setTransformLongLabel(String transformLongLabel) {
        this.transformLongLabel = transformLongLabel;
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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