package com.shf.service;

import com.shf.dao.UserDao;
import com.shf.dao.UserDaoImpl;


public class UserService {
//    创建userDao类属性,生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");

//     原始方式：   创建userDao对象
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.update();
    }
}
