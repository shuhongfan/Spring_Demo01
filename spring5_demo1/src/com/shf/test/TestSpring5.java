package com.shf.test;

import com.shf.bean.Book;
import com.shf.bean.Orders;
import com.shf.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testSpring5(){
//        1.加载spring配置文件  创建对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

    @Test
    public void TestBooks(){
//        1.加之前spring配置文件 创建对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);

    }

    @Test
    public void TestOrders(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);
    }
}
