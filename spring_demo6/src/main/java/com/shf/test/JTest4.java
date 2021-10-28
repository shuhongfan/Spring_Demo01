package com.shf.test;

import com.shf.service.AccountService;
import com.shf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // 单元测试框架
@ContextConfiguration("classpath:bean15.xml") // 加载配合文件
public class JTest4 {
    @Autowired
    private AccountService accountService;

    @Test
    public void test1(){
        accountService.accountMoney();
    }
}
