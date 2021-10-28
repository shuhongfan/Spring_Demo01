package com.shf.service;

import com.shf.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(propagation = Propagation.REQUIRED)  // 添加事物注解（可以在类或方法上）
//propagation 事物的传播行为
        //REQUIRED  REQUIRES_NEW
//ioslation 事物隔离级别  脏读、不可重复读、虚读
//        脏读： 一个未提交事物读取到另一个未提交事物的数据
//        不可重复读：  一个未提交事物读取到另一个提交事物修改的数据
//        虚读：  一个提交事物读取到另一个事物添加数据
//timeout 超时时间  事物需要在一定时间内进行提交，如果不提交就进行回滚
//readOnly() 是否只读  只能做查，不能增删改
//rollbackFor回滚
//noRollbackFor 不会滚
public class AccountService {
//    注入dao
    @Autowired
    private AccountDao accountDao;

    public void accountMoney(){
//        try {
//            第一部 开启事物
//            第二步进行业务操作
//            第三步 没有发生异常  提交事物
//        } catch (Exception e) {
//            第四步 回滚事务
//        }


//        lucy少100
        accountDao.reduceMoney();

//        模拟异常
        int i=10/0;

//        mary多100
        accountDao.addMoney();
    }
}
