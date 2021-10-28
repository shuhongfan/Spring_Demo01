package com.shf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启组件扫描
@ComponentScan(basePackages = {"com.shf"})
//生成Aspectj对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
