/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp;

import com.trai.springapp.service.GreetingService;
import com.trai.springapp.service.Impl.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author trai
 */
@Configuration
//@ComponentScan
public class AppConfig {
    
    @Bean
    public GreetingService getGreetingService(){
        return (new GreetingServiceImpl());
    }
}
