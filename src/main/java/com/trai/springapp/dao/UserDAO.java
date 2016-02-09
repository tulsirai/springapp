/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.dao;

import com.trai.springapp.model.User;
import java.util.List;

/**
 *
 * @author Tulasi
 */
public interface UserDAO {
    
    User saveOrUpdate(User user);
    
    List<User> list();
    
    void delete(User user);
}
