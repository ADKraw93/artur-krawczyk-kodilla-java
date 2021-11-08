package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Podaj swoje imię.");
        String name = sc.next();
        System.out.println("Witaj " + name + "!");

        System.out.println("Podaj do ilu zwycięstw chcesz grać?");
        int numberOfWins = sc.nextInt();
        System.out.println("Ok, zatem gramy do " + numberOfWins + " zwycięstw.");


        game.playAGame(name, numberOfWins);

    }
}
