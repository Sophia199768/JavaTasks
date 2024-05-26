package com.example.task5;

import java.util.*;

public class Task4 {
    private static double minPoint = 3.0;

    public static void removeStudentsWithLowAverageGrade(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < minPoint) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 4);
        grades1.put("Java", 5);

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Java", 3);

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 4);
        grades3.put("Java", 4);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ann Ivanova", "M3204", 2, grades1));
        students.add(new Student("Ivan Ivanov", "M3207", 2, grades2));
        students.add(new Student("Kate Ivanova", "M3205", 2, grades3));

        removeStudentsWithLowAverageGrade(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
