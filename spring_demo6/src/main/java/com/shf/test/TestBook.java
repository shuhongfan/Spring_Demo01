package com.shf.test;

import com.shf.aopano.User;
import com.shf.entity.Book;
import com.shf.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJDBCTemplate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean15.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        bookService.addBook(new Book("15","java","a"));

//        bookService.updateBook(new Book("15","java++++","a++++"));

//        bookService.deleteBook("15");

//        int count = bookService.selectCount();
//        System.out.println(count);

//        Book oneBook = bookService.findOneBook("1");
//        System.out.println(oneBook);

//        List<Book> allBooks = bookService.findAllBooks();
//        System.out.println(allBooks);

//        ArrayList<Object[]> objects = new ArrayList<>();
//        Object[] o1= {"123","java","B"};
//        Object[] o2= {"124","c#","B"};
//        Object[] o3= {"133","php","B"};
//        objects.add(o1);
//        objects.add(o2);
//        objects.add(o3);
//        bookService.batchAddBooks(objects);

//        ArrayList<Object[]> objects = new ArrayList<>();
//        Object[] o1= {"java123","B+","123"};
//        Object[] o2= {"c#124","B+","124"};
//        Object[] o3= {"php133","B+","133"};
//        objects.add(o1);
//        objects.add(o2);
//        objects.add(o3);
//        bookService.batchUpdateBooks(objects);

        ArrayList<Object[]> objects = new ArrayList<>();
        Object[] o1= {"123"};
        Object[] o2= {"124"};
        Object[] o3= {"133"};
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        bookService.batchDeleteBooks(objects);
    }
}
