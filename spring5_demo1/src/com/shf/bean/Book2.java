package com.shf.bean;

import java.util.List;

public class Book2 {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
