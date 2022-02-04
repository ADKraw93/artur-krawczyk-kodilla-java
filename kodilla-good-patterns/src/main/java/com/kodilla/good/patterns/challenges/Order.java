package com.kodilla.good.patterns.challenges;

public class Order {
    User buyer;
    User seller;
    Product product;

    public Order(User buyer, User seller, Product product) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
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
}
