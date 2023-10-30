package ru.gb.hw4.first;

import ru.gb.hw4.first.exceptions.WrongLoginException;
import ru.gb.hw4.first.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String login = "Andrey";
//        String password = "123456";
//        String confirmPassword = "123456";
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите ваш login, password и confirmPassword через пробел:");
            String[] userInfo = scanner.nextLine().split(" ");
            if (userInfo.length == 3) {

                if (UserValidation.checkLoginAndPassword(userInfo[0], userInfo[1], userInfo[2])) {
                    System.out.println("Введенные данные корректны");
                } else {
                    System.out.println("Введенные данные не корректны");
                }
            } else System.out.println("Введено неверное количество данных");

        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
