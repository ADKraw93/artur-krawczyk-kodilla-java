package com.kodilla.good.patterns.challenges;

public class Order {
    private User buyer;
    private User seller;
    private Product product;
    private TransportMethod transportMethod;

    public Order(User buyer, User seller, Product product, TransportMethod transportMethod) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        this.transportMethod = transportMethod;
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

    public TransportMethod getTransportMethod() {
        return transportMethod;
    }
}
