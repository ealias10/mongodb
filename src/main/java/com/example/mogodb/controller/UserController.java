package com.example.mogodb.controller;

import com.example.mogodb.request.UserRequest;
import com.example.mogodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/create")
    public Object createUser(@RequestBody(required = true)UserRequest request)
    {
        return userService.createUser(request);
    }

    @GetMapping("/userbyname")
    public Object userByName(@RequestBody(required = true)UserRequest request)
    {
        return userService.userByName(request);
    }

}
