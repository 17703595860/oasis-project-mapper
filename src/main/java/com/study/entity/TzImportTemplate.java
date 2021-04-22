package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_IMPORT_TEMPLATE")
public class TzImportTemplate {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 模板编号
     */
    @Column(name = "NUMBER")
    private String number;

    /**
     * 模板名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 业务实体Id 外键
     */
    @Column(name = "METABE_ID")
    private String metabeId;

    /**
     * 模板类型，1:通用导入，2:自定义导入
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 如果模板类型为自定义导入，填写类方法
     */
    @Column(name = "CLASS_METHOD")
    private String classMethod;

    /**
     * 有效状态，Y有效，N无效
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 导入模板对应的FileId
     */
    @Column(name = "FILE_ID")
    private String fileId;

    /**
     * 备注
     */
    @Column(name = "COMMENT")
    private String comment;

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
     * 获取模板编号
     *
     * @return NUMBER - 模板编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置模板编号
     *
     * @param number 模板编号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取模板名称
     *
     * @return NAME - 模板名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模板名称
     *
     * @param name 模板名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取模板类型，1:通用导入，2:自定义导入
     *
     * @return TYPE - 模板类型，1:通用导入，2:自定义导入
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置模板类型，1:通用导入，2:自定义导入
     *
     * @param type 模板类型，1:通用导入，2:自定义导入
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取如果模板类型为自定义导入，填写类方法
     *
     * @return CLASS_METHOD - 如果模板类型为自定义导入，填写类方法
     */
    public String getClassMethod() {
        return classMethod;
    }

    /**
     * 设置如果模板类型为自定义导入，填写类方法
     *
     * @param classMethod 如果模板类型为自定义导入，填写类方法
     */
    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    /**
     * 获取有效状态，Y有效，N无效
     *
     * @return ACTIVE_FLG - 有效状态，Y有效，N无效
     */
    public String getActiveFlg() {
        return activeFlg;
    }

    /**
     * 设置有效状态，Y有效，N无效
     *
     * @param activeFlg 有效状态，Y有效，N无效
     */
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
     * 获取备注
     *
     * @return COMMENT - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
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