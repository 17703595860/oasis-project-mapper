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
@Table(name = "TZ_JCYX_LOG_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJcyxLogT {
    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程实例ID
     */
    @Id
    @Column(name = "TZ_JCSL_ID")
    private Long tzJcslId;

    /**
     * 序号
     */
    @Id
    @Column(name = "TZ_RZ_LSH")
    private Long tzRzLsh;

    /**
     * 日志级别
     */
    @Column(name = "TZ_RZ_JB")
    private String tzRzJb;

    /**
     * 日期时间
     */
    @Column(name = "TZ_RZ_DTTM")
    private Date tzRzDttm;

    /**
     * 日志详细内容
     */
    @Column(name = "TZ_RZ_NR")
    private String tzRzNr;
}