package com.shf.test;

import com.shf.config.TxConfig;
import com.shf.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void testAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean15.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

//    完全注解开发  声明式事务管理
    @Test
    public void testAccount2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }
}
