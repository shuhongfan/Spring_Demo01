package com.shf.aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect  // 生成代理对象
@Order(3)
public class UserProxy {
//    相同切入点抽取
    @Pointcut(value = "execution(* com.shf.aopano.User.add(..))")
    public void pointDemo(){

    }

//    前置通知
//    @Before注解表示作为前置注解
//    @Before(value = "execution(* com.shf.aopano.User.add(..))")
    @Before(value = "pointDemo())")
    public void before(){
        System.out.println("before...");
    }

//    最终通知
    @After(value = "execution(* com.shf.aopano.User.add(..))")
    public void after() {
        System.out.println("after...");
    }

//    后置通知 返回通知
    @AfterReturning(value = "execution(* com.shf.aopano.User.add(..))")
    public void AfterReturning() {
        System.out.println("AfterReturning...");
    }

//    异常通知
    @AfterThrowing(value = "execution(* com.shf.aopano.User.add(..))")
    public void AfterThrowing() {
        System.out.println("AfterThrowing...");
    }

//    环绕通知   方法之前和之后都执行
    @Around(value = "execution(* com.shf.aopano.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around环绕之前...");
//        被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("Around环绕之后...");
    }

}
