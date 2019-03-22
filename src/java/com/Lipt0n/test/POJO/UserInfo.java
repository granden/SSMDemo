package com.Lipt0n.test.POJO;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(appliesTo = "UserInfo", comment = "用户信息表")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition="varchar(20) COMMENT '用户id'")
    private String userId;

    @Column(columnDefinition="varchar(20) COMMENT '用户名'")
    private String username;

    @Column(columnDefinition="int COMMENT '性别'")
    private boolean sex;

    @Column(columnDefinition="varchar(50) COMMENT '密码'")
    private String password;

    @Column(columnDefinition="timestamp default CURRENT_TIMESTAMP COMMENT '创建账号日期'")
    private Date createDate;

    @Column(columnDefinition="int COMMENT '部门id'")//关联DeptInfo表
    private int deptId;

    @Column(columnDefinition="varchar(50) COMMENT '邮箱地址'")
    private String email;

    @Column(columnDefinition="varchar(20) COMMENT '手机号码'")
    private int phoneNumber;

    @Column(columnDefinition="date COMMENT '出身年月'")
    private Date birthday;

    @Column(columnDefinition="int COMMENT '角色id'")
    private int roleId;

    @Column(columnDefinition="varchar(100) COMMENT '头像地址'")
    private String headImgUrl;

    @Column(columnDefinition="int COMMENT '账号状态码'")
    private int stateCode;

    @Column(columnDefinition = "decimal COMMENT '直属领导id'")
    private long leaderId;

    @Column(columnDefinition = "decimal COMMENT '更新人id'")
    private long lastUpdater;

    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间'")
    private Date updateDate;

    @Column(columnDefinition="varchar(20) COMMENT '职位id'")
    private int titleId;




}
