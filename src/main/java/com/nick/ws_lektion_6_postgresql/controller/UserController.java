package com.nick.ws_lektion_6_postgresql.controller;

import com.nick.ws_lektion_6_postgresql.model.User;
import com.nick.ws_lektion_6_postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {

        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {

        return ResponseEntity
                .status(201)
                .body(userRepository.save(user));
    }

}
