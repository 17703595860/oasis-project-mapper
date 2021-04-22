package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_CODE_GENERATOR_CONFIG")
public class TzCodeGeneratorConfig {
    /**
     * Id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * BMENTITY_ID
     */
    @Column(name = "BMENTITY_ID")
    private String bmentityId;

    /**
     * BUSMODULE_NAME
     */
    @Column(name = "BUSMODULE_NAME")
    private String busmoduleName;

    /**
     * 主BUSENTITY
     */
    @Column(name = "PR_BUSENTITY_NAME")
    private String prBusentityName;

    /**
     * BUSENTITY_NAME
     */
    @Column(name = "BUSENTITY_NAME")
    private String busentityName;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 作者
     */
    @Column(name = "AUTHOR")
    private String author;

    /**
     * 至于包下
     */
    @Column(name = "PACK")
    private String pack;

    /**
     * 前端view路径
     */
    @Column(name = "PATH")
    private String path;

    /**
     * API_PATH
     */
    @Column(name = "API_PATH")
    private String apiPath;

    /**
     * 接口前缀
     */
    @Column(name = "API_PREFIX")
    private String apiPrefix;

    /**
     * 去除TZ前缀
     */
    @Column(name = "REMOVE_TZ_PREFIX")
    private String removeTzPrefix;

    /**
     * 是否覆盖
     */
    @Column(name = "COVER")
    private String cover;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

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
     * 获取Id
     *
     * @return ID - Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置Id
     *
     * @param id Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取BMENTITY_ID
     *
     * @return BMENTITY_ID - BMENTITY_ID
     */
    public String getBmentityId() {
        return bmentityId;
    }

    /**
     * 设置BMENTITY_ID
     *
     * @param bmentityId BMENTITY_ID
     */
    public void setBmentityId(String bmentityId) {
        this.bmentityId = bmentityId;
    }

    /**
     * 获取BUSMODULE_NAME
     *
     * @return BUSMODULE_NAME - BUSMODULE_NAME
     */
    public String getBusmoduleName() {
        return busmoduleName;
    }

    /**
     * 设置BUSMODULE_NAME
     *
     * @param busmoduleName BUSMODULE_NAME
     */
    public void setBusmoduleName(String busmoduleName) {
        this.busmoduleName = busmoduleName;
    }

    /**
     * 获取主BUSENTITY
     *
     * @return PR_BUSENTITY_NAME - 主BUSENTITY
     */
    public String getPrBusentityName() {
        return prBusentityName;
    }

    /**
     * 设置主BUSENTITY
     *
     * @param prBusentityName 主BUSENTITY
     */
    public void setPrBusentityName(String prBusentityName) {
        this.prBusentityName = prBusentityName;
    }

    /**
     * 获取BUSENTITY_NAME
     *
     * @return BUSENTITY_NAME - BUSENTITY_NAME
     */
    public String getBusentityName() {
        return busentityName;
    }

    /**
     * 设置BUSENTITY_NAME
     *
     * @param busentityName BUSENTITY_NAME
     */
    public void setBusentityName(String busentityName) {
        this.busentityName = busentityName;
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
     * 获取作者
     *
     * @return AUTHOR - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取至于包下
     *
     * @return PACK - 至于包下
     */
    public String getPack() {
        return pack;
    }

    /**
     * 设置至于包下
     *
     * @param pack 至于包下
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * 获取前端view路径
     *
     * @return PATH - 前端view路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置前端view路径
     *
     * @param path 前端view路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取API_PATH
     *
     * @return API_PATH - API_PATH
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * 设置API_PATH
     *
     * @param apiPath API_PATH
     */
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    /**
     * 获取接口前缀
     *
     * @return API_PREFIX - 接口前缀
     */
    public String getApiPrefix() {
        return apiPrefix;
    }

    /**
     * 设置接口前缀
     *
     * @param apiPrefix 接口前缀
     */
    public void setApiPrefix(String apiPrefix) {
        this.apiPrefix = apiPrefix;
    }

    /**
     * 获取去除TZ前缀
     *
     * @return REMOVE_TZ_PREFIX - 去除TZ前缀
     */
    public String getRemoveTzPrefix() {
        return removeTzPrefix;
    }

    /**
     * 设置去除TZ前缀
     *
     * @param removeTzPrefix 去除TZ前缀
     */
    public void setRemoveTzPrefix(String removeTzPrefix) {
        this.removeTzPrefix = removeTzPrefix;
    }

    /**
     * 获取是否覆盖
     *
     * @return COVER - 是否覆盖
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置是否覆盖
     *
     * @param cover 是否覆盖
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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