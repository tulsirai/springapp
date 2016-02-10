/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.config;

import com.trai.springapp.service.GreetingService;
import com.trai.springapp.service.Impl.GreetingServiceImpl;
import com.trai.springapp.service.Impl.UserServiceImpl;
import com.trai.springapp.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Tulasi
 */
@Configuration
public class ServiceConfig {

    @Bean
    public GreetingService getGreetingService() {
        return (new GreetingServiceImpl());
    }

    @Bean
    public UserService getUserService() {
        return (new UserServiceImpl());
    }
}
