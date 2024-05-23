package com.example.task4;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Task1 {

    public static void main(String[] args) {

        // task 1
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String shortest = str1;
        String longest = str1;

        int shortStr = Math.min(str1.length(), Math.min(str2.length(), str3.length()));
        int maxStr = Math.max(str1.length(), Math.max(str2.length(), str3.length()));

        if (str1.length() == shortStr) {
            shortest = str1;
        } else if (str2.length() == shortStr) {
            shortest = str2;
        } else {
            shortest = str3;
        }

        if (str1.length() == maxStr) {
            longest = str1;
        } else if (str2.length() == maxStr) {
            longest = str2;
        } else {
            longest = str3;
        }


        System.out.print("The shortest: " + shortest + " ");
        System.out.println(shortStr);
        System.out.print("The longest: " + longest + " ");
        System.out.println(maxStr);


    }

}
