package com.epam.spring.project01.dao;

import java.util.List;

import com.epam.spring.project01.Auditorium;
import com.epam.spring.project01.User;

public interface AuditoriumDao {
	public List<Auditorium> getAllAuditoriums();
	public Auditorium getAuditorium(String name);
}
