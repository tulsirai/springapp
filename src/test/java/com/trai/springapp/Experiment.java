/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tulasi
 */
public class Experiment {
    
    public static void main(String []args){
        Map<String, String> values = new HashMap<>();
        values.put("A", "Hello");
        values.put("B", "World");
        String value = "";
        
     
        Set<String> keys = values.keySet();   
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            value += " " + values.get(iter.next());
        }
        
        
        values.forEach((k, v) ->{           
            System.out.println(v);
        });
       
    }
}
