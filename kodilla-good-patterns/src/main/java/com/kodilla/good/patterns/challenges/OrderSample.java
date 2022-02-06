package com.kodilla.good.patterns.challenges;

public class OrderSample {
    User buyer = new User("John", "Smith", "Main Avenue 5, Los Angeles");
    User seller = new User("Jan", "Kowalski", "Kwiatowa 15b, Warszawa");
    Product product = new Product("Bulbulator", 12.34);
    TransportService transportService = new DirectDelivery(buyer.getUserAdress(), seller.getUserAdress());

    public Order createOrderSample(){
        return new Order(buyer, seller, product, transportService);
    }
}
