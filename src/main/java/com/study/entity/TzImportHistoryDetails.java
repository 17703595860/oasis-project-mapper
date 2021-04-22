package com.study.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "TZ_IMPORT_HISTORY_DETAILS")
public class TzImportHistoryDetails {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 状态，0等待，1成功，2失败
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * History id,外键
     */
    @Column(name = "HISTORY_ID")
    private String historyId;

    /**
     * 日志阶段，1转换，2新增，3更新
     */
    @Column(name = "LOG_STAGE")
    private Byte logStage;

    /**
     * 失败的简短说明
     */
    @Column(name = "MESSAGE")
    private String message;

    /**
     * 失败的列标题
     */
    @Column(name = "COL_TITLE")
    private String colTitle;

    /**
     * 失败的列值
     */
    @Column(name = "COL_VALUE")
    private String colValue;

    /**
     * 在文件中的行号
     */
    @Column(name = "ROW_NUM")
    private String rowNum;

    /**
     * 操作数据的id
     */
    @Column(name = "DATA_ID")
    private String dataId;

    /**
     * 中间字段
     */
    @Column(name = "DATA1")
    private String data1;

    /**
     * 中间字段
     */
    @Column(name = "DATA2")
    private String data2;

    /**
     * 中间字段
     */
    @Column(name = "DATA3")
    private String data3;

    /**
     * 中间字段
     */
    @Column(name = "DATA4")
    private String data4;

    /**
     * 中间字段
     */
    @Column(name = "DATA5")
    private String data5;

    /**
     * 中间字段
     */
    @Column(name = "DATA6")
    private String data6;

    /**
     * 中间字段
     */
    @Column(name = "DATA7")
    private String data7;

    /**
     * 中间字段
     */
    @Column(name = "DATA8")
    private String data8;

    /**
     * 中间字段
     */
    @Column(name = "DATA9")
    private String data9;

    /**
     * 中间字段
     */
    @Column(name = "DATA10")
    private String data10;

    /**
     * 中间字段
     */
    @Column(name = "DATA11")
    private String data11;

    /**
     * 中间字段
     */
    @Column(name = "DATA12")
    private String data12;

    /**
     * 中间字段
     */
    @Column(name = "DATA13")
    private String data13;

    /**
     * 中间字段
     */
    @Column(name = "DATA14")
    private String data14;

    /**
     * 中间字段
     */
    @Column(name = "DATA15")
    private String data15;

    /**
     * 中间字段
     */
    @Column(name = "DATA16")
    private String data16;

    /**
     * 中间字段
     */
    @Column(name = "DATA17")
    private String data17;

    /**
     * 中间字段
     */
    @Column(name = "DATA18")
    private String data18;

    /**
     * 中间字段
     */
    @Column(name = "DATA19")
    private String data19;

    /**
     * 中间字段
     */
    @Column(name = "DATA20")
    private String data20;

    /**
     * 中间字段
     */
    @Column(name = "DATA21")
    private String data21;

    /**
     * 中间字段
     */
    @Column(name = "DATA22")
    private String data22;

    /**
     * 中间字段
     */
    @Column(name = "DATA23")
    private String data23;

    /**
     * 中间字段
     */
    @Column(name = "DATA24")
    private String data24;

    /**
     * 中间字段
     */
    @Column(name = "DATA25")
    private String data25;

    /**
     * 中间字段
     */
    @Column(name = "DATA26")
    private String data26;

    /**
     * 中间字段
     */
    @Column(name = "DATA27")
    private String data27;

    /**
     * 中间字段
     */
    @Column(name = "DATA28")
    private String data28;

    /**
     * 中间字段
     */
    @Column(name = "DATA29")
    private String data29;

    /**
     * 中间字段
     */
    @Column(name = "DATA30")
    private String data30;

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
     * 中间字段
     */
    @Column(name = "TEXT1")
    private String text1;

    /**
     * 中间字段
     */
    @Column(name = "TEXT2")
    private String text2;

    /**
     * 中间字段
     */
    @Column(name = "TEXT3")
    private String text3;

    /**
     * 中间字段
     */
    @Column(name = "TEXT4")
    private String text4;

    /**
     * 中间字段
     */
    @Column(name = "TEXT5")
    private String text5;

    /**
     * 中间字段
     */
    @Column(name = "TEXT6")
    private String text6;

    /**
     * 中间字段
     */
    @Column(name = "TEXT7")
    private String text7;

    /**
     * 中间字段
     */
    @Column(name = "TEXT8")
    private String text8;

    /**
     * 中间字段
     */
    @Column(name = "TEXT9")
    private String text9;

    /**
     * 中间字段
     */
    @Column(name = "TEXT10")
    private String text10;

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
     * 获取状态，0等待，1成功，2失败
     *
     * @return STATUS - 状态，0等待，1成功，2失败
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态，0等待，1成功，2失败
     *
     * @param status 状态，0等待，1成功，2失败
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取History id,外键
     *
     * @return HISTORY_ID - History id,外键
     */
    public String getHistoryId() {
        return historyId;
    }

    /**
     * 设置History id,外键
     *
     * @param historyId History id,外键
     */
    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    /**
     * 获取日志阶段，1转换，2新增，3更新
     *
     * @return LOG_STAGE - 日志阶段，1转换，2新增，3更新
     */
    public Byte getLogStage() {
        return logStage;
    }

    /**
     * 设置日志阶段，1转换，2新增，3更新
     *
     * @param logStage 日志阶段，1转换，2新增，3更新
     */
    public void setLogStage(Byte logStage) {
        this.logStage = logStage;
    }

    /**
     * 获取失败的简短说明
     *
     * @return MESSAGE - 失败的简短说明
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置失败的简短说明
     *
     * @param message 失败的简短说明
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取失败的列标题
     *
     * @return COL_TITLE - 失败的列标题
     */
    public String getColTitle() {
        return colTitle;
    }

    /**
     * 设置失败的列标题
     *
     * @param colTitle 失败的列标题
     */
    public void setColTitle(String colTitle) {
        this.colTitle = colTitle;
    }

    /**
     * 获取失败的列值
     *
     * @return COL_VALUE - 失败的列值
     */
    public String getColValue() {
        return colValue;
    }

    /**
     * 设置失败的列值
     *
     * @param colValue 失败的列值
     */
    public void setColValue(String colValue) {
        this.colValue = colValue;
    }

    /**
     * 获取在文件中的行号
     *
     * @return ROW_NUM - 在文件中的行号
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * 设置在文件中的行号
     *
     * @param rowNum 在文件中的行号
     */
    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    /**
     * 获取操作数据的id
     *
     * @return DATA_ID - 操作数据的id
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * 设置操作数据的id
     *
     * @param dataId 操作数据的id
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * 获取中间字段
     *
     * @return DATA1 - 中间字段
     */
    public String getData1() {
        return data1;
    }

    /**
     * 设置中间字段
     *
     * @param data1 中间字段
     */
    public void setData1(String data1) {
        this.data1 = data1;
    }

    /**
     * 获取中间字段
     *
     * @return DATA2 - 中间字段
     */
    public String getData2() {
        return data2;
    }

    /**
     * 设置中间字段
     *
     * @param data2 中间字段
     */
    public void setData2(String data2) {
        this.data2 = data2;
    }

    /**
     * 获取中间字段
     *
     * @return DATA3 - 中间字段
     */
    public String getData3() {
        return data3;
    }

    /**
     * 设置中间字段
     *
     * @param data3 中间字段
     */
    public void setData3(String data3) {
        this.data3 = data3;
    }

    /**
     * 获取中间字段
     *
     * @return DATA4 - 中间字段
     */
    public String getData4() {
        return data4;
    }

    /**
     * 设置中间字段
     *
     * @param data4 中间字段
     */
    public void setData4(String data4) {
        this.data4 = data4;
    }

    /**
     * 获取中间字段
     *
     * @return DATA5 - 中间字段
     */
    public String getData5() {
        return data5;
    }

    /**
     * 设置中间字段
     *
     * @param data5 中间字段
     */
    public void setData5(String data5) {
        this.data5 = data5;
    }

    /**
     * 获取中间字段
     *
     * @return DATA6 - 中间字段
     */
    public String getData6() {
        return data6;
    }

    /**
     * 设置中间字段
     *
     * @param data6 中间字段
     */
    public void setData6(String data6) {
        this.data6 = data6;
    }

    /**
     * 获取中间字段
     *
     * @return DATA7 - 中间字段
     */
    public String getData7() {
        return data7;
    }

    /**
     * 设置中间字段
     *
     * @param data7 中间字段
     */
    public void setData7(String data7) {
        this.data7 = data7;
    }

    /**
     * 获取中间字段
     *
     * @return DATA8 - 中间字段
     */
    public String getData8() {
        return data8;
    }

    /**
     * 设置中间字段
     *
     * @param data8 中间字段
     */
    public void setData8(String data8) {
        this.data8 = data8;
    }

    /**
     * 获取中间字段
     *
     * @return DATA9 - 中间字段
     */
    public String getData9() {
        return data9;
    }

    /**
     * 设置中间字段
     *
     * @param data9 中间字段
     */
    public void setData9(String data9) {
        this.data9 = data9;
    }

    /**
     * 获取中间字段
     *
     * @return DATA10 - 中间字段
     */
    public String getData10() {
        return data10;
    }

    /**
     * 设置中间字段
     *
     * @param data10 中间字段
     */
    public void setData10(String data10) {
        this.data10 = data10;
    }

    /**
     * 获取中间字段
     *
     * @return DATA11 - 中间字段
     */
    public String getData11() {
        return data11;
    }

    /**
     * 设置中间字段
     *
     * @param data11 中间字段
     */
    public void setData11(String data11) {
        this.data11 = data11;
    }

    /**
     * 获取中间字段
     *
     * @return DATA12 - 中间字段
     */
    public String getData12() {
        return data12;
    }

    /**
     * 设置中间字段
     *
     * @param data12 中间字段
     */
    public void setData12(String data12) {
        this.data12 = data12;
    }

    /**
     * 获取中间字段
     *
     * @return DATA13 - 中间字段
     */
    public String getData13() {
        return data13;
    }

    /**
     * 设置中间字段
     *
     * @param data13 中间字段
     */
    public void setData13(String data13) {
        this.data13 = data13;
    }

    /**
     * 获取中间字段
     *
     * @return DATA14 - 中间字段
     */
    public String getData14() {
        return data14;
    }

    /**
     * 设置中间字段
     *
     * @param data14 中间字段
     */
    public void setData14(String data14) {
        this.data14 = data14;
    }

    /**
     * 获取中间字段
     *
     * @return DATA15 - 中间字段
     */
    public String getData15() {
        return data15;
    }

    /**
     * 设置中间字段
     *
     * @param data15 中间字段
     */
    public void setData15(String data15) {
        this.data15 = data15;
    }

    /**
     * 获取中间字段
     *
     * @return DATA16 - 中间字段
     */
    public String getData16() {
        return data16;
    }

    /**
     * 设置中间字段
     *
     * @param data16 中间字段
     */
    public void setData16(String data16) {
        this.data16 = data16;
    }

    /**
     * 获取中间字段
     *
     * @return DATA17 - 中间字段
     */
    public String getData17() {
        return data17;
    }

    /**
     * 设置中间字段
     *
     * @param data17 中间字段
     */
    public void setData17(String data17) {
        this.data17 = data17;
    }

    /**
     * 获取中间字段
     *
     * @return DATA18 - 中间字段
     */
    public String getData18() {
        return data18;
    }

    /**
     * 设置中间字段
     *
     * @param data18 中间字段
     */
    public void setData18(String data18) {
        this.data18 = data18;
    }

    /**
     * 获取中间字段
     *
     * @return DATA19 - 中间字段
     */
    public String getData19() {
        return data19;
    }

    /**
     * 设置中间字段
     *
     * @param data19 中间字段
     */
    public void setData19(String data19) {
        this.data19 = data19;
    }

    /**
     * 获取中间字段
     *
     * @return DATA20 - 中间字段
     */
    public String getData20() {
        return data20;
    }

    /**
     * 设置中间字段
     *
     * @param data20 中间字段
     */
    public void setData20(String data20) {
        this.data20 = data20;
    }

    /**
     * 获取中间字段
     *
     * @return DATA21 - 中间字段
     */
    public String getData21() {
        return data21;
    }

    /**
     * 设置中间字段
     *
     * @param data21 中间字段
     */
    public void setData21(String data21) {
        this.data21 = data21;
    }

    /**
     * 获取中间字段
     *
     * @return DATA22 - 中间字段
     */
    public String getData22() {
        return data22;
    }

    /**
     * 设置中间字段
     *
     * @param data22 中间字段
     */
    public void setData22(String data22) {
        this.data22 = data22;
    }

    /**
     * 获取中间字段
     *
     * @return DATA23 - 中间字段
     */
    public String getData23() {
        return data23;
    }

    /**
     * 设置中间字段
     *
     * @param data23 中间字段
     */
    public void setData23(String data23) {
        this.data23 = data23;
    }

    /**
     * 获取中间字段
     *
     * @return DATA24 - 中间字段
     */
    public String getData24() {
        return data24;
    }

    /**
     * 设置中间字段
     *
     * @param data24 中间字段
     */
    public void setData24(String data24) {
        this.data24 = data24;
    }

    /**
     * 获取中间字段
     *
     * @return DATA25 - 中间字段
     */
    public String getData25() {
        return data25;
    }

    /**
     * 设置中间字段
     *
     * @param data25 中间字段
     */
    public void setData25(String data25) {
        this.data25 = data25;
    }

    /**
     * 获取中间字段
     *
     * @return DATA26 - 中间字段
     */
    public String getData26() {
        return data26;
    }

    /**
     * 设置中间字段
     *
     * @param data26 中间字段
     */
    public void setData26(String data26) {
        this.data26 = data26;
    }

    /**
     * 获取中间字段
     *
     * @return DATA27 - 中间字段
     */
    public String getData27() {
        return data27;
    }

    /**
     * 设置中间字段
     *
     * @param data27 中间字段
     */
    public void setData27(String data27) {
        this.data27 = data27;
    }

    /**
     * 获取中间字段
     *
     * @return DATA28 - 中间字段
     */
    public String getData28() {
        return data28;
    }

    /**
     * 设置中间字段
     *
     * @param data28 中间字段
     */
    public void setData28(String data28) {
        this.data28 = data28;
    }

    /**
     * 获取中间字段
     *
     * @return DATA29 - 中间字段
     */
    public String getData29() {
        return data29;
    }

    /**
     * 设置中间字段
     *
     * @param data29 中间字段
     */
    public void setData29(String data29) {
        this.data29 = data29;
    }

    /**
     * 获取中间字段
     *
     * @return DATA30 - 中间字段
     */
    public String getData30() {
        return data30;
    }

    /**
     * 设置中间字段
     *
     * @param data30 中间字段
     */
    public void setData30(String data30) {
        this.data30 = data30;
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

    /**
     * 获取中间字段
     *
     * @return TEXT1 - 中间字段
     */
    public String getText1() {
        return text1;
    }

    /**
     * 设置中间字段
     *
     * @param text1 中间字段
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT2 - 中间字段
     */
    public String getText2() {
        return text2;
    }

    /**
     * 设置中间字段
     *
     * @param text2 中间字段
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT3 - 中间字段
     */
    public String getText3() {
        return text3;
    }

    /**
     * 设置中间字段
     *
     * @param text3 中间字段
     */
    public void setText3(String text3) {
        this.text3 = text3;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT4 - 中间字段
     */
    public String getText4() {
        return text4;
    }

    /**
     * 设置中间字段
     *
     * @param text4 中间字段
     */
    public void setText4(String text4) {
        this.text4 = text4;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT5 - 中间字段
     */
    public String getText5() {
        return text5;
    }

    /**
     * 设置中间字段
     *
     * @param text5 中间字段
     */
    public void setText5(String text5) {
        this.text5 = text5;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT6 - 中间字段
     */
    public String getText6() {
        return text6;
    }

    /**
     * 设置中间字段
     *
     * @param text6 中间字段
     */
    public void setText6(String text6) {
        this.text6 = text6;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT7 - 中间字段
     */
    public String getText7() {
        return text7;
    }

    /**
     * 设置中间字段
     *
     * @param text7 中间字段
     */
    public void setText7(String text7) {
        this.text7 = text7;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT8 - 中间字段
     */
    public String getText8() {
        return text8;
    }

    /**
     * 设置中间字段
     *
     * @param text8 中间字段
     */
    public void setText8(String text8) {
        this.text8 = text8;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT9 - 中间字段
     */
    public String getText9() {
        return text9;
    }

    /**
     * 设置中间字段
     *
     * @param text9 中间字段
     */
    public void setText9(String text9) {
        this.text9 = text9;
    }

    /**
     * 获取中间字段
     *
     * @return TEXT10 - 中间字段
     */
    public String getText10() {
        return text10;
    }

    /**
     * 设置中间字段
     *
     * @param text10 中间字段
     */
    public void setText10(String text10) {
        this.text10 = text10;
    }
}