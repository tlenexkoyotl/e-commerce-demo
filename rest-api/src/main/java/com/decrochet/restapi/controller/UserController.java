package com.decrochet.restapi.controller;

import com.decrochet.restapi.model.User;
import com.decrochet.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private  final UserService userService;

    @PostMapping
    public ResponseEntity save(@RequestBody User user) {
        User savedUser = userService.save(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}