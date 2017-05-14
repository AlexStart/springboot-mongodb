package com.example.controller;

import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Саша on 22.04.2017.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    public UserController(){

    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String removeUser(@PathVariable String id){
        userService.removeUser(id);
        return "SUCCESS";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public User patchUser(@RequestBody User user){
        return userService.patchUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable String id){
        return userService.findUser(id);
    }

    @RequestMapping(value="/age/{age}",method = RequestMethod.GET)
    public List<User> findUserOlderThan(@PathVariable Integer age){
        return userService.findUserOlderThan(age);
    }
}
