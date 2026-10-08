package com.istad.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@RestController 
// @RequiredArgsConstructor 
public class HelloWorldController {

    // setter-based injection
    @Autowired 
    @Qualifier("bean2")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    // private final UserRepo userRepo;

    // @GetMapping
    // public List<User> getUsers() {
    //     return userRepo.getUsers();
    // }

    @GetMapping("/greet")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/numbers")
    public List<Integer> getNums() {
        return List.of(1,2,3,4,5,6,7,8,9,10);
    }

    // @GetMapping("/get-user")
    // public Map<String, Object> getUser(){

    //     Map<String, Object> user = new HashMap<>();

    //     user.put("id", 1);
    //     user.put("name", "messi");
    //     user.put("height", 1.70);
    //     user.put("children", List.of("mateo", "thiago", "ciro"));
    //     return user;
    // } 

    @GetMapping("/get-user")
    public User getUser(){
        return user;
    } 
}
