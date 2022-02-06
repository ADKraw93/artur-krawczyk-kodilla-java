package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    Order order;

    public OrderRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
