package com.example.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // task 4
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();

        for (char c : str1.toCharArray()) {
            System.out.print(c);
            System.out.print(c);
        }

    }
}
