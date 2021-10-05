package com.shf.test;

import com.shf.entity.Book;
import com.shf.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }

    @Test
    public void testJdbcTemplate2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("1");
        book.setUsername("c++");
        book.setUstatus("b");
        bookService.update(book);
    }

    @Test
    public void testJdbcTemplate3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.delete("1");
    }

    @Test
    public void testJdbcTemplate4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        int count = bookService.findCount();
        System.out.println(count);
    }

    @Test
    public void testJdbcTemplate5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book b1 = bookService.findOne("1");
        System.out.println(b1);
    }

    @Test
    public void testJdbcTemplate6(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> all = bookService.findAll();
        System.out.println(all);
    }

    @Test
    public void testJdbcTemplate7(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        ArrayList<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"10","C#","a"};
        Object[] o2 = {"11","object-c","a"};
        Object[] o3 = {"12","php","a"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    @Test
    public void testJdbcTemplate8(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        ArrayList<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"C#NEW","a","10"};
        Object[] o2 = {"object-cNEW","a","11"};
        Object[] o3 = {"phpNEW","a","12"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    @Test
    public void testJdbcTemplate9(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        ArrayList<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"10"};
        Object[] o2 = {"11"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
