package com.example.spring.restapi.controller;

import com.example.spring.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.example.spring.restapi.model.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService uService;

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails(){
        return appName+" - "+appVersion;
    }


    @GetMapping("/users")
    public List<User> getUser(){
        return uService.getUsers();
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable("id")Long id){
        return "User details for the id "+id;
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody User user){
    return "Saving the users data for the database "+user;
    }
     @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
         System.out.println("Upadating user data for the id "+id);
    return user;
    }

    @DeleteMapping("/users")
    public String deleteUser(@RequestParam("id") Long id){
        return "Deleting user details for id "+id;
    }


}
