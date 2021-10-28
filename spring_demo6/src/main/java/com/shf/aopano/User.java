package com.shf.aopano;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class User {
    public void add(){
//        int i = 10/0;
        System.out.println("add.....");
    }
}
