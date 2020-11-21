package com.xingyix.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

<<<<<<< HEAD
/**
* @Description: 创建 eureka 服务
* @Author: shikund
* @Date: 10:39 2020/11/19
* @return:
*/
=======
>>>>>>> 6cef41841392685a32698ca62f6554d5060b5b2d
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println("Eureka 启动成功！" );
    }

}
