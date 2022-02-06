package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

public class GoodPatternsMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getTitles();
    }

    // Task 13.2
    OrderSample orderSample = new OrderSample();
    Order order = orderSample.createOrderSample();
    //OrderRequest orderRequest = new OrderRequest(orderSample.createOrderSample());

    ProductOrderService productOrderService = new ProductOrderService(
            new DirectDelivery(),
            new MailService(),
            new CsvRepository());

    productOrderService.processOrder(order.getBuyer().getUserAdress(), order.getSeller().getUserAdress());
}
