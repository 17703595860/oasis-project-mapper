package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/25
*/
@Table(name = "TZ_DATA_ARGUMENT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDataArgument {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 变量名
     */
    @Column(name = "VARIABLE_CODE")
    private String variableCode;

    /**
     * 变量名称
     */
    @Column(name = "VARIABLE_NAME")
    private String variableName;

    /**
     * 变量描述
     */
    @Column(name = "VARIABLE_DESC")
    private String variableDesc;

    /**
     * 类方法
     */
    @Column(name = "CLASS_METHOD_ID")
    private String classMethodId;

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
}