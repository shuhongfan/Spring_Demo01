package com.shf.aopanno;

import org.springframework.stereotype.Component;

@Component
public class User {
//    被增强类
    public void add(){
        System.out.println("add....");
    }
}
