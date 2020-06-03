package com.swann.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.swann.SwannWebApplication;
import com.swann.entity.User;
import com.swann.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SwannWebApplication.class)
@WebAppConfiguration
public class UserServiceTest {

	@Autowired
	UserRepository sql;
	@Test
	public void findByNameTest() {
//		User obj = new User("Swann", "princeapurbask@gmail.com","007");
//		sql.save(obj);
	}
}
