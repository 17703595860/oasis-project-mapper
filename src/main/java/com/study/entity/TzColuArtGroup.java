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
@Table(name = "TZ_COLU_ART_GROUP")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzColuArtGroup {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 栏目内容,栏目内容ID
     */
    @Column(name = "COLU_ART_ID")
    private String coluArtId;

    /**
     * 群组,群组ID
     */
    @Column(name = "GROUP_ID")
    private String groupId;

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