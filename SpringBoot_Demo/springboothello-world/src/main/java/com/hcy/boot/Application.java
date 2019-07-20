package com.hcy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //标记此类是springboot项目的启动引导类
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);//springboot 项目启动入口
    }
}
