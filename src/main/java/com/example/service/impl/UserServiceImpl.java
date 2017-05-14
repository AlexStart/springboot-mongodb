package com.example.service.impl;

import com.example.model.User;
import com.example.repository.IUserRepository;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 22.04.2017.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }


    public void removeUser(String id) {
        userRepository.delete(id);
    }


    public User updateUser(User user){
        return new User();
    }


    public User patchUser(User user){
        return new User();
    }


    public List<User> findAllUser(){
        return new ArrayList<User>();
    }


    public User findUser(String id){
        User user = new User();
        user.setName("Alex");
        user.setAge(30);
        createUser(user);
        return userRepository.findOne(user.getId());
    }


    public List<User> findUserOlderThan(Integer age){
        return new ArrayList<User>();
    }

}
