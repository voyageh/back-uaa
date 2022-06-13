package com.zephyr.uaa.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zephyr.uaa.entity.base.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
