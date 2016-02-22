package com.epam.spring.project01.dao;

import com.epam.spring.project01.Event;
import com.epam.spring.project01.Rating;

import java.util.List;

public interface EventDao {
    void create(Event event);
    void remove(Event event);
    Event getByName(String name);
    int getBasePrice(Event event);
    Rating getRating(Event event);
    List<Event> getAll();
}
