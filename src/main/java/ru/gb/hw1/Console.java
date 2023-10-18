package ru.gb.hw1;

import ru.gb.hw1.model.Service;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Console {

    Scanner scanner;
    Service service;

    private boolean isWork;

    public Console(){
        this.scanner = new Scanner(System.in);
    }
    public String menu (){
        StringBuilder sb = new StringBuilder();
        sb.append("Меню:").append("\n");
        sb.append("1. Добавить новую заметку").append("\n");
        sb.append("2. Отобразить все заметки").append("\n");
        sb.append("3. Выход").append("\n");
        return sb.toString();
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void print(String message){
        System.out.println(message);
    }



    private String inputFromUser() throws NoSuchElementException {
        String userData = scanner.nextLine();
        return userData;
    }

    private int inputFromUserInt() throws NumberFormatException {
        int number = Integer.parseInt(inputFromUser());
        return number;
    }

    private void  addNote(){
        System.out.println("\nВведите текст заметки:");
        String newNote = inputFromUser();
        print(service.addNote(newNote)?"\nЗаметка успешно добавлена\n":"\nНе удалось добавить заметку\n");
    }

    private void showNotes(){
        print (service.showNotes());
    }

    private void exit(){
        isWork = false;
    }

    public void start(){
        isWork = true;
        print("Приложение 'Заметки'");
        try {
            while (isWork) {

                print(menu());
                print("Выберите пункт меню:");
                switch (inputFromUserInt()){
                    case 1:
                        addNote();
                        break;
                    case 2:
                        showNotes();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        print("Введите значение от 1 до 3");
                }

            }
        } catch(NumberFormatException e){
            print("\nВведенное значение не является числом\n");
        }
    }

}
