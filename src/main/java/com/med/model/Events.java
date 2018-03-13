package com.med.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by george on 3/9/18.
 */
public class Events {
    private List<Event> events;
    private LocalDate today;

    public Events(List<Event> events, LocalDate today) {
        this.events = events;
        this.today = today;
    }

    public Events() {
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }
}
