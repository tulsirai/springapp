/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service.Impl;

import com.trai.springapp.dao.UserDAO;
import com.trai.springapp.model.User;
import com.trai.springapp.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tulasi
 */
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDAO userDao;
    
    @Override
    public User saveOrUpdate(User user) {
        return(userDao.saveOrUpdate(user));
    }

    @Override
    public List<User> list() {
        return (userDao.list());
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User getUserById(Integer id) {
        return (userDao.getUserById(id));
    }
    
}
