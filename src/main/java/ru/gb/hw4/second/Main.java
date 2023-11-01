package ru.gb.hw4.second;

import ru.gb.hw4.second.model.Client;
import ru.gb.hw4.second.model.Product;
import ru.gb.hw4.second.model.Service;

public class Main {
    public static void main(String[] args) {
// заполнение клиентов
        Service.addClient(new Client("Иванов","+74012010101"));
        Service.addClient(new Client("Петров","+74012020202"));
        Service.addClient(new Client("Сидоров","+74012030303"));
        Service.addClient(new Client("Комаров","+74012040404"));
// заполнение продуктов
        Service.addProduct(new Product("Цемент", 300));
        Service.addProduct(new Product("Песок", 150));
        Service.addProduct(new Product("Щебень", 200));
        Service.addProduct(new Product("Фанера", 350));
        Service.addProduct(new Product("Лопата", 150));
// оформление заказов
        Service.makePurchase("Сидоров",new String[]{"Лопата","Песок"});
        Service.makePurchase("Сучков",new String[]{"Лопата","Песок"});
        Service.makePurchase("Комаров",new String[]{"Цемент","Грабли"});
        Service.makePurchase("Петров",new String[]{"Фанера","Лопата"});
        Service.makePurchase("Сидоров",new String[]{"Щебень","Щебень"});
        Service.showOrderCount();

    }


}
