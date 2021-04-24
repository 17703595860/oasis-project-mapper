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
@Table(name = "TZ_ACTIVITY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzActivity {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 主题
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 优先级
     */
    @Column(name = "PRIORITY")
    private String priority;

    /**
     * 截止日期
     */
    @Column(name = "ENDDATE")
    private Date enddate;

    /**
     * 商机ID
     */
    @Column(name = "OPPTY_ID")
    private String opptyId;

    /**
     * 客户ID
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 执行结果
     */
    @Column(name = "OUTCOME")
    private String outcome;

    /**
     * ‘Y’-活动的 ‘N’-已关闭
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

    /**
     * 负责人ID
     */
    @Column(name = "OWNER_ID")
    private String ownerId;

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