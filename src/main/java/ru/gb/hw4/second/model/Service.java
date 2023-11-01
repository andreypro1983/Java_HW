package ru.gb.hw4.second.model;

import ru.gb.hw4.second.model.Client;
import ru.gb.hw4.second.model.Order;
import ru.gb.hw4.second.model.Product;
import ru.gb.hw4.second.model.exceptions.ClientNotFountException;
import ru.gb.hw4.second.model.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static List<Client> clients = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();;
    private static List<Order> orders = new ArrayList<>();;




    public  static void addClient(Client client) {
         clients.add(client);
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void makePurchase(String clientName, String[] products) {
        if (clientName.isEmpty() || products.length == 0) {
            System.out.println("Были введены не все данные, необходимые для создания заказа");
        } else {
            try {
                orders.add(createPurchase(clientName,products));
                System.out.println("Заказ успешно оформлен");
            } catch (ClientNotFountException e) {
                System.out.println(e.getMessage());
            } catch (ProductNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Order createPurchase(String clientName, String[] products) throws ClientNotFountException, ProductNotFoundException {

            return new Order(findClient(clientName), findProducts(products));

    }

    private static Client findClient(String clientName) throws ClientNotFountException {
        Client findingClient = null;
        for (Client client : clients
        ) {
            if (client.getName().equals(clientName)) {
                findingClient = client;
                break;
            }
        }
        if (findingClient == null) {
            throw new ClientNotFountException("Клиент с именем " + clientName + " не найден");
        }
        return findingClient;
    }

    private static List<Product> findProducts(String[] products) throws ProductNotFoundException {

        List<Product> listProducts = new ArrayList<>();

        for (String product : products) {
            listProducts.add(findProduct(product));
        }
        return listProducts;
    }

    private static Product findProduct(String productName) throws ProductNotFoundException {
        Product findingProduct = null;
        for (Product product : products
        ) {
            if (product.getName().equals(productName)) {
                findingProduct = product;
                break;
            }
        }
        if (findingProduct == null) {
            throw new ProductNotFoundException("Товар с названием " + productName + " не найден");
        }
        return findingProduct;
    }

    public static void showOrderCount(){
        int sum = 0;
        for (Order order:orders
             ) {
            sum+=order.getCost();
        }
        System.out.println("Совершено покупок: " + orders.size()+ " на сумму "+ sum +" руб.");
    }

}
