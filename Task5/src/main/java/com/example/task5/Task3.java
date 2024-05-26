package com.example.task5;

import java.util.HashSet;

public class Task3 {

    public static void main(String[] args) {
        //3.2
        HashSet<Person> people = new HashSet<>();

        //3.3
        Person firstPerson = new Person("Ann", "Ivanova");
        Person secondPerson = new Person("Kate", "Ivanova");
        Person thirdPerson = new Person("Ivan", "Ivanova");

        people.add(firstPerson);
        people.add(secondPerson);
        people.add(thirdPerson);

        for (Person person: people) {
            System.out.println(person);
        }

        //3.4
        people.remove(firstPerson);
        people.remove(secondPerson);

        //3.5
        System.out.println(people.contains(thirdPerson));
    }
}
