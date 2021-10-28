package com.shf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//作为配置类 替代XML配置文件
@Configuration
@ComponentScan(basePackages = {"com.shf"})
public class SpringConfig {
}
