package com.kodilla.good.patterns.challenges;

public class CsvRepository implements OrderRepository{
    @Override
    public void saveToDatabase() {
        System.out.println("Data saved to .csv file");
    }
}
