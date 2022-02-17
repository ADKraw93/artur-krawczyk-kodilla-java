package com.kodilla.good.patterns.delivery;

public class GlutenFreeShop implements Seller {
    String name;

    GlutenFreeShop(){
        this.name = "GlutenFreeShop";
    }

    public void process(Order order){
        System.out.println("Wysłano informację przez zintegrowany system do producenta " + name);
        System.out.println(order.getBucket().toString());
    }
}
