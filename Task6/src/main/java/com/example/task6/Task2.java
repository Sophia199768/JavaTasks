package com.example.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task2 {


    public static List<Employee> getOlderThanThirty(List<Employee> employees) {
        return employees.stream().filter(employee -> employee.getAge() > 30)
                .sorted((employee1, employee2) -> Integer.compare(employee1.getAge(), employee2.getAge()))
                .collect(Collectors.toList());
    }

    public static int numberOfEmployeesInITDepartment(List<Employee> employees) {
        return (int)employees.stream().filter(employee -> employee.getDepartment().equals("IT")).count();
    }


    public static Optional<Employee> employeeWithMaxSalary(List<Employee> employees) {
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }

    public static List<String> getSortedNamesInHR(List<Employee> employees) {
        return employees.stream().filter(e -> "HR".equals(e.getDepartment()))
                .map(Employee::getName).sorted().collect(Collectors.toList());
    }


    public static double averageSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
    }


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Name1", "IT", 19, 1000000.0));
        employees.add(new Employee("Name2", "HR", 31, 2000000.0));
        employees.add(new Employee("Name3", "IT", 21, 1000000.0));
        employees.add(new Employee("Name4", "HR", 19, 1000000.0));
        employees.add(new Employee("Name5", "IT", 32, 2000000.0));

        // 2
        List<Employee> employeesOlderThan30 =  getOlderThanThirty(employees);
        employeesOlderThan30.forEach(e -> System.out.println(e.getName() + " age: " + e.getAge()));

        // 3
        int itEmployeesCount = numberOfEmployeesInITDepartment(employees);
        System.out.println("Amount of IT: " + itEmployeesCount);

        // 4
        Optional<Employee> employeeWithMaxSalary =  employeeWithMaxSalary(employees);
        employeeWithMaxSalary.ifPresent(e -> System.out.println(employeeWithMaxSalary));

        // 5
        List<String> hrNamesSorted = getSortedNamesInHR(employees);
        System.out.println("Sorted names from HR" + hrNamesSorted);

        // 6
        double averageSalary = averageSalary(employees);
        System.out.println("Average Salary: " + averageSalary);
    }
}
