package com.example.task6;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String department;
    private int age;
    private Double salary;

    public Employee(String name, String department, int age, Double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }
}
