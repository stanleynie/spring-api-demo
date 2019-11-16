package com.example.javaapidemo.controller;

import com.example.javaapidemo.entity.User;
import com.example.javaapidemo.service.UserService;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    UserService service;

    // @RequestMapping(path="/add", method=RequestMethod.POST)
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody User addUser (User user){
        return service.addUser(user);
    }

    // @RequestMapping(path="/{id}", method=RequestMethod.GET)
    @GetMapping(path="/{id}") // Map ONLY GET Requests
    public Optional<User> getUserInfo(@PathVariable int id){
        Optional<User> user = service.getUserInfo(id);
        return user;
    }

    // @RequestMapping(path="/list", method=RequestMethod.GET)
    @GetMapping(path="/list") // Map ONLY GET Requests
    public @ResponseBody Iterable<User> getUserList(){
        Iterable<User> userList = service.getUserList();
        return userList;
    }

    // @RequestMapping(path="/list", method=RequestMethod.GET)
    @PostMapping(path="/update") // Map ONLY POST Requests
    public @ResponseBody User updateUser(User user){
        return service.updateUser(user);
    }

    // @RequestMapping(path="/list", method=RequestMethod.GET)
    @GetMapping(path="/delete/{id}") // Map ONLY GET Requests
    public @ResponseBody String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
