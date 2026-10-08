package com.istad.ecommerce;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UserConfig {

    @Bean
    @Primary 
    @Qualifier("bean1")
    public User getUser1(){
        return new User(1, "Chipor");
    }

    @Bean
    @Qualifier("bean2")
    public User getUser2(){
        return new User(2, "Syjik");
    }
    
}