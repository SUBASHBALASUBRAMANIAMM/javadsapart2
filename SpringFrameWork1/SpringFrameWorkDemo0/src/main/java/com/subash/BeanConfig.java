package com.subash;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.subash")
public class BeanConfig {
    @Bean
    @Scope("prototype")
    public doctor f(){
        return new doctor();
    }

}
