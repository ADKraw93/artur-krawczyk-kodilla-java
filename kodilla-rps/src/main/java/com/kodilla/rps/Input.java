package com.kodilla.rps;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);
    public String name;
    public int numberOfWins;
    public String lastMove;

    public void nameInput() {
        System.out.println("Podaj swoje imię.");
        name = sc.next();
        System.out.println("Witaj " + name + "!");
    }

    public void numberOfWinsInput() {
        System.out.println("Podaj do ilu zwycięstw chcesz grać?");
        numberOfWins = sc.nextInt();
        System.out.println("Ok, zatem gramy do " + numberOfWins + " zwycięstw.");
    }

    public void move() {
        lastMove = sc.next();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public String getLastMove() {
        return lastMove;
    }
}
