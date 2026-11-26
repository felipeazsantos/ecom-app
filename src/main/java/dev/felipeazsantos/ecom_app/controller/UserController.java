package dev.felipeazsantos.ecom_app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.felipeazsantos.ecom_app.entity.User;


@RestController 
@RequestMapping("/api/users")
public class UserController {

    private List<User> userList = new ArrayList<>(){{
        add(new User(1L, "Felipe", "Azevedo"));
    }};
    
    @GetMapping 
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userList);
    }

    @PostMapping 
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userList.add(user);
        return ResponseEntity.ok(userList);
    }
}
