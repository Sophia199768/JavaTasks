package org.example;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Event {
    private String name;
    public Date date;
    private Integer numberOfGuests;
    private List<User> guests = new LinkedList<>();

    public Event(String name) {
        this.name = name;
        this.numberOfGuests = 0;
    }

    public Event(String name, Date date, Integer numberOfGuests) {
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public List<User> getGuests() {
        return guests;
    }

    public void setGuests(List<User> guests) {
        this.guests = guests;
    }

    public void setGuests(User newGuest) {
        guests.add(newGuest);
    }

    public Event(String name, Date date, Integer numberOfGuests, List<User> guests) {
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
        this.guests = guests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }


    public void addGuests() {
        numberOfGuests++;
    }

    public void addGuests(Integer numberOfNewGuests) {
        numberOfGuests += numberOfNewGuests;
    }
}
