package com.shf.test;

import com.shf.aopano.User;
import com.shf.aopxml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopXml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean14.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.buy();
    }

    @Test
    public void testAopAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean13.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
