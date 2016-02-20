package com.epam.spring.project01;

import com.epam.spring.project01.dao.EventDao;
import com.epam.spring.project01.dao.EventDaoImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/* Manages events (movie shows).

Event contains only basic information, like name, base price for tickets, rating (high, mid, low).
 
//TODO
******* Event can be presented on several dates and several times within each day. 
//TODO
******* For each dateTime an Event will be presented only in single auditorium.

- create, remove, getByName, getAll
- getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
- getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)
- assignAuditorium(event, auditorium, date) - assign auditorium for event for specific date. Only one auditorium for Event for specific dateTime

*/

public class EventService {

	EventDaoImpl eventDaoImpl;

	public EventService(EventDaoImpl eventDaoImpl) {
		this.eventDaoImpl = eventDaoImpl;
	}

	Rating rating;
	
	public void create(Event event){
		eventDaoImpl.create(event);
	}
	
	public void remove(Event event){
		eventDaoImpl.remove(event);
	}
	
	public Event getByName(String name){
		return eventDaoImpl.getByName(name);
	}
	
	public List<Event> getAll(){
		return eventDaoImpl.getAll();
	}

	//assignAuditorium(event, auditorium, date) - assign auditorium for event for specific date.
	// Only one auditorium for Event for specific dateTime
	public void assignAuditorium(Event event, Auditorium auditorium, LocalDate date, LocalTime time){
		//TODO
	}

	//returns events for specified date range (OPTIONAL)
	public List<Event> getForDateRange(LocalDate from, LocalDate to){
		//TODO OPTIONAL
		return new ArrayList<Event>();
	}
	
	// returns events from now till the ‘to’ date (OPTIONAL)
	public List<Event> getNextEvents(LocalDate to){
		//TODO OPTIONAL
		return getForDateRange(LocalDate.now(), to);
	}

	public void assignAuditorium(Event event, Auditorium auditorium, Date date){	
		assignAuditorium(event, auditorium, 
				date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
				date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime());
	}
	
}
