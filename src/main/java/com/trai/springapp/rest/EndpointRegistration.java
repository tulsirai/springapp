/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 *
 * @author trai
 */
public class EndpointRegistration extends ResourceConfig{
    
    public EndpointRegistration(){
        register(RequestContextFilter.class);
        register(JerseyResource.class);
    }
}
