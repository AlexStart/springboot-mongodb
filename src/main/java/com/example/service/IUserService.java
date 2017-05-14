package com.example.service;

import com.example.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Саша on 22.04.2017.
 */
public interface IUserService {

    public User createUser(User user);


    public void removeUser(String id);


    public User updateUser(User user);


    public User patchUser(User user);


    public List<User> findAllUser();


    public User findUser(String id);


    public List<User> findUserOlderThan(Integer age);
}
