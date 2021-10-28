package com.shf.test;

import com.shf.bean.Emp;
import com.shf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//        获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
//        获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean3(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
//        获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
