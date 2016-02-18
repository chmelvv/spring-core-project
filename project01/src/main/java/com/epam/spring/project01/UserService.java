package com.epam.spring.project01;

import java.util.ArrayList;
import java.util.List;

import com.epam.spring.project01.dao.UserDao;
/* - register, remove, getById, getUserByEmail, getUsersByName, getBookedTickets
 * Allows for admins to enter events, view purchased tickets. 
Allows for users to register, view events with air dates and times, get ticket price, buy tickets.
 */
public class UserService implements UserDao{
	List<User> users;
	
	public UserService(List<User> users){
		this.users = users;
	}
	
	public void register(User user){
		users.add(user);
	}
	
	public void remove(User user){
		users.remove(user);
	}
	
	public User getById(int id){
		for (User u: users) {
			if (u.getId() == id) return u;
		}
		return null;
	}
	
	public User getUserByEmail(String email){
		for (User u: users) {
			if (u.getEmail().equals(email)) return u;
		}
		return null;
	}
	
	public User getUserByName(String name){
		for (User u: users) {
			if (u.getName().equals(name)) return u;
		}
		return null;
	}
	
	public List<Ticket> getBookedTickets(User user){
		
		//TODO
		return new ArrayList<Ticket>();
	}

	public List<User> getAllUsers() {
		return users;
	}

	public void update(User user) {
		for (User u: users) {
			if (u.getId() == user.getId()) {
				u = user;
				break;
			}
		}
	}
}
