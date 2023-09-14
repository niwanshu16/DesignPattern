package DesignPattern.ChessValidator.Actors;

import java.util.List;

import DesignPattern.ChessValidator.Position;
import DesignPattern.ChessValidator.Moves.Moves;

public abstract class Actor {

    String name;
    Boolean white; 
    List<Moves> validMoves;

    public String getName() {
        return name;
    }

    public Boolean isWhite() {
        return white;
    }

    public Boolean makeMove(Position[][] board, Position cPosition, Position dePosition) {
        for(Moves move : validMoves) {
            if(move.validMoves(board, cPosition, dePosition)) {
                dePosition.vacantPosition();
                dePosition.setActor(cPosition.getActor());
                cPosition.vacantPosition();
                return true;
            }
        }
        return false;
    }
    public abstract void populateMoves();

}
