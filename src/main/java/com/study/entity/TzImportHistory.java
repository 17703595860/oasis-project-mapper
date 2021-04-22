package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_IMPORT_HISTORY")
public class TzImportHistory {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * AE线程id
     */
    @Column(name = "AE_ID")
    private String aeId;

    /**
     * 导入名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 模板id，外键
     */
    @Column(name = "TEMPLATE_ID")
    private String templateId;

    /**
     * 业务实体Id 外键
     */
    @Column(name = "METABE_ID")
    private String metabeId;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_TIME")
    private Date finishTime;

    /**
     * 导入总数量
     */
    @Column(name = "IMPORT_NUM")
    private Integer importNum;

    /**
     * 成功数量
     */
    @Column(name = "SUCCESS_NUM")
    private Integer successNum;

    /**
     * 完成状态，1进行中，2已完成，3失败
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 导入模板对应的FileId
     */
    @Column(name = "FILE_ID")
    private String fileId;

    /**
     * 自定义参数
     */
    @Column(name = "PARAM")
    private String param;

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
     * 失败的详细说明
     */
    @Column(name = "DESCRIPTION")
    private String description;

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
     * 获取AE线程id
     *
     * @return AE_ID - AE线程id
     */
    public String getAeId() {
        return aeId;
    }

    /**
     * 设置AE线程id
     *
     * @param aeId AE线程id
     */
    public void setAeId(String aeId) {
        this.aeId = aeId;
    }

    /**
     * 获取导入名称
     *
     * @return NAME - 导入名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置导入名称
     *
     * @param name 导入名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取模板id，外键
     *
     * @return TEMPLATE_ID - 模板id，外键
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板id，外键
     *
     * @param templateId 模板id，外键
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取业务实体Id 外键
     *
     * @return METABE_ID - 业务实体Id 外键
     */
    public String getMetabeId() {
        return metabeId;
    }

    /**
     * 设置业务实体Id 外键
     *
     * @param metabeId 业务实体Id 外键
     */
    public void setMetabeId(String metabeId) {
        this.metabeId = metabeId;
    }

    /**
     * 获取完成时间
     *
     * @return FINISH_TIME - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取导入总数量
     *
     * @return IMPORT_NUM - 导入总数量
     */
    public Integer getImportNum() {
        return importNum;
    }

    /**
     * 设置导入总数量
     *
     * @param importNum 导入总数量
     */
    public void setImportNum(Integer importNum) {
        this.importNum = importNum;
    }

    /**
     * 获取成功数量
     *
     * @return SUCCESS_NUM - 成功数量
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    /**
     * 设置成功数量
     *
     * @param successNum 成功数量
     */
    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    /**
     * 获取完成状态，1进行中，2已完成，3失败
     *
     * @return STATUS - 完成状态，1进行中，2已完成，3失败
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置完成状态，1进行中，2已完成，3失败
     *
     * @param status 完成状态，1进行中，2已完成，3失败
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取导入模板对应的FileId
     *
     * @return FILE_ID - 导入模板对应的FileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置导入模板对应的FileId
     *
     * @param fileId 导入模板对应的FileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取自定义参数
     *
     * @return PARAM - 自定义参数
     */
    public String getParam() {
        return param;
    }

    /**
     * 设置自定义参数
     *
     * @param param 自定义参数
     */
    public void setParam(String param) {
        this.param = param;
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
     * 获取失败的详细说明
     *
     * @return DESCRIPTION - 失败的详细说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置失败的详细说明
     *
     * @param description 失败的详细说明
     */
    public void setDescription(String description) {
        this.description = description;
    }
}