package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Саша on 22.04.2017.
 */
@Document(collection="users")
public class User implements Serializable {
    @Id
    private String id;
    private String name;
    private Integer age;
    private List<String> recomendations;
    private Map<String, Integer> priorities;

    public User(){

    }

    /*private User(Long id, String name, Integer age, List<String> recomendations, Map<String, Integer> priorities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.recomendations = recomendations;
        this.priorities = priorities;
    }*/

    public void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getRecomendations() {
        return recomendations;
    }

    public Map<String, Integer> getPriorities(){
        return priorities;
    }

}
