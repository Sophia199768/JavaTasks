package com.example.task7.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWorks {

    public static void WriteInFile() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
            fos.write(input.getBytes());
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }


    public static void ReadFromFile() {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream fis = new FileInputStream("tms.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                stringBuilder.append((char) content);
            }

            String modifiedString = stringBuilder.toString().replace(" ", "_");
            System.out.println(modifiedString);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        WriteInFile();
        ReadFromFile();
    }
}
