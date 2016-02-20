package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.User;

public interface UserDao {
	List<User> getAllUsers();
	User getById(int id);
	void register(User user);
	void remove(User user);
	void update(User user);
}
