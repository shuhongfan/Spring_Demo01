package com.shf.service;

import com.shf.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//<bean id="userService" class="XXXX"/>
//在注解里面value属性可省略不写
//默认值是类名称,首字母小写
//@Component(value = "userService")
//@Controller
//@Repository
@Service
public class UserService {
    @Value(value = "普通类型属性注入") // 普通类型属性注入
    private String name;

//    定义dao类型属性 不需要添加set方法  添加注入属性注解
    //@Autowired  // 根据属性 类型 进行自动装配
    //@Qualifier(value = "userDaoImpl1")  // 根据 名称 进行注入
//    @Resource  //根据类型注入
    @Resource(name = "userDaoImpl1")  // 根据名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add...."+name);
        userDao.add();
    }
}
