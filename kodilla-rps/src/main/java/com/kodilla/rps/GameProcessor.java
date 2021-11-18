package com.kodilla.rps;

import static java.lang.Integer.parseInt;

public class GameProcessor {

    Message message = new Message();
    Input gameInput = new Input();
    PlayersInterface computer = new Computer();
    PlayersInterface player = new Player();
    GameRules rules = new RPSRulesEasy();

    public void playAGame(String name, int numberOfTurns){

        System.out.println("");
        message.printFullRulesMessage();
        message.printChooseMessage();

        while(true){
            gameInput.move();

            if(!"x".equals(gameInput.getLastMove()) && !"n".equals(gameInput.getLastMove())  && !"1".equals(gameInput.getLastMove()) && !"2".equals(gameInput.getLastMove()) && !"3".equals(gameInput.getLastMove())) {
                message.printWrongButtonMessage();
                message.printFullRulesMessage();
            }

            if("x".equals(gameInput.getLastMove())) {
                if(player.getPoints() < numberOfTurns && computer.getPoints() < numberOfTurns){

                    message.printSureToExitMessage();
                    gameInput.move();

                    if("T".equals(gameInput.getLastMove())) {
                        message.printNiceToMeetMessage(name);
                        break;
                    } else {
                        message.printGoOnMessage();
                    }

                } else {
                    message.printNiceToMeetMessage(name);
                    break;
                }
            }

            if(("1".equals(gameInput.getLastMove()) || "2".equals(gameInput.getLastMove()) || "3".equals(gameInput.getLastMove())) && player.getPoints() < numberOfTurns && computer.getPoints() < numberOfTurns){
                int turnResult = playATurn(gameInput.getLastMove(), computer.gamersMove());

                if(turnResult == -1) computer.addPoint();
                if(turnResult == 1 ) player.addPoint();
                message.printResults(name, player.getPoints(), computer.getPoints());
            }

            if("n".equals(gameInput.getLastMove())){
                if(player.getPoints() < numberOfTurns && computer.getPoints() < numberOfTurns){
                    message.printSureToExitMessage();
                    gameInput.move();
                    if("T".equals(gameInput.getLastMove())){
                        player.setPoints(0);
                        computer.setPoints(0);
                        message.printNewGameMessage();
                    } else {
                        message.printGoOnMessage();
                    }
                } else {
                    player.setPoints(0);
                    computer.setPoints(0);
                    message.printNewGameMessage();
                }
            }

            if((player.getPoints() >= numberOfTurns || computer.getPoints() >= numberOfTurns) && ("1".equals(gameInput.getLastMove()) || "2".equals(gameInput.getLastMove()) || "3".equals(gameInput.getLastMove()))){
                if(player.getPoints() > computer.getPoints()) {
                    message.printWinMessage(name);
                } else {
                    message.printLooseMessage(name);
                }
                message.printDecideWhatToDoMessage();
            }
        }
    }

    public int playATurn (String playersMove, String computersMove){
        int turnResult;

        turnResult = rules.check(parseInt(playersMove)-1, parseInt(computersMove)-1);

            System.out.println("Zagrałeś/aś: " + decodeMoves(playersMove) +
                    ", komputer zagrał: " + decodeMoves(computersMove) +
                    ", " + decodeTurnResult(turnResult));

        return turnResult;
    }

    // metody pomocnicze
    private String decodeMoves (String moveCode){
        String decodeResult = "błąd";

        if ("1".equals(moveCode)) decodeResult = "kamień";
        if ("2".equals(moveCode)) decodeResult = "papier";
        if ("3".equals(moveCode)) decodeResult = "nożyce";

        return decodeResult;
    }

    private String decodeTurnResult (int turnResultCode){
        String decodeResult = "błąd";

        if (turnResultCode == -1) decodeResult = "punkt dla komputera";
        if (turnResultCode == 0 ) decodeResult = "remis, nikt nie otrzymuje punktu";
        if (turnResultCode == 1) decodeResult = "punkt dla Ciebie";

        return decodeResult;
    }
}
