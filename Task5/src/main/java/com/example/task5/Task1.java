package com.example.task5;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Task1 {

    public static void main(String[] args) {

        //1.1
        ArrayList<Countries> countries = new ArrayList<>();

        //1.2
        countries.add(Countries.RUSSIA);
        countries.add(Countries.CHINA);
        countries.add(Countries.KOREA);

        for (int i = 0; i < 3; i++) {
            System.out.println(countries.get(i));
        }

        //1.3
        countries.set(1, Countries.SPAIN);

        for (int i = 0; i < 3; i++) {
            System.out.println(countries.get(i));
        }

        //1.4
        countries.remove(1);

        //1.5
        countries.remove(Countries.SPAIN);

        //1.6
        System.out.println(countries.indexOf(Countries.RUSSIA));

        //1.7
        System.out.println(countries.contains(Countries.GreatBritain));
    }

}
