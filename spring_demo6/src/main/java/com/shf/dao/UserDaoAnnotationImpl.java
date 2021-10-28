package com.shf.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoAnnotationImpl implements UserDaoAnnotation{
    @Override
    public void add(){
        System.out.println("dao add....");
    }
}
