/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp;

import com.trai.springapp.service.GreetingService;
import com.trai.springapp.service.Impl.GreetingServiceImpl;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 *
 * @author trai
 */
@Configuration
@Import(value = { DataSourceConfig.class,
                  PersistenceConfig.class})
public class AppConfig {
    
    @Inject
    private Environment env;
        
    @PostConstruct
    public void initAppConfig(){
        System.out.println("Looking for Spring profiles...");
        for(String profile : env.getActiveProfiles()){
            System.out.println("Detected Spring profile:" + profile);
        }
    }
    @Bean
    public GreetingService getGreetingService(){
        return (new GreetingServiceImpl());
    }
}
