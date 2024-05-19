package com.example.task2;

import lombok.Data;

import java.util.List;

@Data
public class MutablePerson {
    private String name;
    private int age;
    private List<String> hobbies;

    public MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
}
