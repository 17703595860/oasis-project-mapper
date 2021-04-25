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
@Table(name = "TZ_XUNH_DEFN_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzXunhDefnT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    @Column(name = "TZ_XH_MC")
    private String tzXhMc;

    @Column(name = "TZ_XH_MS")
    private String tzXhMs;

    @Column(name = "TZ_EE_BZ")
    private String tzEeBz;

    @Column(name = "TZ_XH_QZBDS")
    private String tzXhQzbds;

    @Column(name = "TZ_ZDYXH_BZ")
    private String tzZdyxhBz;

    @Column(name = "TZ_XHZD_Y")
    private String tzXhzdY;

    @Column(name = "TZ_XHZD_W")
    private String tzXhzdW;

    @Column(name = "TZ_XHZD_M1")
    private String tzXhzdM1;

    @Column(name = "TZ_XHZD_D")
    private String tzXhzdD;

    @Column(name = "TZ_XHZD_H")
    private String tzXhzdH;

    @Column(name = "TZ_XHZD_M2")
    private String tzXhzdM2;

    @Column(name = "TZ_XHZD_S")
    private String tzXhzdS;

    @Column(name = "TZ_Y_QZGZ")
    private String tzYQzgz;

    @Column(name = "TZ_Y_QSNF")
    private Integer tzYQsnf;

    @Column(name = "TZ_Y_JZNF")
    private Integer tzYJznf;

    @Column(name = "TZ_Y_LBQZ")
    private String tzYLbqz;

    @Column(name = "TZ_Y_XHQZ")
    private String tzYXhqz;

    @Column(name = "TZ_Y_QZBDS")
    private String tzYQzbds;

    @Column(name = "TZ_M1_QZGZ")
    private String tzM1Qzgz;

    @Column(name = "TZ_M1_QSYF")
    private Integer tzM1Qsyf;

    @Column(name = "TZ_M1_JZYF")
    private Integer tzM1Jzyf;

    @Column(name = "TZ_M1_LBQZ")
    private String tzM1Lbqz;

    @Column(name = "TZ_M1_XHQZ")
    private String tzM1Xhqz;

    @Column(name = "TZ_M1_QZBDS")
    private String tzM1Qzbds;

    @Column(name = "TZ_RZ_RY_BZ")
    private String tzRzRyBz;

    @Column(name = "TZ_D_QZGZ")
    private String tzDQzgz;

    @Column(name = "TZ_D_QSRQ")
    private Integer tzDQsrq;

    @Column(name = "TZ_D_JZRQ")
    private Integer tzDJzrq;

    @Column(name = "TZ_D_LBQZ")
    private String tzDLbqz;

    @Column(name = "TZ_D_XHQZ")
    private String tzDXhqz;

    @Column(name = "TZ_D_ZDRQ")
    private Integer tzDZdrq;

    @Column(name = "TZ_D_QZBDS")
    private String tzDQzbds;

    @Column(name = "TZ_W_QZGZ")
    private String tzWQzgz;

    @Column(name = "TZ_W_QSRQ")
    private Integer tzWQsrq;

    @Column(name = "TZ_W_JZRQ")
    private Integer tzWJzrq;

    @Column(name = "TZ_W_LBQZ")
    private String tzWLbqz;

    @Column(name = "TZ_W_XHQZ")
    private String tzWXhqz;

    @Column(name = "TZ_W_ZDRQ1")
    private Integer tzWZdrq1;

    @Column(name = "TZ_W_ZDZC")
    private Integer tzWZdzc;

    @Column(name = "TZ_W_ZDRQ2")
    private Integer tzWZdrq2;

    @Column(name = "TZ_W_QZBDS")
    private String tzWQzbds;

    @Column(name = "TZ_H_QZGZ")
    private String tzHQzgz;

    @Column(name = "TZ_H_QSXS")
    private Integer tzHQsxs;

    @Column(name = "TZ_H_JZXS")
    private Integer tzHJzxs;

    @Column(name = "TZ_H_LBQZ")
    private String tzHLbqz;

    @Column(name = "TZ_H_XHQZ")
    private String tzHXhqz;

    @Column(name = "TZ_H_QZBDS")
    private String tzHQzbds;

    @Column(name = "TZ_M2_QZGZ")
    private String tzM2Qzgz;

    @Column(name = "TZ_M2_QSFZ")
    private Integer tzM2Qsfz;

    @Column(name = "TZ_M2_JZFZ")
    private Integer tzM2Jzfz;

    @Column(name = "TZ_M2_LBQZ")
    private String tzM2Lbqz;

    @Column(name = "TZ_M2_XHQZ")
    private String tzM2Xhqz;

    @Column(name = "TZ_M2_QZBDS")
    private String tzM2Qzbds;

    @Column(name = "TZ_S_QZGZ")
    private String tzSQzgz;

    @Column(name = "TZ_S_QSM")
    private Integer tzSQsm;

    @Column(name = "TZ_S_JZM")
    private Integer tzSJzm;

    @Column(name = "TZ_S_LBQZ")
    private String tzSLbqz;

    @Column(name = "TZ_S_XHQZ")
    private String tzSXhqz;

    @Column(name = "TZ_S_QZBDS")
    private String tzSQzbds;

    @Column(name = "TZ_YEAR_CHECK")
    private String tzYearCheck;

    @Column(name = "TZ_MONTH_CHECK")
    private String tzMonthCheck;

    @Column(name = "TZ_DAY1_CHECK")
    private String tzDay1Check;

    @Column(name = "TZ_DAY2_CHECK")
    private String tzDay2Check;

    @Column(name = "TZ_HOUR_CHECK")
    private String tzHourCheck;

    @Column(name = "TZ_MINUTE_CHECK")
    private String tzMinuteCheck;

    @Column(name = "TZ_SECOND_CHECK")
    private String tzSecondCheck;

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