package com.shf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 作为配置类，代替xml配置文件
@ComponentScan(basePackages = {"com.shf" })  // 扫描位置
public class SpringConfig {
}
