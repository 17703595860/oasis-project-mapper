package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_IMPORT_TEMPLATE_FIELD")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzImportTemplateField {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
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
}