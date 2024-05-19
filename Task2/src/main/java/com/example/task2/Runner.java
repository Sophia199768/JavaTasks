package com.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    String name = "Masha";
    int age = 20;
    List<String> hobbies = new ArrayList<>();

    public void checkImmutablePerson() {
        hobbies.add("history");
        ImmutablePerson newPerson = new ImmutablePerson(name, age, hobbies);
        // we can't use setters there
    }


    public void checkMutablePerson() {
        hobbies.add("biology");

        MutablePerson newPerson = new MutablePerson(name, age, hobbies);

        newPerson.setName("Peter");
        newPerson.setAge(19);
    }
}
