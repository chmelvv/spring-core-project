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
		for (User user: users){
			if (user.getId() == id) return user; 
		}
		return null;		
	}

	public void updateUser(User user) {
		for (User u: users){
			if (u.getId() == user.getId()) u = user; 
		}
	}

	public void deleteUser(User user) {
		users.remove(user); 
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public void remove(User user) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
