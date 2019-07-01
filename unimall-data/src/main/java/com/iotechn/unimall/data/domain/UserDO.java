package com.iotechn.unimall.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created by rize on 2019/6/30.
 */
@Data
@TableName("unimall_user")
public class UserDO extends SuperDO {

    private String phone;

    private String password;

    private String openId;

    private String nickname;

    @TableField("avatar_url")
    private String avatarUrl;

    private String level;

    private Date birthday;

    private Integer gender;

    @TableField("gmt_last_login")
    private Date gmtLastLogin;

    @TableField("last_login_ip")
    private String lastLoginIp;

    private Integer status;

}