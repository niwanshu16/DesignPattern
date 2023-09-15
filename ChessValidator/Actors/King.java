package DesignPattern.ChessValidator.Actors;

import java.util.ArrayList;

import DesignPattern.ChessValidator.Moves.OneStepMove;

public class King extends Actor {

    public King(String name, Boolean white) {
        this.name = name;
        this.white = white;
        validMoves = new ArrayList<>();
        populateMoves();
    }
    @Override
    public void populateMoves() {
        validMoves.add(new OneStepMove());
    }
    
}
