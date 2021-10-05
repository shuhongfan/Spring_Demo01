package com.shf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.shf" }) // 组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) // 生成代理对象
public class ConfigAop {
}
