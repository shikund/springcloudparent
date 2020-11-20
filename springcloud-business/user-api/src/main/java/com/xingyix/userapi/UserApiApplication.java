package com.xingyix.userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Description: 创建user api
* @Author: shikund
* @Date: 10:38 2020/11/19
* @return:
*/
@SpringBootApplication
public class UserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
        System.out.println("User-Api 启动成功！" );
    }

}
