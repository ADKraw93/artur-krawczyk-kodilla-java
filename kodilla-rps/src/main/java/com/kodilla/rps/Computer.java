package com.kodilla.rps;

import java.util.Random;

public class Computer implements PlayersInterface {

    Random moveGenerator = new Random();
    private int numberOfPoints;

    public Computer(){
        numberOfPoints = 0;
    }

    @Override
    public void addPoint(){
        numberOfPoints++;
    }

    @Override
    public void setPoints(int points) {
        numberOfPoints = points;
    }

    @Override
    public int getPoints() {
        return numberOfPoints;
    }

    @Override
    public String gamersMove() {
        return Integer.toString(moveGenerator.nextInt(3) + 1);
    }
}
