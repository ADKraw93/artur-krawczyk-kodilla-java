package com.kodilla.rps;

public class MainRunner {

    public static void main(String[] args) {

        GameProcessor gameProcessor = new GameProcessor();
        Input initialInput = new Input();

        initialInput.nameInput();
        initialInput.numberOfWinsInput();

        gameProcessor.playAGame(initialInput.getName(), initialInput.numberOfWins);

    }
}
