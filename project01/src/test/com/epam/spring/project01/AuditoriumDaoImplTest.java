package com.epam.spring.project01;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.project01.dao.AuditoriumDaoImpl;
/* #AuditoriumService - Returns info about auditoriums and places
Since auditorium information is usually static, store it in some property file.
The information that needs to be stored is:
   name
   number of seats
   vip seats (comma-separated list of expensive seats)

Several auditoriums can be stored in separate property files, information from them could be injected into the AuditoriumService
 - getAuditoriums(), getSeatsNumber(), getVipSeats()

*/

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
	public void testGetByName() {
		assertEquals(auditoriumDaoImpl.getByName(auditoriums.get(1).getName()), auditoriums.get(1));
	}


	@Test
	public void testGetAllAuditoriums(){
		for (Auditorium au: auditoriums){
			log.info(au.toString());
		}

		assertEquals(auditoriumDaoImpl.getAllAuditoriums(), auditoriums);
	}



}
