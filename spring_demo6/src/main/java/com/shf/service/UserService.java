package com.shf.service;

import com.shf.dao.UserDao;
import com.shf.dao.UserDaoImpl;

public class UserService {

//    创建UserDao类型属性 生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService add........");

//        创建UserDao对象
//        UserDao userDao = new UserDaoImpl();
        userDao.update();
    }
}
