package DesignPattern.ChessValidator.Actors;

import java.util.ArrayList;

import DesignPattern.ChessValidator.Moves.BishopMoves;
import DesignPattern.ChessValidator.Moves.RookMoves;

public class Queen extends Actor {

    public Queen(String name, Boolean white) {
        this.name = name;
        this.white = white;
        validMoves = new ArrayList<>();
        populateMoves();
    }
    @Override
    public void populateMoves() {
        validMoves.add(new RookMoves());
        validMoves.add(new BishopMoves());
    }
    
}
