package com.zephyr.uaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.zephyr")//扫描路径,把符合扫描规则的类装配到spring容器中
@MapperScan("com.zephyr.uaa.mapper")
public class BackUaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackUaaApplication.class, args);
    }

}
