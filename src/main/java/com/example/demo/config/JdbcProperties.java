//package com.example.demo.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@ConfigurationProperties
//@Component
//public class JdbcProperties {
//    private String jdbcDriverClassName ;
//    private String jdbcUrl;
//    private String username;
//    private String password;
//
//    public String getJdbcDriverClassName() {
//        return jdbcDriverClassName;
//    }
//
//    public void setJdbcDriverClassName(String jdbcDriverClassName) {
//        this.jdbcDriverClassName = jdbcDriverClassName;
//    }
//
//    public String getJdbcUrl() {
//        return jdbcUrl;
//    }
//
//    public void setJdbcUrl(String jdbcUrl) {
//        this.jdbcUrl = jdbcUrl;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Bean
//    public DruidDataSource getDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(this.jdbcDriverClassName);
//        dataSource.setUrl(this.jdbcUrl);
//        dataSource.setUsername(this.username);
//        dataSource.setPassword(this.password);
//        return dataSource;
//    }
//
//}
