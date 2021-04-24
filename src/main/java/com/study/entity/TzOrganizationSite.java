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
@Table(name = "TZ_ORGANIZATION_SITE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzOrganizationSite {
    /**
     * 主键,雪花算法
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 机构编号
     */
    @Column(name = "ORGANIZATION_CODE")
    private String organizationCode;

    /**
     * 站点名称,唯一键
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 站点别名,英文字母
     */
    @Column(name = "SITE_NAME")
    private String siteName;

    /**
     * 站点类型,A:功能站点B：CMS站点所谓功能站点就是比如教务系统学生端这类的功能性站点，CMS站点，就是门户网站这类的类容展示站点
     */
    @Column(name = "SITE_TYPE")
    private String siteType;

    /**
     * 站点说明
     */
    @Column(name = "SITE_DESC")
    private String siteDesc;

    /**
     * 是否启用,Y：启用N：不启用
     */
    @Column(name = "SITE_ENABLE")
    private String siteEnable;

    /**
     * 站点路径
     */
    @Column(name = "SITE_PATH")
    private String sitePath;

    /**
     * 发布状态,Y：发布N：未发布
     */
    @Column(name = "SITE_ISSUE")
    private String siteIssue;

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
     * 站点样式,用于配置页面样式
     */
    @Column(name = "SITE_CSS")
    private String siteCss;

    /**
     * 站点手机端样式,用于配置手机页面样式
     */
    @Column(name = "SITE_PHONE_CSS")
    private String sitePhoneCss;
}