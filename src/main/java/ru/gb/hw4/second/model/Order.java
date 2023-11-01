package ru.gb.hw4.second.model;

import java.util.List;

public class Order {
    private static int count;
    private int id;
    private Client client;
    private List<Product> products;

    private int cost;



    public Order(Client client, List<Product> products) {
        this.client = client;
        this.products = products;
        this.id = count;
        count ++;
        this.cost =this.calculateCost();
    }

    private int calculateCost() {
        int result = 0;
        for (Product product : products
        ) {
            result += product.getPrice();
        }
        return result;
    }

    public int getCost() {
        return cost;
    }
}
