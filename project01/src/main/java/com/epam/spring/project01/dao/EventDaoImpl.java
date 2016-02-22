package com.epam.spring.project01.dao;

import com.epam.spring.project01.Event;
import com.epam.spring.project01.Rating;

import java.util.List;

public class EventDaoImpl implements EventDao{
    List<Event> events;

    public EventDaoImpl(List<Event> events) {
        this.events = events;
    }

    @Override
    public void create(Event event) {
        events.add(event);
    }

    @Override
    public void remove(Event event) {
        events.remove(event);
    }

    @Override
    public Event getByName(String name) {
        for (Event e: events){
            if (e.getEventName().equals(name)) return e;
        }
        return null;
    }

    public int getBasePrice(Event event) {
        return event.getBasePrice();
    }

    public Rating getRating(Event event) {
        return event.getRating();
    }

    @Override
    public List<Event> getAll() {
        return events;
    }
}
