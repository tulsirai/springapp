/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.resource;

import com.trai.springapp.service.GreetingService;
import java.util.Date;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author trai
 */
@Path("hello")
public class JerseyResource {
    
    @Inject
    private GreetingService greetingService;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(){
        return (String.format("%s:, %S", new Date(), greetingService.greet("World")));
    }
}
