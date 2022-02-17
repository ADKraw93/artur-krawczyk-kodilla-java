package com.kodilla.good.patterns.delivery;

import com.kodilla.good.patterns.delivery.Product;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bucket {
    private ArrayList<Product> listOfProducts;

    public Bucket() {
        this.listOfProducts = new ArrayList<Product>();
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    @Override
    public String toString() {
        return "Zamówione produkty: \n" +
                listOfProducts.stream().
                map(t -> t.toString()).
                collect(Collectors.joining("\n"));
    }
}
