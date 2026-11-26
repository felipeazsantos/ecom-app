package dev.felipeazsantos.ecom_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.felipeazsantos.ecom_app.entity.User;

@Service 
public class UserService {

    private List<User> userList = new ArrayList<>();

    public List<User> fetchAllUsers() {
        return userList;
    }

    public List<User> addUser(User user) {
        userList.add(user);
        return userList;
    }
    
}
