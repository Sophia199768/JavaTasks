package org.example;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
            Event event = new Event("birthday");
            event.date = new Date(1715885971L);

            event.addGuests();

            event.addGuests(5);

            User newUser = new User("login", "password");

            event.setGuests(newUser);
    }
}