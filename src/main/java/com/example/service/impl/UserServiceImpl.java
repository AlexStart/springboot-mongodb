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
        return userRepository.save(user);
    }


    public User patchUser(User user){
        return userRepository.save(user);
    }


    public List<User> findAllUser(){
        return userRepository.findAll();
    }


    public User findUser(String id){

        User foundUser = userRepository.findOne(id);

        if(foundUser == null) {
            User user = new User();
            user.setName("***Alex-Test***");
            user.setAge(30);
            foundUser = createUser(user);
        }
        return foundUser;
    }


    public List<User> findUserOlderThan(Integer age){
        return userRepository.findUserOlderThan(age);
    }

}
