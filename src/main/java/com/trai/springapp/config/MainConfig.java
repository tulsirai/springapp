/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.config;

import com.trai.springapp.dao.UserDAO;
import com.trai.springapp.dao.impl.UserDAOImpl;
import com.trai.springapp.service.GreetingService;
import com.trai.springapp.service.Impl.GreetingServiceImpl;
import com.trai.springapp.service.Impl.UserServiceImpl;
import com.trai.springapp.service.UserService;
import javax.inject.Inject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 *
 * @author Tulasi
 */
@Configuration
@Import(value = { DataSourceConfig.class, InfractructureConfig.class} )
public class MainConfig {
    
    @Inject
    private Environment env;
    
    @Bean
    public GreetingService getGreetingService(){
        return (new GreetingServiceImpl());
    }
    
    @Bean
    public UserService getUserService(){
        return (new UserServiceImpl());
    }
    
    @Bean
    public  UserDAO getUserDAO(){
        return (new UserDAOImpl());
    }
}
