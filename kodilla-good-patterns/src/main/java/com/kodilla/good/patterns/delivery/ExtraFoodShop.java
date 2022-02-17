package com.kodilla.good.patterns.delivery;

public class ExtraFoodShop implements Seller {
    String name;

    ExtraFoodShop(){
        this.name = "ExtraFoodShop";
    }

    public void process(Order order){
        System.out.println("Wysłano informację o zamówieniu e-mailem do producenta " + name);
        System.out.println(order.getBucket().toString());
    }
}
