package ru.gb.hw4.second.model;

public class Client {

    private static int count = 0;
    private int id;
    private String name;
    private String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Client {name: "+name+ ", phone: "+phone+"}" ;
    }
}
