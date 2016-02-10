/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service;

import com.trai.springapp.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tulasi
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = MainConfig.class)
//@Transactional
public class ServiceIntegrationTest {
    
    @Autowired
    private UserService userService;
    
//    @Test
    public void saveUserTest(){
//        User user = new User();
//        user.setUsername("test");
//        user.setPassword("test");
//        user.setEmail("bhukulu@gmail.com");
//        userService.saveOrUpdate(user);
//        Assert.assertNotNull(user.getId());
//        Integer id = user.getId();
//        System.out.println("ID - " + id);
        User u = userService.getUserById(12);
        Assert.assertEquals("noah",u.getUsername());
    }
}
