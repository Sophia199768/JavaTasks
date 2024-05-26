package com.example.task5;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
