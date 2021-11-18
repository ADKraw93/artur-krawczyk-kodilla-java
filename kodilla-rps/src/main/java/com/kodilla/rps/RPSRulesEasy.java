package com.kodilla.rps;


public class RPSRulesEasy implements GameRules {

    private static final int[][] RULES = {
            { 0, -1, 1 },
            { 1, 0, -1 },
            { -1, 1, 0 }
    };

    public int check(int player1Move, int player2Move) {
        return RULES[player1Move][player2Move];
    }

}
