package dev.felipeazsantos.ecom_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.felipeazsantos.ecom_app.entity.User;

@Service 
public class UserService {

    private List<User> userList = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> fetchAllUsers() {
        return userList;
    }

    public void addUser(User user) {
        user.setId(nextId++);
        userList.add(user);
    }
    
}
