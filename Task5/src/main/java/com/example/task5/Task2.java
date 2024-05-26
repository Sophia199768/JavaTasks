package com.example.task5;

import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        //2.1
        LinkedList<Countries> countries = new LinkedList<>();

        //2.2
        countries.addFirst(Countries.RUSSIA);
        countries.addFirst(Countries.SPAIN);

        countries.addLast(Countries.CHINA);
        countries.addLast(Countries.KOREA);

        for (int i = 0; i < 4; i++) {
            System.out.println(countries.get(i));
        }

        //2.3
        countries.removeFirst();
        countries.removeLast();

        //2.4
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }
}
