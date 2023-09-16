package DesignPattern.ChessValidator.Actors;

import DesignPattern.ChessValidator.Moves.OneStepMove;
import DesignPattern.ChessValidator.Moves.TwoStepMove;

import java.util.ArrayList;

public class Pawn extends Actor{

    public Pawn(String name, Boolean isWhite) {
        this.name = name;
        this.white = isWhite;
        validMoves = new ArrayList<>();
        setPawn();
        populateMoves();
    }

    public void populateMoves() {
        validMoves.add(new OneStepMove());
        validMoves.add(new TwoStepMove());
    }
}
