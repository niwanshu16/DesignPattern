package DesignPattern.ChessValidator.Actors;

import java.util.ArrayList;
import DesignPattern.ChessValidator.Moves.BishopMoves;

public class Bishop extends Actor {

    public Bishop(String name, Boolean white) {
        this.name = name;
        this.white = white;
        validMoves = new ArrayList<>();
        populateMoves();
    }

    @Override
    public void populateMoves() {
        validMoves.add(new BishopMoves());
    }
 
}
