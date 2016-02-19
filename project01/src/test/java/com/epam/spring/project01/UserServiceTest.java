package com.epam.spring.project01;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.UserDaoImpl;

public class UserServiceTest {
	static final Logger log = Logger.getLogger(UserDaoImplTest.class);
	List<User> users;
	UserDaoImpl userDaoImpl;
	UserService userService;

	@SuppressWarnings("resource")
	@Before
	public void setUp() throws Exception {
		this.userDaoImpl =  new ClassPathXmlApplicationContext("main.xml").getBean("UserDaoImpl", UserDaoImpl.class);
		this.users = userDaoImpl.getAllUsers();
		userService = new UserService(userDaoImpl);
		
		for (int i=0; i < users.size();i++){
			userService.register(users.get(i));
		}
	}

	@Test
	public void testRegister() {
		assertNotNull(userService.getById(users.get(0).getId()));
		userService.remove(users.get(0));
		
		assertNull(userService.getById(users.get(0).getId()));
		userService.register(users.get(0));
		
		assertEquals(users.get(0), userService.getById(users.get(0).getId()));
	}

	@Test
	public void testRemove() {
		assertNotNull(userService.getById(users.get(2).getId()));
		userService.remove(users.get(2));
		assertNull(userService.getById(users.get(2).getId()));
		userService.register(users.get(2));
	}

	@Test
	public void testGetById() {
		assertEquals(users.get(0), userService.getById(users.get(0).getId()));
	}

	@Test
	public void testGetUserByEmail() {
		assertEquals(users.get(1), userService.getUserByEmail(users.get(1).getEmail()));
	}

	@Test
	public void testGetUserByName() {
		assertEquals(users.get(0), userService.getUserByName(users.get(0).getName()));
	}

	@Test
	public void testGetBookedTickets() {
		fail();
	}

}
