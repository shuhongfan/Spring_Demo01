package com.shf.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration // 组件类
@ComponentScan(basePackages = "com.shf")  // 包扫描
@EnableTransactionManagement  // 开启事物
public class TxConfig {
//    创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test1?serverTimezone=GMT");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

//    创建JDBCTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
//        到ioc容器中根据类型找到DataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        注入DataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

//    创建事物管理器
    @Bean
    public DataSourceTransactionManager getTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
