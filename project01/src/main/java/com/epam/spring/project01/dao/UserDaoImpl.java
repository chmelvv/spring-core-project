package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.User;

public class UserDaoImpl implements UserDao {
	
	List<User> users;
	
	public UserDaoImpl(List<User> users){
		this.users = users;
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(int id) {
		return users.get(id);
	}

	public void updateUser(User user) {
		users.get(user.getId()).setName(user.getName());
		users.get(user.getId()).setAdmin(user.isAdmin());
		users.get(user.getId()).setDayOfBirth(user.getDayOfBirth());
	}

	public void deleteUser(User user) {
		users.remove(user.getId());
	}

}
