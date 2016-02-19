package com.epam.spring.project01;

import java.util.ArrayList;
import java.util.List;

import com.epam.spring.project01.dao.UserDao;
<<<<<<< HEAD
=======
import com.epam.spring.project01.dao.UserDaoImpl;
>>>>>>> deteched_branch
/* - register, remove, getById, getUserByEmail, getUsersByName, getBookedTickets
 * Allows for admins to enter events, view purchased tickets. 
Allows for users to register, view events with air dates and times, get ticket price, buy tickets.
 */
<<<<<<< HEAD
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
		return users.get(id);
	}
	
	public User getUserByEmail(String email){
		for (User u: users) {
			if (u.getEmail().equals(email)) return u;
		}
=======
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
		
>>>>>>> deteched_branch
		return null;
	}
	
	public User getUserByName(String name){
<<<<<<< HEAD
		for (User u: users) {
			if (u.getName().equals(name)) return u;
		}
=======
		for (User u: userDaoImpl.getAllUsers()){
			if (u.getName().equals(name)) return u;
		}
		
>>>>>>> deteched_branch
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
		users.get(user.getId()).setName(user.getName());
		users.get(user.getId()).setAdmin(user.isAdmin());
		users.get(user.getId()).setDayOfBirth(user.getDayOfBirth());
	}
}
