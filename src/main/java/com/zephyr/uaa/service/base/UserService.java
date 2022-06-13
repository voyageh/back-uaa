package com.zephyr.uaa.service.base;

import com.zephyr.uaa.entity.base.User;
import com.zephyr.uaa.mapper.base.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    protected UserMapper userMapper;

    public User login(String id) {
        return userMapper.selectById(id);
    }

}
