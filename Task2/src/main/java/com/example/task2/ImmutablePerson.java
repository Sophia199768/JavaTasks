package com.example.task2;

import lombok.Data;

import java.util.List;

@Data
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;


    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
}
