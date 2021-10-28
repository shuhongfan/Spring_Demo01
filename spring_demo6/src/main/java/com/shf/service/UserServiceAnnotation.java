package com.shf.service;

import com.shf.dao.UserDaoAnnotation;
import com.shf.dao.UserDaoAnnotationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//创建类,在类上面添加创建对象注解
//注解里面value属性值可以忽略不写
//默认值是类名称,首字母小写
//UserService ---  userService
@Service(value = "userService")
public class UserServiceAnnotation {
//    定义Dao类型属性
//    不需要添加set方法
//    添加注入属性注解
//    @Autowired根据类型自动注入
//    @Qualifier根据名称自动注入 要和Autowire一起使用
//    @Autowired
//    @Qualifier(value = "userDao")
//    private UserDaoAnnotation userDao;

//    @Resource  根据类型进行注入
//    @Resource(name = "userDao")  根据名称自动注入
    @Resource(name = "userDao")
    private UserDaoAnnotation userDao;

    @Value(value = "ABC")
    public String name;

    public void add(){
        userDao.add();
        System.out.println("service add.....");
        System.out.println(name);
    }
}
