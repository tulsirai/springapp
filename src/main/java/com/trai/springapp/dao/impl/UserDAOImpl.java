/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.dao.impl;

import com.trai.springapp.dao.UserDAO;
import com.trai.springapp.model.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tulasi
 */
@Repository
public class UserDAOImpl implements UserDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public UserDAOImpl(){
        
    }

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Session getSession(){
        return (sessionFactory.getCurrentSession());
    }

    @Override
    public User saveOrUpdate(User user) {
        getSession().saveOrUpdate(user);
        return (user);
    }

    @Override
    public List<User> list() {
        return (getSession().createCriteria(User.class)
                            .setResultTransformer((Criteria.DISTINCT_ROOT_ENTITY)).list());
    }

    @Override
    public void delete(User user) {
        getSession().delete(user);
    }
}
