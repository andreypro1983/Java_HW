package ru.gb.hw4.first.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        this("Превышена максимально допустимая длина login");
    }


}
