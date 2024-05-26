package com.example.task5;

import lombok.Data;

import java.util.Map;

@Data

public class Student {
    private String name;
    private String numberOfGroup;
    private Integer course;
    private Map<String, Integer> grades;

    public Student(String name, String numberOfGroup, Integer course, Map<String, Integer> grades) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.course = course;
        this.grades = grades;
    }

    public Student(String name, String numberOfGroup, Integer course) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.course = course;
    }

    public double getAverageGrade() {
        int sum = 0;

        for (int grade : grades.values()) {
            sum += grade;
        }

        return grades.isEmpty() ? 0 : (double) sum / grades.size();
    }
}
