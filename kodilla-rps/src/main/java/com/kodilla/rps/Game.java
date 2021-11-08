package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Random computersMoveGenerator = new Random();

    public void playAGame(String name, int numberOfTurns){
        Scanner sc = new Scanner(System.in);
        String playersMove = "";
        int numberOfPlayersWins = 0;
        int numberOfComputersWins = 0;

        System.out.println("");
        System.out.println("Grę w papier, kamień, nożyce obsługuje się wciskając następujące przyciski:\n" +
                "klawisz 1 - zagranie \"kamień\" \n" +
                "klawisz 2 - zagranie \"papier\" \n" +
                "klawisz 3 - zagranie \"nożyce\" \n" +
                "klawisz x - zakończenie gry\n" +
                "klawisz n - uruchomienie gry od nowa");

        System.out.println("\nZaczynamy! Wybierz zagranie.");

        while(true){
            playersMove = sc.next();

            if(!playersMove.equals("x") && !playersMove.equals("n")  && !playersMove.equals("1") && !playersMove.equals("2") && !playersMove.equals("3")) {
                System.out.println("Nieprawidłowy klawisz\n");
                System.out.println("Grę w papier, kamień, nożyce obsługuje się wciskając następujące przyciski:\n" +
                        "klawisz 1 - zagranie \"kamień\" \n" +
                        "klawisz 2 - zagranie \"papier\" \n" +
                        "klawisz 3 - zagranie \"nożyce\" \n" +
                        "klawisz x - zakończenie gry\n" +
                        "klawisz n - uruchomienie gry od nowa");
            }

            if(playersMove.equals("x")) {
                if(numberOfPlayersWins < numberOfTurns && numberOfComputersWins < numberOfTurns){
                    System.out.println("Czy na pewno zakończyć grę? T/N");
                    playersMove = sc.next();
                    if(playersMove.equals("T")) {
                        System.out.println("Miło było z Tobą pograć " + name + ". Do zobaczenia kolejnym razem!");
                        break;
                    } else {
                        System.out.println("Ok, gramy dalej. Wybierz inny klawisz.");
                    }
                } else {
                    System.out.println("Miło było z Tobą pograć " + name + ". Do zobaczenia kolejnym razem!");
                    break;
                }
            }

            if((playersMove.equals("1") || playersMove.equals("2") || playersMove.equals("3")) && numberOfPlayersWins < numberOfTurns && numberOfComputersWins < numberOfTurns){
                String turnResult = playATurn(playersMove);

                if(turnResult.equals("-1")) numberOfComputersWins++;
                if(turnResult.equals("1")) numberOfPlayersWins++;

                System.out.println("Aktualne wyniki:\n" +
                        name + ": " + numberOfPlayersWins + "\n" +
                        "Komputer: " + numberOfComputersWins + "\n");
            }

            if(playersMove.equals("n")){
                if(numberOfPlayersWins < numberOfTurns && numberOfComputersWins < numberOfTurns){
                    System.out.println("Czy na pewno zakończyć aktualną grę? T/N");
                    playersMove = sc.next();
                    if(playersMove.equals("T")){
                        numberOfPlayersWins = 0;
                        numberOfComputersWins = 0;
                        System.out.println("Rozpoczynamy nową rozgrywkę. Wciśnij odpowiedni klawisz zagrywki.");
                    } else {
                        System.out.println("Ok, gramy dalej. Wybierz inny klawisz.");
                    }
                } else {
                    numberOfPlayersWins = 0;
                    numberOfComputersWins = 0;
                    System.out.println("Rozpoczynamy nową rozgrywkę. Wciśnij odpowiedni klawisz zagrywki.");
                }

            }

            if((numberOfPlayersWins >= numberOfTurns || numberOfComputersWins >= numberOfTurns) && (playersMove.equals("1") || playersMove.equals("2") || playersMove.equals("3"))){
                if(numberOfPlayersWins > numberOfComputersWins) {
                    System.out.println("Gratuluję " + name + "! Wygrałeś!");
                } else {
                    System.out.println("Niestety " + name + " przegrałeś, ale głowa do góry! Kolejnym razem się uda!");
                }

                System.out.println("Jeśli chcesz grać od nowa wciśnij \"n\", a jeśli chcesz zakończyć grę to wciśnij \"x\"\n");
            }
        }
    }

    public String playATurn (String playersMove){
        String turnResult = "";
        int computersMove = computersMoveGenerator.nextInt(3);
        computersMove++;

        if(playersMove.equals("1")){ //zagranie kamień
            if(computersMove == 1) turnResult = "0";
            if(computersMove == 2) turnResult = "-1";
            if (computersMove == 3) turnResult = "1";
        } else if (playersMove.equals("2")) { //zagranie papier
            if(computersMove == 1) turnResult = "1";
            if(computersMove == 2) turnResult = "0";
            if(computersMove == 3) turnResult = "-1";
        } else if (playersMove.equals("3")) { //zagranie nożyce
            if(computersMove == 1) turnResult = "-1";
            if(computersMove == 2) turnResult = "1";
            if(computersMove == 3) turnResult = "0";
        }

            System.out.println("Zagrałeś: " + decodeMoves(playersMove) +
                    ", komputer zagrał: " + decodeMoves(Integer.toString(computersMove)) +
                    ", " + decodeTurnResult(turnResult));

        return turnResult;
    }

    // metody pomocnicze
    private String decodeMoves (String moveCode){
        String decodeResult = "błąd";

        if (moveCode.equals("1")) decodeResult = "kamień";
        if (moveCode.equals("2")) decodeResult = "papier";
        if (moveCode.equals("3")) decodeResult = "nożyce";

        return decodeResult;
    }

    private String decodeTurnResult (String turnResultCode){
        String decodeResult = "błąd";

        if (turnResultCode.equals("-1")) decodeResult = "punkt dla komputera";
        if (turnResultCode.equals("0")) decodeResult = "remis, nikt nie otrzymuje punktu";
        if (turnResultCode.equals("1")) decodeResult = "punkt dla Ciebie";

        return decodeResult;
    }
}
