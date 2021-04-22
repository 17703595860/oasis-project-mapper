package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_XUNH_DEFN_T")
public class TzXunhDefnT {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
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

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return TZ_JG_ID
     */
    public String getTzJgId() {
        return tzJgId;
    }

    /**
     * @param tzJgId
     */
    public void setTzJgId(String tzJgId) {
        this.tzJgId = tzJgId;
    }

    /**
     * @return TZ_XH_MC
     */
    public String getTzXhMc() {
        return tzXhMc;
    }

    /**
     * @param tzXhMc
     */
    public void setTzXhMc(String tzXhMc) {
        this.tzXhMc = tzXhMc;
    }

    /**
     * @return TZ_XH_MS
     */
    public String getTzXhMs() {
        return tzXhMs;
    }

    /**
     * @param tzXhMs
     */
    public void setTzXhMs(String tzXhMs) {
        this.tzXhMs = tzXhMs;
    }

    /**
     * @return TZ_EE_BZ
     */
    public String getTzEeBz() {
        return tzEeBz;
    }

    /**
     * @param tzEeBz
     */
    public void setTzEeBz(String tzEeBz) {
        this.tzEeBz = tzEeBz;
    }

    /**
     * @return TZ_XH_QZBDS
     */
    public String getTzXhQzbds() {
        return tzXhQzbds;
    }

    /**
     * @param tzXhQzbds
     */
    public void setTzXhQzbds(String tzXhQzbds) {
        this.tzXhQzbds = tzXhQzbds;
    }

    /**
     * @return TZ_ZDYXH_BZ
     */
    public String getTzZdyxhBz() {
        return tzZdyxhBz;
    }

    /**
     * @param tzZdyxhBz
     */
    public void setTzZdyxhBz(String tzZdyxhBz) {
        this.tzZdyxhBz = tzZdyxhBz;
    }

    /**
     * @return TZ_XHZD_Y
     */
    public String getTzXhzdY() {
        return tzXhzdY;
    }

    /**
     * @param tzXhzdY
     */
    public void setTzXhzdY(String tzXhzdY) {
        this.tzXhzdY = tzXhzdY;
    }

    /**
     * @return TZ_XHZD_W
     */
    public String getTzXhzdW() {
        return tzXhzdW;
    }

    /**
     * @param tzXhzdW
     */
    public void setTzXhzdW(String tzXhzdW) {
        this.tzXhzdW = tzXhzdW;
    }

    /**
     * @return TZ_XHZD_M1
     */
    public String getTzXhzdM1() {
        return tzXhzdM1;
    }

    /**
     * @param tzXhzdM1
     */
    public void setTzXhzdM1(String tzXhzdM1) {
        this.tzXhzdM1 = tzXhzdM1;
    }

    /**
     * @return TZ_XHZD_D
     */
    public String getTzXhzdD() {
        return tzXhzdD;
    }

    /**
     * @param tzXhzdD
     */
    public void setTzXhzdD(String tzXhzdD) {
        this.tzXhzdD = tzXhzdD;
    }

    /**
     * @return TZ_XHZD_H
     */
    public String getTzXhzdH() {
        return tzXhzdH;
    }

    /**
     * @param tzXhzdH
     */
    public void setTzXhzdH(String tzXhzdH) {
        this.tzXhzdH = tzXhzdH;
    }

    /**
     * @return TZ_XHZD_M2
     */
    public String getTzXhzdM2() {
        return tzXhzdM2;
    }

    /**
     * @param tzXhzdM2
     */
    public void setTzXhzdM2(String tzXhzdM2) {
        this.tzXhzdM2 = tzXhzdM2;
    }

    /**
     * @return TZ_XHZD_S
     */
    public String getTzXhzdS() {
        return tzXhzdS;
    }

    /**
     * @param tzXhzdS
     */
    public void setTzXhzdS(String tzXhzdS) {
        this.tzXhzdS = tzXhzdS;
    }

    /**
     * @return TZ_Y_QZGZ
     */
    public String getTzYQzgz() {
        return tzYQzgz;
    }

    /**
     * @param tzYQzgz
     */
    public void setTzYQzgz(String tzYQzgz) {
        this.tzYQzgz = tzYQzgz;
    }

    /**
     * @return TZ_Y_QSNF
     */
    public Integer getTzYQsnf() {
        return tzYQsnf;
    }

    /**
     * @param tzYQsnf
     */
    public void setTzYQsnf(Integer tzYQsnf) {
        this.tzYQsnf = tzYQsnf;
    }

    /**
     * @return TZ_Y_JZNF
     */
    public Integer getTzYJznf() {
        return tzYJznf;
    }

    /**
     * @param tzYJznf
     */
    public void setTzYJznf(Integer tzYJznf) {
        this.tzYJznf = tzYJznf;
    }

    /**
     * @return TZ_Y_LBQZ
     */
    public String getTzYLbqz() {
        return tzYLbqz;
    }

    /**
     * @param tzYLbqz
     */
    public void setTzYLbqz(String tzYLbqz) {
        this.tzYLbqz = tzYLbqz;
    }

    /**
     * @return TZ_Y_XHQZ
     */
    public String getTzYXhqz() {
        return tzYXhqz;
    }

    /**
     * @param tzYXhqz
     */
    public void setTzYXhqz(String tzYXhqz) {
        this.tzYXhqz = tzYXhqz;
    }

    /**
     * @return TZ_Y_QZBDS
     */
    public String getTzYQzbds() {
        return tzYQzbds;
    }

    /**
     * @param tzYQzbds
     */
    public void setTzYQzbds(String tzYQzbds) {
        this.tzYQzbds = tzYQzbds;
    }

    /**
     * @return TZ_M1_QZGZ
     */
    public String getTzM1Qzgz() {
        return tzM1Qzgz;
    }

    /**
     * @param tzM1Qzgz
     */
    public void setTzM1Qzgz(String tzM1Qzgz) {
        this.tzM1Qzgz = tzM1Qzgz;
    }

    /**
     * @return TZ_M1_QSYF
     */
    public Integer getTzM1Qsyf() {
        return tzM1Qsyf;
    }

    /**
     * @param tzM1Qsyf
     */
    public void setTzM1Qsyf(Integer tzM1Qsyf) {
        this.tzM1Qsyf = tzM1Qsyf;
    }

    /**
     * @return TZ_M1_JZYF
     */
    public Integer getTzM1Jzyf() {
        return tzM1Jzyf;
    }

    /**
     * @param tzM1Jzyf
     */
    public void setTzM1Jzyf(Integer tzM1Jzyf) {
        this.tzM1Jzyf = tzM1Jzyf;
    }

    /**
     * @return TZ_M1_LBQZ
     */
    public String getTzM1Lbqz() {
        return tzM1Lbqz;
    }

    /**
     * @param tzM1Lbqz
     */
    public void setTzM1Lbqz(String tzM1Lbqz) {
        this.tzM1Lbqz = tzM1Lbqz;
    }

    /**
     * @return TZ_M1_XHQZ
     */
    public String getTzM1Xhqz() {
        return tzM1Xhqz;
    }

    /**
     * @param tzM1Xhqz
     */
    public void setTzM1Xhqz(String tzM1Xhqz) {
        this.tzM1Xhqz = tzM1Xhqz;
    }

    /**
     * @return TZ_M1_QZBDS
     */
    public String getTzM1Qzbds() {
        return tzM1Qzbds;
    }

    /**
     * @param tzM1Qzbds
     */
    public void setTzM1Qzbds(String tzM1Qzbds) {
        this.tzM1Qzbds = tzM1Qzbds;
    }

    /**
     * @return TZ_RZ_RY_BZ
     */
    public String getTzRzRyBz() {
        return tzRzRyBz;
    }

    /**
     * @param tzRzRyBz
     */
    public void setTzRzRyBz(String tzRzRyBz) {
        this.tzRzRyBz = tzRzRyBz;
    }

    /**
     * @return TZ_D_QZGZ
     */
    public String getTzDQzgz() {
        return tzDQzgz;
    }

    /**
     * @param tzDQzgz
     */
    public void setTzDQzgz(String tzDQzgz) {
        this.tzDQzgz = tzDQzgz;
    }

    /**
     * @return TZ_D_QSRQ
     */
    public Integer getTzDQsrq() {
        return tzDQsrq;
    }

    /**
     * @param tzDQsrq
     */
    public void setTzDQsrq(Integer tzDQsrq) {
        this.tzDQsrq = tzDQsrq;
    }

    /**
     * @return TZ_D_JZRQ
     */
    public Integer getTzDJzrq() {
        return tzDJzrq;
    }

    /**
     * @param tzDJzrq
     */
    public void setTzDJzrq(Integer tzDJzrq) {
        this.tzDJzrq = tzDJzrq;
    }

    /**
     * @return TZ_D_LBQZ
     */
    public String getTzDLbqz() {
        return tzDLbqz;
    }

    /**
     * @param tzDLbqz
     */
    public void setTzDLbqz(String tzDLbqz) {
        this.tzDLbqz = tzDLbqz;
    }

    /**
     * @return TZ_D_XHQZ
     */
    public String getTzDXhqz() {
        return tzDXhqz;
    }

    /**
     * @param tzDXhqz
     */
    public void setTzDXhqz(String tzDXhqz) {
        this.tzDXhqz = tzDXhqz;
    }

    /**
     * @return TZ_D_ZDRQ
     */
    public Integer getTzDZdrq() {
        return tzDZdrq;
    }

    /**
     * @param tzDZdrq
     */
    public void setTzDZdrq(Integer tzDZdrq) {
        this.tzDZdrq = tzDZdrq;
    }

    /**
     * @return TZ_D_QZBDS
     */
    public String getTzDQzbds() {
        return tzDQzbds;
    }

    /**
     * @param tzDQzbds
     */
    public void setTzDQzbds(String tzDQzbds) {
        this.tzDQzbds = tzDQzbds;
    }

    /**
     * @return TZ_W_QZGZ
     */
    public String getTzWQzgz() {
        return tzWQzgz;
    }

    /**
     * @param tzWQzgz
     */
    public void setTzWQzgz(String tzWQzgz) {
        this.tzWQzgz = tzWQzgz;
    }

    /**
     * @return TZ_W_QSRQ
     */
    public Integer getTzWQsrq() {
        return tzWQsrq;
    }

    /**
     * @param tzWQsrq
     */
    public void setTzWQsrq(Integer tzWQsrq) {
        this.tzWQsrq = tzWQsrq;
    }

    /**
     * @return TZ_W_JZRQ
     */
    public Integer getTzWJzrq() {
        return tzWJzrq;
    }

    /**
     * @param tzWJzrq
     */
    public void setTzWJzrq(Integer tzWJzrq) {
        this.tzWJzrq = tzWJzrq;
    }

    /**
     * @return TZ_W_LBQZ
     */
    public String getTzWLbqz() {
        return tzWLbqz;
    }

    /**
     * @param tzWLbqz
     */
    public void setTzWLbqz(String tzWLbqz) {
        this.tzWLbqz = tzWLbqz;
    }

    /**
     * @return TZ_W_XHQZ
     */
    public String getTzWXhqz() {
        return tzWXhqz;
    }

    /**
     * @param tzWXhqz
     */
    public void setTzWXhqz(String tzWXhqz) {
        this.tzWXhqz = tzWXhqz;
    }

    /**
     * @return TZ_W_ZDRQ1
     */
    public Integer getTzWZdrq1() {
        return tzWZdrq1;
    }

    /**
     * @param tzWZdrq1
     */
    public void setTzWZdrq1(Integer tzWZdrq1) {
        this.tzWZdrq1 = tzWZdrq1;
    }

    /**
     * @return TZ_W_ZDZC
     */
    public Integer getTzWZdzc() {
        return tzWZdzc;
    }

    /**
     * @param tzWZdzc
     */
    public void setTzWZdzc(Integer tzWZdzc) {
        this.tzWZdzc = tzWZdzc;
    }

    /**
     * @return TZ_W_ZDRQ2
     */
    public Integer getTzWZdrq2() {
        return tzWZdrq2;
    }

    /**
     * @param tzWZdrq2
     */
    public void setTzWZdrq2(Integer tzWZdrq2) {
        this.tzWZdrq2 = tzWZdrq2;
    }

    /**
     * @return TZ_W_QZBDS
     */
    public String getTzWQzbds() {
        return tzWQzbds;
    }

    /**
     * @param tzWQzbds
     */
    public void setTzWQzbds(String tzWQzbds) {
        this.tzWQzbds = tzWQzbds;
    }

    /**
     * @return TZ_H_QZGZ
     */
    public String getTzHQzgz() {
        return tzHQzgz;
    }

    /**
     * @param tzHQzgz
     */
    public void setTzHQzgz(String tzHQzgz) {
        this.tzHQzgz = tzHQzgz;
    }

    /**
     * @return TZ_H_QSXS
     */
    public Integer getTzHQsxs() {
        return tzHQsxs;
    }

    /**
     * @param tzHQsxs
     */
    public void setTzHQsxs(Integer tzHQsxs) {
        this.tzHQsxs = tzHQsxs;
    }

    /**
     * @return TZ_H_JZXS
     */
    public Integer getTzHJzxs() {
        return tzHJzxs;
    }

    /**
     * @param tzHJzxs
     */
    public void setTzHJzxs(Integer tzHJzxs) {
        this.tzHJzxs = tzHJzxs;
    }

    /**
     * @return TZ_H_LBQZ
     */
    public String getTzHLbqz() {
        return tzHLbqz;
    }

    /**
     * @param tzHLbqz
     */
    public void setTzHLbqz(String tzHLbqz) {
        this.tzHLbqz = tzHLbqz;
    }

    /**
     * @return TZ_H_XHQZ
     */
    public String getTzHXhqz() {
        return tzHXhqz;
    }

    /**
     * @param tzHXhqz
     */
    public void setTzHXhqz(String tzHXhqz) {
        this.tzHXhqz = tzHXhqz;
    }

    /**
     * @return TZ_H_QZBDS
     */
    public String getTzHQzbds() {
        return tzHQzbds;
    }

    /**
     * @param tzHQzbds
     */
    public void setTzHQzbds(String tzHQzbds) {
        this.tzHQzbds = tzHQzbds;
    }

    /**
     * @return TZ_M2_QZGZ
     */
    public String getTzM2Qzgz() {
        return tzM2Qzgz;
    }

    /**
     * @param tzM2Qzgz
     */
    public void setTzM2Qzgz(String tzM2Qzgz) {
        this.tzM2Qzgz = tzM2Qzgz;
    }

    /**
     * @return TZ_M2_QSFZ
     */
    public Integer getTzM2Qsfz() {
        return tzM2Qsfz;
    }

    /**
     * @param tzM2Qsfz
     */
    public void setTzM2Qsfz(Integer tzM2Qsfz) {
        this.tzM2Qsfz = tzM2Qsfz;
    }

    /**
     * @return TZ_M2_JZFZ
     */
    public Integer getTzM2Jzfz() {
        return tzM2Jzfz;
    }

    /**
     * @param tzM2Jzfz
     */
    public void setTzM2Jzfz(Integer tzM2Jzfz) {
        this.tzM2Jzfz = tzM2Jzfz;
    }

    /**
     * @return TZ_M2_LBQZ
     */
    public String getTzM2Lbqz() {
        return tzM2Lbqz;
    }

    /**
     * @param tzM2Lbqz
     */
    public void setTzM2Lbqz(String tzM2Lbqz) {
        this.tzM2Lbqz = tzM2Lbqz;
    }

    /**
     * @return TZ_M2_XHQZ
     */
    public String getTzM2Xhqz() {
        return tzM2Xhqz;
    }

    /**
     * @param tzM2Xhqz
     */
    public void setTzM2Xhqz(String tzM2Xhqz) {
        this.tzM2Xhqz = tzM2Xhqz;
    }

    /**
     * @return TZ_M2_QZBDS
     */
    public String getTzM2Qzbds() {
        return tzM2Qzbds;
    }

    /**
     * @param tzM2Qzbds
     */
    public void setTzM2Qzbds(String tzM2Qzbds) {
        this.tzM2Qzbds = tzM2Qzbds;
    }

    /**
     * @return TZ_S_QZGZ
     */
    public String getTzSQzgz() {
        return tzSQzgz;
    }

    /**
     * @param tzSQzgz
     */
    public void setTzSQzgz(String tzSQzgz) {
        this.tzSQzgz = tzSQzgz;
    }

    /**
     * @return TZ_S_QSM
     */
    public Integer getTzSQsm() {
        return tzSQsm;
    }

    /**
     * @param tzSQsm
     */
    public void setTzSQsm(Integer tzSQsm) {
        this.tzSQsm = tzSQsm;
    }

    /**
     * @return TZ_S_JZM
     */
    public Integer getTzSJzm() {
        return tzSJzm;
    }

    /**
     * @param tzSJzm
     */
    public void setTzSJzm(Integer tzSJzm) {
        this.tzSJzm = tzSJzm;
    }

    /**
     * @return TZ_S_LBQZ
     */
    public String getTzSLbqz() {
        return tzSLbqz;
    }

    /**
     * @param tzSLbqz
     */
    public void setTzSLbqz(String tzSLbqz) {
        this.tzSLbqz = tzSLbqz;
    }

    /**
     * @return TZ_S_XHQZ
     */
    public String getTzSXhqz() {
        return tzSXhqz;
    }

    /**
     * @param tzSXhqz
     */
    public void setTzSXhqz(String tzSXhqz) {
        this.tzSXhqz = tzSXhqz;
    }

    /**
     * @return TZ_S_QZBDS
     */
    public String getTzSQzbds() {
        return tzSQzbds;
    }

    /**
     * @param tzSQzbds
     */
    public void setTzSQzbds(String tzSQzbds) {
        this.tzSQzbds = tzSQzbds;
    }

    /**
     * @return TZ_YEAR_CHECK
     */
    public String getTzYearCheck() {
        return tzYearCheck;
    }

    /**
     * @param tzYearCheck
     */
    public void setTzYearCheck(String tzYearCheck) {
        this.tzYearCheck = tzYearCheck;
    }

    /**
     * @return TZ_MONTH_CHECK
     */
    public String getTzMonthCheck() {
        return tzMonthCheck;
    }

    /**
     * @param tzMonthCheck
     */
    public void setTzMonthCheck(String tzMonthCheck) {
        this.tzMonthCheck = tzMonthCheck;
    }

    /**
     * @return TZ_DAY1_CHECK
     */
    public String getTzDay1Check() {
        return tzDay1Check;
    }

    /**
     * @param tzDay1Check
     */
    public void setTzDay1Check(String tzDay1Check) {
        this.tzDay1Check = tzDay1Check;
    }

    /**
     * @return TZ_DAY2_CHECK
     */
    public String getTzDay2Check() {
        return tzDay2Check;
    }

    /**
     * @param tzDay2Check
     */
    public void setTzDay2Check(String tzDay2Check) {
        this.tzDay2Check = tzDay2Check;
    }

    /**
     * @return TZ_HOUR_CHECK
     */
    public String getTzHourCheck() {
        return tzHourCheck;
    }

    /**
     * @param tzHourCheck
     */
    public void setTzHourCheck(String tzHourCheck) {
        this.tzHourCheck = tzHourCheck;
    }

    /**
     * @return TZ_MINUTE_CHECK
     */
    public String getTzMinuteCheck() {
        return tzMinuteCheck;
    }

    /**
     * @param tzMinuteCheck
     */
    public void setTzMinuteCheck(String tzMinuteCheck) {
        this.tzMinuteCheck = tzMinuteCheck;
    }

    /**
     * @return TZ_SECOND_CHECK
     */
    public String getTzSecondCheck() {
        return tzSecondCheck;
    }

    /**
     * @param tzSecondCheck
     */
    public void setTzSecondCheck(String tzSecondCheck) {
        this.tzSecondCheck = tzSecondCheck;
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