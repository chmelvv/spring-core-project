package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.User;

public interface UserDao {
	public List<User> getAllUsers();
	public User getUser(int id);
	public void updateUser(User user);
	public void deleteUser(User user);	
}
