package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/06/03
*/
@Table(name = "TZ_CLASSROOM")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzClassroom {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 教室序号
     */
    @Column(name = "ADDR_NO")
    private String addrNo;

    /**
     * 教室名称
     */
    @Column(name = "ADDR_NAME")
    private String addrName;

    /**
     * 座位图编号
     */
    @Column(name = "SEAT_MAP_ID")
    private String seatMapId;

    /**
     * 是否启用，Y启用，N不启用
     */
    @Column(name = "AVAILABLE")
    private String available;

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
     * 备注
     */
    @Column(name = "ADDR_DESC")
    private String addrDesc;
}