/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service.Impl;

import com.trai.springapp.service.GreetingService;

/**
 *
 * @author trai
 */
public class GreetingServiceImpl implements GreetingService{
    
    @Override
    public String greet(String who){
        return (String.format("Hello, %s!", who));
    }
}
