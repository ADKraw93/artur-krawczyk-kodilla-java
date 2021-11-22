package com.kodilla.rps;

import java.util.List;

public interface GameRules {

    int check(int player1Move, int player2Move);
    List<String> getAvailableMoves();
    List<String> getPlaysAllowed();
}
