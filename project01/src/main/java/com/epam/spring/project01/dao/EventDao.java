package com.epam.spring.project01.dao;

import com.epam.spring.project01.Event;

import java.util.List;

public interface EventDao {
    void create(Event event);
    void remove(Event event);
    Event getByName(String name);
    List<Event> getAll();
}
