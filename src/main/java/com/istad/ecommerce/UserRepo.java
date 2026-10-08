package com.istad.ecommerce;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository 
public class UserRepo {

    private final List<User> users = List.of(
        new User(1, "Koko1"),
        new User(2, "Koko2"),
        new User(3, "Koko3"),
        new User(4, "Koko4")
    );

    public List<User> getUsers() {
        return users;
    }
    
}
