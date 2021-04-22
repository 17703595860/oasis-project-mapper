package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_FILE_STORAGE_RULE")
public class TzFileStorageRule {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 存储规则唯一标识
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 存储规则名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 是否限制文件大小，Y/N，默认N
     */
    @Column(name = "CHECK_SIZE")
    private String checkSize;

    /**
     * 文件下限（KB），如果限制文件大小，填写
     */
    @Column(name = "BOTTOM_SIZE")
    private Integer bottomSize;

    /**
     * 文件上限（KB），如果限制文件大小，填写
     */
    @Column(name = "TOP_SIZE")
    private Integer topSize;

    /**
     * 文件低于下限限提示信息
     */
    @Column(name = "BOTTOM_SIZE_TIP")
    private String bottomSizeTip;

    /**
     * 文件超出上限提示信息
     */
    @Column(name = "TOP_SIZE_TIP")
    private String topSizeTip;

    /**
     * 是否判断扩展名，Y/N，默认N
     */
    @Column(name = "CHECK_SUFFIX")
    private String checkSuffix;

    /**
     * 可以允许的文件扩展名，多个扩展名使用分号分割
     */
    @Column(name = "SUFFIX")
    private String suffix;

    /**
     * 扩展名错误提示信息
     */
    @Column(name = "SUFFIX_TIP")
    private String suffixTip;

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
     * 获取主键ID
     *
     * @return ID - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取存储规则唯一标识
     *
     * @return CODE - 存储规则唯一标识
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置存储规则唯一标识
     *
     * @param code 存储规则唯一标识
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取存储规则名称
     *
     * @return NAME - 存储规则名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置存储规则名称
     *
     * @param name 存储规则名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否限制文件大小，Y/N，默认N
     *
     * @return CHECK_SIZE - 是否限制文件大小，Y/N，默认N
     */
    public String getCheckSize() {
        return checkSize;
    }

    /**
     * 设置是否限制文件大小，Y/N，默认N
     *
     * @param checkSize 是否限制文件大小，Y/N，默认N
     */
    public void setCheckSize(String checkSize) {
        this.checkSize = checkSize;
    }

    /**
     * 获取文件下限（KB），如果限制文件大小，填写
     *
     * @return BOTTOM_SIZE - 文件下限（KB），如果限制文件大小，填写
     */
    public Integer getBottomSize() {
        return bottomSize;
    }

    /**
     * 设置文件下限（KB），如果限制文件大小，填写
     *
     * @param bottomSize 文件下限（KB），如果限制文件大小，填写
     */
    public void setBottomSize(Integer bottomSize) {
        this.bottomSize = bottomSize;
    }

    /**
     * 获取文件上限（KB），如果限制文件大小，填写
     *
     * @return TOP_SIZE - 文件上限（KB），如果限制文件大小，填写
     */
    public Integer getTopSize() {
        return topSize;
    }

    /**
     * 设置文件上限（KB），如果限制文件大小，填写
     *
     * @param topSize 文件上限（KB），如果限制文件大小，填写
     */
    public void setTopSize(Integer topSize) {
        this.topSize = topSize;
    }

    /**
     * 获取文件低于下限限提示信息
     *
     * @return BOTTOM_SIZE_TIP - 文件低于下限限提示信息
     */
    public String getBottomSizeTip() {
        return bottomSizeTip;
    }

    /**
     * 设置文件低于下限限提示信息
     *
     * @param bottomSizeTip 文件低于下限限提示信息
     */
    public void setBottomSizeTip(String bottomSizeTip) {
        this.bottomSizeTip = bottomSizeTip;
    }

    /**
     * 获取文件超出上限提示信息
     *
     * @return TOP_SIZE_TIP - 文件超出上限提示信息
     */
    public String getTopSizeTip() {
        return topSizeTip;
    }

    /**
     * 设置文件超出上限提示信息
     *
     * @param topSizeTip 文件超出上限提示信息
     */
    public void setTopSizeTip(String topSizeTip) {
        this.topSizeTip = topSizeTip;
    }

    /**
     * 获取是否判断扩展名，Y/N，默认N
     *
     * @return CHECK_SUFFIX - 是否判断扩展名，Y/N，默认N
     */
    public String getCheckSuffix() {
        return checkSuffix;
    }

    /**
     * 设置是否判断扩展名，Y/N，默认N
     *
     * @param checkSuffix 是否判断扩展名，Y/N，默认N
     */
    public void setCheckSuffix(String checkSuffix) {
        this.checkSuffix = checkSuffix;
    }

    /**
     * 获取可以允许的文件扩展名，多个扩展名使用分号分割
     *
     * @return SUFFIX - 可以允许的文件扩展名，多个扩展名使用分号分割
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * 设置可以允许的文件扩展名，多个扩展名使用分号分割
     *
     * @param suffix 可以允许的文件扩展名，多个扩展名使用分号分割
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 获取扩展名错误提示信息
     *
     * @return SUFFIX_TIP - 扩展名错误提示信息
     */
    public String getSuffixTip() {
        return suffixTip;
    }

    /**
     * 设置扩展名错误提示信息
     *
     * @param suffixTip 扩展名错误提示信息
     */
    public void setSuffixTip(String suffixTip) {
        this.suffixTip = suffixTip;
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