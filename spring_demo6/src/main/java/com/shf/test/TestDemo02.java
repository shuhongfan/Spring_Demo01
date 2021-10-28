package com.shf.test;

import com.shf.config.SpringConfig;
import com.shf.service.UserServiceAnnotation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo02 {


    @Test
    public void testService2(){
//        加载配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        获取bean创建的对象
        UserServiceAnnotation userService = context.getBean("userService", UserServiceAnnotation.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService(){
//        加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
//        获取bean创建的对象
        UserServiceAnnotation userService = context.getBean("userService", UserServiceAnnotation.class);
        System.out.println(userService);
        userService.add();
    }
}
