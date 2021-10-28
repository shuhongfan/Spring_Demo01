package com.shf.test;

import com.shf.autowire.Emp;
import com.shf.bean.Orders;
import com.shf.collectiontype.Book;
import com.shf.collectiontype.Course;
import com.shf.collectiontype.Stu;
import com.shf.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {
    @Test
    public void test6(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
//        获取bean创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test5(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
//        获取bean创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建的bean实例对象");
        System.out.println(orders);

//        手动销毁bean实例
        context.close();
    }

    @Test
    public void test4(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
//        获取bean创建的对象
        Course myBean1 = context.getBean("myBean", Course.class);
        Course myBean2 = context.getBean("myBean", Course.class);
        System.out.println(myBean1);
        System.out.println(myBean2);
    }

    @Test
    public void test3(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
//        获取配置文件创建的对象
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void testCollection2(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
//        获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testCollection(){
//        加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
//        获取配置文件创建对象
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
        stu.test();
    }
}
