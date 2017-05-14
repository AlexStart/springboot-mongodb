package com.example;

import com.example.controller.UserController;
import com.example.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Саша on 09.05.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Before
    public void setUp() {}

    @Test
    public void createUserTest() {
        User user = new User();
        user.setName("Alex");
        user.setAge(25);

        User userResult = userController.createUser(user);

        System.out.println("###### User ID is " + userResult != null ? "Not Null" : "Null");
        System.out.println("###### User's ID is " + userResult.getId());
    }

    @Test
    public void findUserTest() {

    }

    @After
    public void tearDown() {}

}
