package com.example;

import com.example.model.User;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbootMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
	}


}

/*
https://spring.io/guides/gs/accessing-data-mongodb/
	Spring Boot will handle those repositories automatically as long as they are included in the same package (or a sub-package) of your @SpringBootApplication class. For more control over the registration process, you can use the @EnableMongoRepositories annotation.

		By default, @EnableMongoRepositories will scan the current package for any interfaces that extend one of Spring Data’s repository interfaces. Use it’s basePackageClasses=MyRepository.class to safely tell Spring Data MongoDB to scan a different root package by type if your project layout has multiple projects and its not finding your repositories.
		Spring Data MongoDB uses the MongoTemplate to execute the queries behind your find* methods. You can use the template yourself for more complex queries, but this guide doesn’t cover that.*/
