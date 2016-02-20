package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.Auditorium;
import com.epam.spring.project01.User;
/* #AuditoriumService - Returns info about auditoriums and places
Since auditorium information is usually static, store it in some property file.
The information that needs to be stored is:
   name
   number of seats
   vip seats (comma-separated list of expensive seats)

Several auditoriums can be stored in separate property files, information from them could be injected into the AuditoriumService
 - getAuditoriums(), getSeatsNumber(), getVipSeats()

*/
public class AuditoriumDaoImpl implements AuditoriumDao {
	List<Auditorium> auditoriums;

	public AuditoriumDaoImpl(List<Auditorium> auditoriums){
		this.auditoriums = auditoriums;
	}
	
	public List<Auditorium> getAllAuditoriums() {
		return auditoriums;
	}

	public Auditorium getByName(String name) {
		for (Auditorium au: auditoriums){
			if (au.getName().equals(name)) return au;
		}
		return null;
	}

}
