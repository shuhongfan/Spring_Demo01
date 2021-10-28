package com.shf.spring5;

public class User {
//    注入属性
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.println("add........");
    }
}
