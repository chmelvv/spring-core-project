package com.epam.spring.project01;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.AuditoriumDaoImpl;
import com.epam.spring.project01.dao.UserDaoImpl;

public class AuditoriumDaoImplTest {
	static final Logger log = Logger.getLogger(AuditoriumDaoImplTest.class);
	AuditoriumDaoImpl auditoriumDaoImpl;
	List<Auditorium> auditoriums;
	
	@SuppressWarnings("resource")
	@Before
	public void setUp() throws Exception {
		this.auditoriumDaoImpl =  new ClassPathXmlApplicationContext("main.xml").getBean("AuditoriumDaoImpl", AuditoriumDaoImpl.class);
		this.auditoriums = auditoriumDaoImpl.getAllAuditoriums();
	}

	@Test
	public void testGetAuditorium() {
		assertEquals(auditoriumDaoImpl.getAuditorium(auditoriums.get(1).getName()), auditoriums.get(1));
	}

}
