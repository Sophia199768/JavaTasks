package com.example.task4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        int average = (str1.length() + str2.length() + str3.length()) / 3;

        if (str1.length() < average) {
            System.out.println(str1);
        }

        if (str2.length() < average) {
            System.out.println(str2);
        }

        if (str3.length() < average) {
            System.out.println(str3);
        }

    }
}
