package com.kodilla.good.patterns.delivery;

public class HealthyShop implements Seller {
    String name;

    HealthyShop(){
        this.name = "HealthyShop";
    }

    public void process(Order order){
        System.out.println("Wysłano informację przez zintegrowany system do producenta " + name);
        System.out.println(order.getBucket().toString());
    }
}
