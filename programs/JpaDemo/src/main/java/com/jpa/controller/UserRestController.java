package com.jpa.controller;

import com.jpa.entity.Users;
import com.jpa.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserDAOService userService;

    @RequestMapping("/add")
    public String addUser(){
        long id  = userService.insert(new Users(7, "ajay", "user"));
        System.out.println(id);
        return "User Created successfully with id "+id;
    }
}
