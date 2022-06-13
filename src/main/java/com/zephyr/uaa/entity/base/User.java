package com.zephyr.uaa.entity.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zephyr.uaa.entity.BaseEntity;

@TableName("basic_user")
public class User extends BaseEntity {
    @TableField("userName")
    private String userName;
    private String password;
    private String tel;
    private String email;
}
