package com.epam.spring.project01;

import java.time.LocalDate;
import java.util.List;

public class User {
	private int id;
	private String name;
	private LocalDate dayOfBirth;
	private boolean isAdmin;
	String email;
	List<Ticket> tikets;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dayOfBirth="
				+ dayOfBirth + ", isAdmin=" + isAdmin + ", email=" + email
				+ "]";
	}

	public User(String name, String dayOfBirth, boolean isAdmin) {
		this.name = name;
		this.dayOfBirth = LocalDate.parse(dayOfBirth);
		this.isAdmin = isAdmin;
		this.id = (int) (Math.random()*1000);
		this.email = name + "@gmail.com";
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}
	
	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public int getId() {
		return id;
	}

}
