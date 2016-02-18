package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.Auditorium;
import com.epam.spring.project01.User;

public class AuditoriumDaoImpl implements AuditoriumDao {
	List<Auditorium> auditoriums;

	public AuditoriumDaoImpl(List<Auditorium> auditoriums){
		this.auditoriums = auditoriums;
	}
	
	public List<Auditorium> getAllAuditoriums() {
		return auditoriums;
	}

	public Auditorium getAuditorium(String name) {
		for (Auditorium au: auditoriums){
			if (au.getName().equals(name)) return au;
		}
		return null;
	}

}
