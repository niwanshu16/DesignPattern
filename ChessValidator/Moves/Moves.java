package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;
import DesignPattern.ChessValidator.Actors.Actor;

public abstract class Moves {
    
    public static Boolean isSameTypeActor(Actor cActor, Actor deActor) {
        return cActor.isWhite() && deActor.isWhite() || !cActor.isWhite() && !deActor.isWhite();
    }
    
    public Boolean isInvalidRange(Integer x, Integer y) {
        return x <= 0 || x > 8 || y <= 0 || y > 8;
    }

    public abstract Boolean validMoves(Position[][] board, Position cPosition, Position dePosition);
}
