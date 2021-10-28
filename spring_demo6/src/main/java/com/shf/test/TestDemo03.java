package com.shf.test;

import com.shf.aopano.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

public class TestDemo03 {
    //    函数式风格创建对象
    @Test
    public void testGenericApplicationContext(){
//        1.创建GenericApplicationContext
        GenericApplicationContext context = new GenericApplicationContext();
//        调用context的方法对象注册
        context.refresh();
//        函数式风格创建对象  交给spring进行管理
        context.registerBean(User.class,()->new User());
//        获取再spring注册的对象
        User user = (User) context.getBean("com.shf.aopano.User");
        System.out.println(user);
    }
}
