package com.kodilla.good.patterns.delivery;

public class SampleBucket {

    private Bucket sampleBucket = new Bucket();
    private Product product1 = new Product("ser", 10.0);
    private Product product2 = new Product("sok wyciskany", 5.90);
    private Product product3 = new Product("ziemniaki", 2.99);
    private Product product4 = new Product("marchew", 4.30);
    private Product product5 = new Product("pomidory", 9.99);

    public Bucket generateSampleBucket(){
        sampleBucket.addProduct(product1);
        sampleBucket.addProduct(product2);
        sampleBucket.addProduct(product3);
        sampleBucket.addProduct(product4);
        sampleBucket.addProduct(product5);

        return sampleBucket;
    }
}
