package com.epam.spring.project01;

import com.epam.spring.project01.dao.AuditoriumDaoImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class AuditoriumServiceTest {
    static final Logger log = Logger.getLogger(AuditoriumServiceTest.class);
    List<Auditorium> auditoriums;
    AuditoriumDaoImpl auditoriumDaoImpl;
    AuditoriumService auditoriumService;

    @Before
    public void setUp() throws Exception {
        this.auditoriumDaoImpl = new ClassPathXmlApplicationContext("main.xml").getBean("AuditoriumDaoImpl", AuditoriumDaoImpl.class);
        this.auditoriums = auditoriumDaoImpl.getAllAuditoriums();
        auditoriumService = new AuditoriumService(auditoriumDaoImpl);
    }

    @Test
    public void getAllAuditoriums() throws Exception {
        for (Auditorium au: auditoriumService.getAllAuditoriums()){
            log.info(au);
        }
        assertEquals(auditoriums, auditoriumService.getAllAuditoriums());
    }

    @Test
    public void getSeatsNumber() throws Exception {
        Auditorium au = auditoriums.get(1);
        assertEquals(au.getSeatsNumber(), auditoriumService.getSeatsNumber(au.getName()));
    }

    @Test
    public void getVipSeats() throws Exception {
        Auditorium au = auditoriums.get(2);
        assertEquals(au.getVipSeats(), auditoriumService.getVipSeats(au.getName()));
    }
}