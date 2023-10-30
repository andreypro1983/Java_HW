package ru.gb.hw4.first.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        this("Введенные данные пароля недопустимы");
    }


}
