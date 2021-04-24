package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/24
*/
@Table(name = "TZ_DISPFRAME_FLDDRILLDOWN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzDispframeFlddrilldown {
    @Id
    @Column(name = "ID")
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
}