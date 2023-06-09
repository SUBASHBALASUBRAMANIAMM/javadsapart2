package com.subash;

import org.springframework.stereotype.Component;

@Component
public class nurse implements staff{
    public void assist(){
        System.out.println("nurse is assisting");
    }
}
