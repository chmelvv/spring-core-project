package com.epam.spring.project01;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.UserDaoImpl;

public class UserDaoImplTest {
	static final Logger log = Logger.getLogger(UserDaoImplTest.class);
	private UserDaoImpl userDaoImpl;
	private List<User> users;

	@SuppressWarnings("resource")
	@Before
	public void setUp() throws Exception {
		this.userDaoImpl =  new ClassPathXmlApplicationContext("main.xml").getBean("UserDaoImpl", UserDaoImpl.class);
		this.users = userDaoImpl.getAllUsers();
	}


	@Test
	public void testGetAllUsers() {
		for (User user: users){
			log.info(user.toString());
		}
		assertEquals(userDaoImpl.getAllUsers(), this.users);
	}

	@Test
	public void testGetUser() {
		User testUser = users.get(1);
		assertEquals(userDaoImpl.getById(testUser.getId()), testUser);
	}

	@Test
	public void testUpdateUser() {
		User testUser = users.get(2);
		testUser.setName("Kate");
		userDaoImpl.update(testUser);
		assertEquals(userDaoImpl.getById(testUser.getId()).getName(),testUser.getName());
	}

	@Test
	public void testDeleteUser() {
		User testUser = users.get(0);
		userDaoImpl.deleteUser(testUser);
		assertFalse(userDaoImpl.getAllUsers().contains(testUser));
	}

}
