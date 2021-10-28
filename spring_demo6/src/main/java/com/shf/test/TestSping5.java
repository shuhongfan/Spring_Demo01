package com.shf.test;

import com.shf.spring5.Book;
import com.shf.spring5.Orders;
import com.shf.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSping5 {
//    Bean管理
//    1. Spring创建对象
//    2. Spring 注入属性

//    Bean管理操作有两种方式
//    1. 基于XML配置文件方式
//    2.基于注解方式

    @Test
    public void testAdd(){
//        1 加载sping配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2. 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1(){
//        加载sping配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        获取配置创建的对象
        Book book = context.getBean("book", Book.class);
//        Book book = context.getBean("book1", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrder(){
//        加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
