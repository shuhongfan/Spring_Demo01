package com.shf.test;

import com.shf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

public class TestUser {
    @Nullable
    private String bookName;

    @Test
    public void testAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.accountMoney();
    }

    @Test
    public void testAccount2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.accountMoney();
    }

//    函数式风格创建对象 交给sping进行管理
    @Test
    public void testGeneriaApplicationContext(){
//        1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
//        2.调用context的返回对象注册
        context.refresh();
        context.registerBean(User.class,()->new User());
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
