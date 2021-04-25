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
@Table(name = "TZ_TRANSFORM_LNG")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzTransformLng {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 语言
     */
    @Column(name = "LANGUAGE")
    private String language;

    /**
     * 转换值集合ID
     */
    @Column(name = "COLLECTION_ID")
    private String collectionId;

    /**
     * 转换值value
     */
    @Column(name = "TRANSFORM_VALUE")
    private String transformValue;

    /**
     * 转换值label
     */
    @Column(name = "TRANSFORM_LABEL")
    private String transformLabel;

    /**
     * 转换值长label
     */
    @Column(name = "TRANSFORM_LONG_LABEL")
    private String transformLongLabel;

    /**
     * 生效标志
     */
    @Column(name = "ACTIVE_FLG")
    private String activeFlg;

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