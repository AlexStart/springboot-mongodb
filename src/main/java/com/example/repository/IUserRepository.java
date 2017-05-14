package com.example.repository;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Саша on 28.04.2017.
 */
public interface IUserRepository extends MongoRepository<User, String> {

    @Query("{'age' : {$gt : ?0}}")
    List<User> findUserOlderThan(Integer age);
}


/*
http://www.baeldung.com/queries-in-spring-data-mongodb
4.1. FindBy

        Let’s start simple and look at how we would represent a find by type of method first:

        1
        2
@Query("{ 'name' : ?0 }")
List<User> findUsersByName(String name);
        This method should return users by name – the placeholder ?0 references the first parameter of the method.

        1
        List<User> users = userRepository.findUsersByName("Eric");
        4.2 $regex

        Let’s also look at a regex driven query – which of course produces the same result as in 2.2 and 3.2:

        1
        2
@Query("{ 'name' : { $regex: ?0 } }")
List<User> findUsersByRegexpName(String regexp);
        The usage is also exactly the same:

        1
        List<User> users = userRepository.findUsersByRegexpName("^A");
        1
        List<User> users = userRepository.findUsersByRegexpName("c$");


4.3. $lt and $gt

        Let’s now implement the lt and gt query:

        1
        2
@Query("{ 'age' : { $gt: ?0, $lt: ?1 } }")
List<User> findUsersByAgeBetween(int ageGT, int ageLT);
        Now how, now that the method has 2 parameters, we’re referencing each of these by index in the raw query: ?0 and ?1.

        1
        List<User> users = userRepository.findUsersByAgeBetween(20, 50);*/