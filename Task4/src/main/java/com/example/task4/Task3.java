package com.example.task4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {

    private static boolean unique(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        if (unique(str1)) {
            System.out.println(str1);
        } else if (unique(str2)) {
            System.out.println(str2);
        } else if (unique(str3)) {
            System.out.println(str3);
        } else {
            System.out.println("None");
        }
    }
}
