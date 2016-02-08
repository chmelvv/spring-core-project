package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.User;

public interface UserDao {
	public List<User> getAllUsers();
	public User getById(int id);
	public void register(User user);
	public void remove(User user);
	public void update(User user);
}
