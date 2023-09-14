package DesignPattern.ChessValidator.Actors;

import DesignPattern.ChessValidator.Moves.RookMoves;

import java.util.ArrayList;

public class Knight extends Actor {

    public Knight(String name, Boolean white) {
        this.name = name;
        this.white = white;
        validMoves = new ArrayList<>();
        populateMoves();
    }

    @Override
    public void populateMoves() {
        validMoves.add(new RookMoves());
    }
    
}
