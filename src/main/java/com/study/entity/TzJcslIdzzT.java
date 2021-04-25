package com.study.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/25
*/
@Table(name = "TZ_JCSL_IDZZ_T")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzJcslIdzzT {
    /**
     * 机构ID
     */
    @Id
    @Column(name = "TZ_JG_ID")
    private String tzJgId;

    /**
     * 进程实例号种子
     */
    @Column(name = "TZ_JCSL_IDSEED")
    private Integer tzJcslIdseed;
}