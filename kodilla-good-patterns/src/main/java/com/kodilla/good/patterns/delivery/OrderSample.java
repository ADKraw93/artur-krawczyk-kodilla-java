package com.kodilla.good.patterns.delivery;

public class OrderSample {
    User janKowalski = new User("Jan Kowalski", "j.kowalski@kodilla.com");
    SampleBucket sampleBucket = new SampleBucket();

    public Order generateOrderSample(){
        return new Order(janKowalski, sampleBucket.generateSampleBucket());
    }
}
