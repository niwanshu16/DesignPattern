package DesignPattern.ChessValidator.Actors;

import DesignPattern.ChessValidator.Moves.PawnMoves;
import java.util.ArrayList;

public class Pawn extends Actor{

    public Pawn(String name, Boolean isWhite) {
        this.name = name;
        this.white = isWhite;
        validMoves = new ArrayList<>();
        populateMoves();
    }

    public void populateMoves() {
        validMoves.add(new PawnMoves());
    }
}
