package com.shf.service;

import com.shf.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
//    注入Dao
    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        userDao.reduceMoney();
//        模拟异常
        int i = 10/0;
        userDao.addMoney();
    }
}
