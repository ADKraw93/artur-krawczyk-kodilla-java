package com.kodilla.good.patterns.delivery;

public class Product {
    private String nameOfProduct;
    private double price;

    public Product(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return nameOfProduct + ' ' + price;
    }
}
