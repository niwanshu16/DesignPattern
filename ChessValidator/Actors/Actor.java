package DesignPattern.ChessValidator.Actors;

import java.util.List;

import DesignPattern.ChessValidator.Position;
import DesignPattern.ChessValidator.Moves.Moves;

public abstract class Actor {

    String name;
    Boolean white; 
    List<Moves> validMoves;
    private Boolean isKing = false;
    private Boolean pawn = false;

    public String getName() {
        return name;
    }

    public Boolean isWhite() {
        return white;
    }

    public Integer makeMove(Position[][] board, Position cPosition, Position dePosition) {
        for(Moves move : validMoves) {
            if(move.validMoves(board, cPosition, dePosition)) {
                if(!dePosition.isEmpty()) {
                    if(dePosition.getActor().isKing) {
                        return 2;
                    }
                }
                dePosition.vacantPosition();
                dePosition.setActor(cPosition.getActor());
                cPosition.vacantPosition();
                return 1;
            }
        }
        return 0;
    }

    public Boolean isPawn() {
        return pawn;
    }

    public void setPawn() {
        pawn = true;
    }

    public void setKing() {
        isKing = true;
    }
    public abstract void populateMoves();

}
