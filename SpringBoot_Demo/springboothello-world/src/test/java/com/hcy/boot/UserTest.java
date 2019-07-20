package com.hcy.boot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest // 开启springboot测试环境
@RunWith(SpringRunner.class) // 单元测试由spring来实现执行
public class UserTest {

    @Autowired// 自动注入
    private ApplicationContext context; //spring容器对象

    @Test
    public void test() {
        System.out.println(context.getBean(ObjectMapper.class)); //从spring容器中取出ObjectMapper实例
    }

}
