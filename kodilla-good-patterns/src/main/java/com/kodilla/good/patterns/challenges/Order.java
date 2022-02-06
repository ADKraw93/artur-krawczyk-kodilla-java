package com.kodilla.good.patterns.challenges;

public class Order {
    User buyer;
    User seller;
    Product product;
    TransportService transportService;

    public Order(User buyer, User seller, Product product, TransportService transportService) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        this.transportService = transportService;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public Product getProduct() {
        return product;
    }

    public TransportService getTransportService() {
        return transportService;
    }
}
