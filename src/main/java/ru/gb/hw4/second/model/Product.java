package ru.gb.hw4.second.model;

public class Product {
    private int id;

    private static int count;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
