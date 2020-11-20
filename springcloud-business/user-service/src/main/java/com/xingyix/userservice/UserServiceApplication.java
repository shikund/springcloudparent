package com.xingyix.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @Description: 创建 user 服务
* @Author: shikund
* @Date: 10:40 2020/11/19
* @return:
*/
@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
        System.out.println("User-service 启动成功！" );
    }

}
