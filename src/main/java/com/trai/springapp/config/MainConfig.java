/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.config;

import javax.inject.Inject;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 *
 * @author Tulasi
 */
@Configuration
@Import(value = { DataSourceConfig.class, 
                  InfractructureConfig.class, 
                  DAOConfig.class,
                  ServiceConfig.class} )
public class MainConfig {
    
    @Inject
    private Environment env;
        
}
