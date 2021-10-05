package com.shf.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect  // 生成代理对象
@Order(3) // 数字越小优先级越高
public class UserProxy {
//    相同切入点抽取
    @Pointcut(value = "execution(* com.shf.aopanno.User.add(..))")
    public void pointDemo(){}

//    前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before....");
    }

//  最终通知  方法后执行
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after....");
    }

//  后置通知（返回通知）  返回值之后执行
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

//    异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

//    环绕通知  add方法前后都执行
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前around....");
//        被增强方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后around....");
    }


}
