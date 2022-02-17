package com.kodilla.good.patterns.delivery;

import java.util.ArrayList;

public class Order {
    private final User user;
    private Bucket bucket;

    public Order(User user, Bucket bucket) {
        this.user = user;
        this.bucket = bucket;
    }

    public User getUser() {
        return user;
    }

    public Bucket getBucket() {
        return bucket;
    }
}
