package com.study.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* Created by Mybatis Generator 2021/04/23
*/
@Table(name = "TZ_USER_LOG")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TzUserLog {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "PERSON_ID")
    private String personId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 凭证类型,token,密码,验证码,第三方token等
     */
    @Column(name = "CREDENTIALS_TYPE")
    private String credentialsType;

    /**
     * 动作类型,登陆成功,登陆失败,登出成功,登出失败 ,修改帐户信息
     */
    @Column(name = "COMMAND")
    private String command;

    /**
     * 操作IP
     */
    @Column(name = "IP")
    private String ip;

    /**
     * 修改记录号
     */
    @Column(name = "MODIFICATION_NUM")
    private Integer modificationNum;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    @Column(name = "LAST_UPD")
    private Date lastUpd;
}