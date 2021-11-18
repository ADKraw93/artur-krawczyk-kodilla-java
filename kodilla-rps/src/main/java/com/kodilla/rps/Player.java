package com.kodilla.rps;

public class Player implements PlayersInterface{

    Input playersInput = new Input();
    private int numberOfPoints;

    public Player(){
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
        playersInput.move();
        return playersInput.getLastMove();
    }
}
