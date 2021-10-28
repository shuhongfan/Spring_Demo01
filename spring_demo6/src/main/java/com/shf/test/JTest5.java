package com.shf.test;

import com.shf.service.AccountService;
import com.shf.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean15.xml")
@SpringJUnitConfig(locations = "classpath:bean15.xml")  // 替代上面2个注解
public class JTest5 {
    @Autowired
    private AccountService accountService;

    @Test
    public void test1(){
        accountService.accountMoney();
    }
}
