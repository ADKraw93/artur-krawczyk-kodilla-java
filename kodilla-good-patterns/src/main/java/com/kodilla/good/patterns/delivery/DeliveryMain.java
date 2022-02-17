package com.kodilla.good.patterns.delivery;

public class DeliveryMain {
    public static void main(String[] args) {
        OrderSample orderSample = new OrderSample();
        Order order = orderSample.generateOrderSample();
        OrderService orderService = new OrderService(new GlutenFreeShop());

        orderService.processOrder(order);
    }
}
