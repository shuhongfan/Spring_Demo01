package com.shf.factorybean;

import com.shf.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

//    定义返回Bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("ABC");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
