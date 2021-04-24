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
@Table(name = "TZ_IMPORT_HISTORY_DETAILS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzImportHistoryDetails {
    /**
     * 主键id
     */
    @Id
    @Column(name = "ID")
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
}