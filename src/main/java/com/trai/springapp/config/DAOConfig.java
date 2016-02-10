/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.config;

import com.trai.springapp.dao.UserDAO;
import com.trai.springapp.dao.impl.UserDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Tulasi
 */
@Configuration
public class DAOConfig {

    @Bean
    public UserDAO getUserDAO() {
        return (new UserDAOImpl());
    }
}
