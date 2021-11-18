package com.kodilla.rps;

public class Message {

    private final String rulesIntroMessage = "Grę w papier, kamień, nożyce obsługuje się wciskając następujące przyciski:";
    private final String push_1Message = "klawisz 1 - zagranie \"kamień\"";
    private final String push_2Message = "klawisz 2 - zagranie \"papier\"";
    private final String push_3Message = "klawisz 3 - zagranie \"nożyce\"";
    private final String push_xMessage = "klawisz x - zakończenie gry";
    private final String push_nMessage = "klawisz n - uruchomienie gry od nowa";
    private final String chooseMessage = "Zaczynamy! Wybierz zagranie.";
    private final String fullRulesMessage = rulesIntroMessage + "\n" +
            push_1Message + "\n" +
            push_2Message + "\n" +
            push_3Message + "\n" +
            push_xMessage + "\n" +
            push_nMessage;
    private final String wrongButtonMessage = "Nieprawidłowy klawisz\n";
    private final String sureToExitMessage = "Czy na pewno zakończyć grę? T/N";
    private final String goOnMessage = "Ok, gramy dalej. Wybierz inny klawisz.";
    private final String newGameMessage = "Rozpoczynamy nową rozgrywkę. Wciśnij odpowiedni klawisz zagrywki.";
    private final String decideWhatToDoMessage = "Jeśli chcesz grać od nowa wciśnij \"n\", a jeśli chcesz zakończyć grę to wciśnij \"x\"\n";

    //gettery
    public String getRulesIntroMessage() {
        return rulesIntroMessage;
    }

    public String getPush_1Message() {
        return push_1Message;
    }

    public String getPush_2Message() {
        return push_2Message;
    }

    public String getPush_3Message() {
        return push_3Message;
    }

    public String getPush_xMessage() {
        return push_xMessage;
    }

    public String getPush_nMessage() {
        return push_nMessage;
    }

    public String getChooseMessage() {
        return chooseMessage;
    }

    public String getFullRulesMessage() {
        return fullRulesMessage;
    }

    public String getWrongButtonMessage() {
        return wrongButtonMessage;
    }

    public String getSureToExitMessage() {
        return sureToExitMessage;
    }

    public String getGoOnMessage() {
        return goOnMessage;
    }

    public String getNewGameMessage() {
        return newGameMessage;
    }

    public String getDecideWhatToDoMessage() {
        return decideWhatToDoMessage;
    }

    //printy
    public void printRulesIntroMessage() {
        System.out.println(rulesIntroMessage);
    }

    public void printPush_1Message() {
        System.out.println(push_1Message);
    }

    public void printPush_2Message() {
        System.out.println(push_2Message);
    }

    public void printPush_3Message() {
        System.out.println(push_3Message);
    }

    public void printPush_xMessage() {
        System.out.println(push_xMessage);
    }

    public void printPush_nMessage() {
        System.out.println(push_nMessage);
    }

    public void printChooseMessage() {
        System.out.println(chooseMessage);
    }

    public void printFullRulesMessage() {
        System.out.println(fullRulesMessage);
    }

    public void printWrongButtonMessage() {
        System.out.println(wrongButtonMessage);
    }

    public void printSureToExitMessage() {
        System.out.println(sureToExitMessage);
    }

    public void printGoOnMessage() {
        System.out.println(goOnMessage);
    }

    public void printNewGameMessage() {
        System.out.println(newGameMessage);
    }

    public void printDecideWhatToDoMessage() {
        System.out.println(decideWhatToDoMessage);
    }

    //personalised messeges
    public void printNiceToMeetMessage(String name) {
        System.out.println("Miło było z Tobą pograć " + name + ". Do zobaczenia kolejnym razem!");
    }

    public void printResults(String name, int numberOfPlayersWins, int numberOfComputersWins) {
        System.out.println("Aktualne wyniki:\n" +
                name + ": " + numberOfPlayersWins + "\n" +
                "Komputer: " + numberOfComputersWins + "\n");
    }

    public void printWinMessage(String name){
        System.out.println("Gratuluję " + name + "! Wygrałeś/aś!");
    }

    public void printLooseMessage(String name) {
        System.out.println("Niestety " + name + " przegrałeś/aś, ale głowa do góry! Kolejnym razem się uda!");
    }
}
