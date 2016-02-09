/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service;

import com.trai.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Tulasi
 */

public class ServiceIntegrationTest {
    
    @Autowired
    private UserService userService;
    
    public void saveUserTest(){
        User user = new User();
        user.setUsername("noah");
        user.setPassword("noah123");
        user.setEmail("noahrai@gmail.com");
        userService.saveOrUpdate(user);
    }
}
