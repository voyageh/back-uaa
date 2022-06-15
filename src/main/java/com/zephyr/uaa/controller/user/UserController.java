package com.zephyr.uaa.controller.user;

import com.zephyr.uaa.dto.ReturnResultDTO;
import com.zephyr.uaa.dto.request.base.CreateUserDTO;
import com.zephyr.uaa.dto.request.base.LoginDTO;
import com.zephyr.uaa.entity.base.User;
import com.zephyr.uaa.service.base.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Api(value = "user", tags = "用户管理")
@RestController
@RequestMapping("/api/user")
@Slf4j
@Validated
public class UserController {

    @Value("${server.port}")
    private String prot;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public String register(@RequestBody @Validated CreateUserDTO createUserDTO) {
        log.info("createUserDTO", createUserDTO);
        return "sssssss";
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ReturnResultDTO<?> login(@RequestBody @Validated LoginDTO loginDTO) {
        HashMap<String, Object> token = userService.login(loginDTO.getUserName(), loginDTO.getPassword());
        return new ReturnResultDTO("200",token);
    }

    @GetMapping("/hello")
    public String hello() {
        return this.prot;
    }
}
