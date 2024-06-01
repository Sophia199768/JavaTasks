package com.example.task7.Task1;

public class WrongPasswordException extends  Exception {

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
