package com.chips.it.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表 实体类。
 *
 * @author renxingwei
 * @since 2023-10-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "t_user")
public class User implements Serializable {

    /**
     * 主键
     */
    @Id
    private String uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 个人简介
     */
    private String summary;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * qq号
     */
    private String qq;

    /**
     * 微信号
     */
    private String weChat;

    /**
     * 头衔
     */
    private String rank;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 角色uid
     */
    private String roleId;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 最后登录ip
     */
    private String lastLoginIp;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
