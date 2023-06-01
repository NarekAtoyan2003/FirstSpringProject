package com.digi.config;

import com.digi.service.UserService;
import com.digi.service.UserServiceImpl;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.tomcat")
    public DataSource getDataSource(){
        return new DataSource();
    }


    //creating a bean manually
//    @Bean
//    public UserService getUserService(){
//        return new UserServiceImpl();
//    }
}
