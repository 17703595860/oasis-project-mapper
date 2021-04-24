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
@Table(name = "TZ_COLU_ART")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzColuArt {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构编号,站点表外键
     */
    @Column(name = "SITE_ID")
    private String siteId;

    /**
     * 栏目编号,栏目表外键
     */
    @Column(name = "COLU_ID")
    private String coluId;

    /**
     * 内容ID,内容表外键
     */
    @Column(name = "ART_ID")
    private String artId;

    /**
     * 内容最新的发布时间
     */
    @Column(name = "ART_PUB_DT")
    private Date artPubDt;

    /**
     * 发布状态,Y:已经发布N：未发布
     */
    @Column(name = "ART_PUB_STATE")
    private String artPubState;

    /**
     * 文章动态URL
     */
    @Column(name = "ART_URL")
    private String artUrl;

    /**
     * 文章静态URL,如果发布成静态的HTML
     */
    @Column(name = "STATIC_ART_URL")
    private String staticArtUrl;

    /**
     * 本栏目文章顺序
     */
    @Column(name = "ART_SEQ")
    private Integer artSeq;

    /**
     * 置顶顺序,每次置顶次序+1
     */
    @Column(name = "MAX_ZD_SEQ")
    private Integer maxZdSeq;

    /**
     * 内容发布者,用户ID
     */
    @Column(name = "PUBLISHER")
    private String publisher;

    /**
     * 发布部门,部门ID
     */
    @Column(name = "PUB_DEP")
    private String pubDep;

    /**
     * 是否静态化,A:静态化B:不静态化
如果有访问限制，只能是B
如果是A那么才有STATIC_NAME输入框
     */
    @Column(name = "STATIC_FLAG")
    private Integer staticFlag;

    /**
     * 访问限制,A:无限制B:指定群组
     */
    @Column(name = "PROJECT_LIMIT")
    private String projectLimit;

    /**
     * 文章生成静态文件名自定义
     */
    @Column(name = "STATIC_NAME")
    private String staticName;

    /**
     * 文章生成静态文件名自动
     */
    @Column(name = "STATIC_AOTO_NAME")
    private String staticAotoName;

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

    /**
     * 文章HTML代码
     */
    @Column(name = "ART_HTML")
    private String artHtml;

    /**
     * 文章手机HTML代码
     */
    @Column(name = "ART_PHONE_HTML")
    private String artPhoneHtml;

    /**
     * 文章发布HTML代码
     */
    @Column(name = "ART_CONENT_SCR")
    private String artConentScr;

    /**
     * 文章发布手机HTML代码
     */
    @Column(name = "ART_PHONE_CONENT_SCR")
    private String artPhoneConentScr;
}