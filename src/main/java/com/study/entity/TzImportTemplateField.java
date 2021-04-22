package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_IMPORT_TEMPLATE_FIELD")
public class TzImportTemplateField {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 模板id，外键
     */
    @Column(name = "TEMPLATE_ID")
    private String templateId;

    /**
     * 字段名称，从元数据中拿取
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 字段描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 排序，序号
     */
    @Column(name = "SEQUENCE")
    private Integer sequence;

    /**
     * 是否必须，Y必须，N不必须
     */
    @Column(name = "REQUIRED")
    private String required;

    /**
     * 是否查重条件，Y是，N否
     */
    @Column(name = "CHECK_REPEAT")
    private String checkRepeat;

    /**
     * 保留字段
     */
    @Column(name = "BE_EMPTY")
    private String beEmpty;

    /**
     * 字段类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 格式，1普通文本、2手机、3邮箱、4日期时间、5转换值、6提示表、7自定义类（默认为普通文本）
     */
    @Column(name = "FORMAT")
    private Byte format;

    /**
     * 类型为4日期时间时设置日期格式
     */
    @Column(name = "DATE_FORMAT")
    private String dateFormat;

    /**
     * 类型为5转换值时，是指转换值id 外键
     */
    @Column(name = "TRANSFORM_ID")
    private String transformId;

    /**
     * 类型为6提示表时，选择业务实体，外键
     */
    @Column(name = "METABE_ID")
    private String metabeId;

    /**
     * 结果Field从选择的业务实体中动态获取，外键
     */
    @Column(name = "RESULT_FIELD_ID")
    private String resultFieldId;

    /**
     * 条件Field从选择的业务实体中动态获取，外键
     */
    @Column(name = "CONDITION_FIELD_ID")
    private String conditionFieldId;

    /**
     * 类型为7自定义类时，设置类定义ID，外键
     */
    @Column(name = "CLASS_ID")
    private String classId;

    /**
     * 默认值类型，0无，1为静态，2为系统变量，默认为0
     */
    @Column(name = "DEFAULT_TYPE")
    private Byte defaultType;

    /**
     * 默认值类型为1静态时，设置静态默认值
     */
    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    /**
     * 默认值类型为2系统变量时显示，包含当前时间、当前操作人ID、当前操作人姓名、当前职位ID、当前职位描述、当前机构ID、当前机构描述..
     */
    @Column(name = "SYSTEM_VAIRABLE")
    private String systemVairable;

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
     * 获取字段名称，从元数据中拿取
     *
     * @return NAME - 字段名称，从元数据中拿取
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段名称，从元数据中拿取
     *
     * @param name 字段名称，从元数据中拿取
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取字段描述
     *
     * @return DESCRIPTION - 字段描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置字段描述
     *
     * @param description 字段描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取是否必须，Y必须，N不必须
     *
     * @return REQUIRED - 是否必须，Y必须，N不必须
     */
    public String getRequired() {
        return required;
    }

    /**
     * 设置是否必须，Y必须，N不必须
     *
     * @param required 是否必须，Y必须，N不必须
     */
    public void setRequired(String required) {
        this.required = required;
    }

    /**
     * 获取是否查重条件，Y是，N否
     *
     * @return CHECK_REPEAT - 是否查重条件，Y是，N否
     */
    public String getCheckRepeat() {
        return checkRepeat;
    }

    /**
     * 设置是否查重条件，Y是，N否
     *
     * @param checkRepeat 是否查重条件，Y是，N否
     */
    public void setCheckRepeat(String checkRepeat) {
        this.checkRepeat = checkRepeat;
    }

    /**
     * 获取保留字段
     *
     * @return BE_EMPTY - 保留字段
     */
    public String getBeEmpty() {
        return beEmpty;
    }

    /**
     * 设置保留字段
     *
     * @param beEmpty 保留字段
     */
    public void setBeEmpty(String beEmpty) {
        this.beEmpty = beEmpty;
    }

    /**
     * 获取字段类型
     *
     * @return TYPE - 字段类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置字段类型
     *
     * @param type 字段类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取格式，1普通文本、2手机、3邮箱、4日期时间、5转换值、6提示表、7自定义类（默认为普通文本）
     *
     * @return FORMAT - 格式，1普通文本、2手机、3邮箱、4日期时间、5转换值、6提示表、7自定义类（默认为普通文本）
     */
    public Byte getFormat() {
        return format;
    }

    /**
     * 设置格式，1普通文本、2手机、3邮箱、4日期时间、5转换值、6提示表、7自定义类（默认为普通文本）
     *
     * @param format 格式，1普通文本、2手机、3邮箱、4日期时间、5转换值、6提示表、7自定义类（默认为普通文本）
     */
    public void setFormat(Byte format) {
        this.format = format;
    }

    /**
     * 获取类型为4日期时间时设置日期格式
     *
     * @return DATE_FORMAT - 类型为4日期时间时设置日期格式
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 设置类型为4日期时间时设置日期格式
     *
     * @param dateFormat 类型为4日期时间时设置日期格式
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * 获取类型为5转换值时，是指转换值id 外键
     *
     * @return TRANSFORM_ID - 类型为5转换值时，是指转换值id 外键
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * 设置类型为5转换值时，是指转换值id 外键
     *
     * @param transformId 类型为5转换值时，是指转换值id 外键
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * 获取类型为6提示表时，选择业务实体，外键
     *
     * @return METABE_ID - 类型为6提示表时，选择业务实体，外键
     */
    public String getMetabeId() {
        return metabeId;
    }

    /**
     * 设置类型为6提示表时，选择业务实体，外键
     *
     * @param metabeId 类型为6提示表时，选择业务实体，外键
     */
    public void setMetabeId(String metabeId) {
        this.metabeId = metabeId;
    }

    /**
     * 获取结果Field从选择的业务实体中动态获取，外键
     *
     * @return RESULT_FIELD_ID - 结果Field从选择的业务实体中动态获取，外键
     */
    public String getResultFieldId() {
        return resultFieldId;
    }

    /**
     * 设置结果Field从选择的业务实体中动态获取，外键
     *
     * @param resultFieldId 结果Field从选择的业务实体中动态获取，外键
     */
    public void setResultFieldId(String resultFieldId) {
        this.resultFieldId = resultFieldId;
    }

    /**
     * 获取条件Field从选择的业务实体中动态获取，外键
     *
     * @return CONDITION_FIELD_ID - 条件Field从选择的业务实体中动态获取，外键
     */
    public String getConditionFieldId() {
        return conditionFieldId;
    }

    /**
     * 设置条件Field从选择的业务实体中动态获取，外键
     *
     * @param conditionFieldId 条件Field从选择的业务实体中动态获取，外键
     */
    public void setConditionFieldId(String conditionFieldId) {
        this.conditionFieldId = conditionFieldId;
    }

    /**
     * 获取类型为7自定义类时，设置类定义ID，外键
     *
     * @return CLASS_ID - 类型为7自定义类时，设置类定义ID，外键
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 设置类型为7自定义类时，设置类定义ID，外键
     *
     * @param classId 类型为7自定义类时，设置类定义ID，外键
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * 获取默认值类型，0无，1为静态，2为系统变量，默认为0
     *
     * @return DEFAULT_TYPE - 默认值类型，0无，1为静态，2为系统变量，默认为0
     */
    public Byte getDefaultType() {
        return defaultType;
    }

    /**
     * 设置默认值类型，0无，1为静态，2为系统变量，默认为0
     *
     * @param defaultType 默认值类型，0无，1为静态，2为系统变量，默认为0
     */
    public void setDefaultType(Byte defaultType) {
        this.defaultType = defaultType;
    }

    /**
     * 获取默认值类型为1静态时，设置静态默认值
     *
     * @return DEFAULT_VALUE - 默认值类型为1静态时，设置静态默认值
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置默认值类型为1静态时，设置静态默认值
     *
     * @param defaultValue 默认值类型为1静态时，设置静态默认值
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取默认值类型为2系统变量时显示，包含当前时间、当前操作人ID、当前操作人姓名、当前职位ID、当前职位描述、当前机构ID、当前机构描述..
     *
     * @return SYSTEM_VAIRABLE - 默认值类型为2系统变量时显示，包含当前时间、当前操作人ID、当前操作人姓名、当前职位ID、当前职位描述、当前机构ID、当前机构描述..
     */
    public String getSystemVairable() {
        return systemVairable;
    }

    /**
     * 设置默认值类型为2系统变量时显示，包含当前时间、当前操作人ID、当前操作人姓名、当前职位ID、当前职位描述、当前机构ID、当前机构描述..
     *
     * @param systemVairable 默认值类型为2系统变量时显示，包含当前时间、当前操作人ID、当前操作人姓名、当前职位ID、当前职位描述、当前机构ID、当前机构描述..
     */
    public void setSystemVairable(String systemVairable) {
        this.systemVairable = systemVairable;
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