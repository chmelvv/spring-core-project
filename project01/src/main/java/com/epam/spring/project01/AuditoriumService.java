package com.epam.spring.project01;

import com.epam.spring.project01.dao.AuditoriumDaoImpl;

import java.util.List;

/* #AuditoriumService - Returns info about auditoriums and places

Since auditorium information is usually static, store it in some property file. 
The information that needs to be stored is:
   name
   number of seats
   vip seats (comma-separated list of expensive seats)

*******Several auditoriums can be stored in separate property files, information from them could be injected 
into the AuditoriumService

 - getAuditoriums(), getSeatsNumber(), getVipSeats()
 */

public class AuditoriumService {
	private AuditoriumDaoImpl auditoriumDaoImpl;

	public AuditoriumService(AuditoriumDaoImpl auditoriumDaoImpl) {
		this.auditoriumDaoImpl = auditoriumDaoImpl;
	}

	public List<Auditorium> getAllAuditoriums(){
		return auditoriumDaoImpl.getAllAuditoriums();
	}
	
	public int getSeatsNumber(String name){
		return auditoriumDaoImpl.getByName(name).getSeatsNumber();
	}

	public String getVipSeats(String name){
		return auditoriumDaoImpl.getByName(name).getVipSeats();
	}
}
