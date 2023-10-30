package ru.gb.hw4.first;

import ru.gb.hw4.first.exceptions.WrongLoginException;
import ru.gb.hw4.first.exceptions.WrongPasswordException;


public class UserValidation {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 20;


    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return checkLoginLength(login) && checkCorrectPassword(password, confirmPassword);
    }

    private static boolean checkLoginLength(String login) throws WrongLoginException {

        if (login.length() >= MAX_LOGIN_LENGTH) {
            throw new WrongLoginException("Превышена максимальная длина login");
        }
        return true;
    }

    private static boolean checkCorrectPassword(String password, String confirmPassword) throws WrongPasswordException {
        if ((password.length() >= MAX_PASSWORD_LENGTH)) {
            throw new WrongPasswordException("Превышена максимальная длина password");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введенный password отличается от confirmedPassword");
        }
        return true;
    }


}
