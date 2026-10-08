package com.istad.ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Java-based configuration
// @Getter
// @Setter 
// @NoArgsConstructor
@AllArgsConstructor
@Getter 
public class User {

    private Integer id;
    private String name;

}