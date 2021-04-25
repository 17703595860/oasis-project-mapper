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
@Table(name = "TZ_OPPORTUNITY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzOpportunity {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 商机名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 商机编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 客户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 商机状态 0-未开始 1-进行中 2-已关闭
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 预签单金额
     */
    @Column(name = "AMT")
    private Long amt;

    /**
     * 销售阶段
     */
    @Column(name = "STAGE")
    private String stage;

    /**
     * 可能性
     */
    @Column(name = "POSSIBLE")
    private Integer possible;

    /**
     * 销售职位ID
     */
    @Column(name = "POSTN_ID")
    private String postnId;

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