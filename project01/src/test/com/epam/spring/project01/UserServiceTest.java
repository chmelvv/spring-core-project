package com.epam.spring.project01;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.UserDaoImpl;

public class UserServiceTest {
	static final Logger log = Logger.getLogger(UserServiceTest.class);
	List<User> users;
	UserDaoImpl userDaoImpl;
	UserService userService;

	@SuppressWarnings("resource")
	@Before
	public void setUp() throws Exception {
		this.userDaoImpl =  new ClassPathXmlApplicationContext("main.xml").getBean("UserDaoImpl", UserDaoImpl.class);
		this.users = userDaoImpl.getAllUsers();
		userService = new UserService(userDaoImpl);
	}

	@Test
	public void testRegister() {
		int id = users.get(0).getId();
		User u = users.get(0);

		assertNotNull(userService.getById(id));
		userService.remove(u);
		assertNull(userService.getById(id));
		userService.register(u);
		assertEquals(u, userService.getById(id));
	}

	@Test
	public void testRemove() {
		int id = users.get(2).getId();
		User u = users.get(2);
		assertNotNull(userService.getById(id));
		userService.remove(users.get(2));
		assertNull(userService.getById(id));
		userService.register(u);
	}

	@Test
	public void testGetById() {
		assertEquals(users.get(0), userService.getById(users.get(0).getId()));
	}

	@Test
	public void testGetUserByEmail() {
		log.info(userService.getUserByEmail(users.get(1).getEmail()));
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
