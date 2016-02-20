package com.epam.spring.project01;
/* Manages events (movie shows).

Event contains only basic information, like name, base price for s, rating (high, mid, low).

//TODO
******* Event can be presented on several dates and several times within each day.
//TODO
******* For each dateTime an Event will be presented only in single auditorium.

- create, remove, getByName, getAll
- getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
- getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)
- assignAuditorium(event, auditorium, date) - assign auditorium for event for specific date. Only one auditorium for Event for specific dateTime

*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Event {
    private Map<LocalDate, LocalTime> eventTime;
    private String eventName;
    private int basePrice;
    private Rating rating;

    public Event(Map<LocalDate, LocalTime> eventTime, String eventName, int basePrice, Rating rating) {
        setEventTime(eventTime);
        setEventName(eventName);
        setBasePrice(basePrice);
        setRating(rating);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventTime=" + eventTime +
                ", eventName='" + eventName + '\'' +
                ", basePrice=" + basePrice +
                ", rating=" + rating +
                '}';
    }

    public Map<LocalDate, LocalTime> getEventTime() {
        return eventTime;
    }

    public void setEventTime(Map<LocalDate, LocalTime> eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
