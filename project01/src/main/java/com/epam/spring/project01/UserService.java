package com.epam.spring.project01;

import java.util.ArrayList;
import java.util.List;

import com.epam.spring.project01.dao.UserDao;
import com.epam.spring.project01.dao.UserDaoImpl;
/* - register, remove, getById, getUserByEmail, getUsersByName, getBookedTickets
 * Allows for admins to enter events, view purchased tickets. 
Allows for users to register, view events with air dates and times, get ticket price, buy tickets.
 */
public class UserService {
	UserDaoImpl userDaoImpl;
	
	public UserService(UserDaoImpl userDaoImpl){
		this.userDaoImpl = userDaoImpl;
	}
	
	public void register(User user){
		userDaoImpl.register(user);
	}
	
	public void remove(User user){
		userDaoImpl.remove(user);
	}
	
	public User getById(int id){
		return userDaoImpl.getById(id);
	}
	
	public User getUserByEmail(String email){
		for (User u: userDaoImpl.getAllUsers()){
			if (u.getEmail().equals(email)) return u;
		}
		
		return null;
	}
	
	public User getUserByName(String name){
		for (User u: userDaoImpl.getAllUsers()){
			if (u.getName().equals(name)) return u;
		}
		
		return null;
	}
	
	public List<Ticket> getBookedTickets(User user){
		
		//TODO
		return new ArrayList<Ticket>();
	}

}
