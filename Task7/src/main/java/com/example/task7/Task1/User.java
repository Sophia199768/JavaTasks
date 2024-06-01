package com.example.task7.Task1;

public class User {

    private static final int MAX_LENGTH_OF_LOGIN = 19;
    private static final int MAX_LENGTH_OF_PASSWORD = 19;
    public static boolean Checker(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > MAX_LENGTH_OF_LOGIN || login.contains(" ")) {
            throw new WrongLoginException("Login should be less than 20 characters and should not contain spaces.");
        }

        if (password.length() > MAX_LENGTH_OF_PASSWORD || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password should be less than 20 characters, should not contain spaces, and must contain at least one digit.");
        }

        if (password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

        return true;
    }
}
