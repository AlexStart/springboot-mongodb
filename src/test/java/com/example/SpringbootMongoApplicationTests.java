package com.example;

import com.example.model.User;
import com.example.repository.IUserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongoApplicationTests {

	@Autowired
	private IUserRepository userRepository;

	@Before
	public void setUp() {

	}

	//@Test
	public void saveDataTest() {
		User user = new User();
		user.setName("Alex");
		user.setAge(25);
		//assertNull(user.getId());
		userRepository.save(user);
		User userResult = userRepository.findUserOlderThan(18).get(0);
		System.out.println("###### User's ID is " + userResult.getId());

	}

	@Test
	public void findDataTest() {
		List<User> users = userRepository.findAll();
		System.out.println("###### Users SIZE is " + users != null? users.size():"Null");

	}

	@After
	public void tearDown() {
		userRepository.deleteAll();
	}

}
