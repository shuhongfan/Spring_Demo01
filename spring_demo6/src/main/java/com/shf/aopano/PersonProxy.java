package com.shf.aopano;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//多个增强类增强同一个方法  设置增强类优先级 @Order 数字越小 优先级越高
@Component
@Aspect
@Order(1)  // 增强类优先级 数字越小，优先级越高
public class PersonProxy {
    @Before(value = "execution(* com.shf.aopano.User.add(..))")
    public void afterReturning() {
        System.out.println("Person before....");
    }
}
