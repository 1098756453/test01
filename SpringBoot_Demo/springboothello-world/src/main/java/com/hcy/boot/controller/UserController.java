package com.hcy.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // http://localhost:8080/hello
    @RequestMapping(value = "/hello",name = "springMVC入门练习")
    public String hello() {
        return "springboot 你好!";
    }

    // http://localhost:8080/hello
    @RequestMapping(value = "/hello1",name = "springMVC入门练习")
    public String hello1() {

        return "springboot 热部署测试!!!";
    }
}
