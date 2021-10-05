package com.shf.test;

import com.shf.bean.*;
import com.shf.factoryBean.MyBean;
import com.shf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
//        1. 加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//        2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testadd2(){
//        1.加载sping配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
//        2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }

    @Test
    public void testCollection(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);

        stu.test();
    }

    @Test
    public void testCollection2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Book2 book = context.getBean("book", Book2.class);
        Book2 book2 = context.getBean("book", Book2.class);
        book.test();
        book2.test();

        System.out.println(book);
        System.out.println(book2);
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        Orders2 orders = context.getBean("orders", Orders2.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        context.close();
    }

    @Test
    public void test5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
        com.shf.autoWire.Emp emp = context.getBean("emp", com.shf.autoWire.Emp.class);
        System.out.println(emp);
    }
}
