package com.epam.spring.project01;

public class Auditorium {
	String name;
	int seatsNumber;
    String vipSeats;
    
    public Auditorium(String name, int seatsNumber, String vipSeats){
    	this.name = name;
    	this.seatsNumber = seatsNumber;
    	this.vipSeats = vipSeats;
    }
    
    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSeatsNumber() {
		return seatsNumber;
	}
	
	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	
	public String getVipSeats() {
		return vipSeats;
	}
	
	public void setVipSeats(String vipSeats) {
		this.vipSeats = vipSeats;
	}
}
