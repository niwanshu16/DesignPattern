package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;
import DesignPattern.ChessValidator.Actors.Actor;

public class PawnMoves extends Moves{
    

    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {

        Boolean straight = dePosition.isEmpty();
        Actor pawn = cPosition.getActor();
        int offset = pawn.isWhite()?1:-1;

        
        if((straight && isValidStraightMove(cPosition,dePosition, offset)) 
                || (!straight && isValidCrossMove(cPosition, dePosition, offset))) {
            return true;
        }
        
        return false;
    }

    private Boolean isValidStraightMove(Position cPosition, Position dePosition, int offset) {

        if(cPosition.getY() == dePosition.getY()) {
            if(cPosition.getX() + offset == dePosition.getX())
                return true;
        }
        return false;
    }

    private Boolean isValidCrossMove(Position cPosition, Position dePosition, int offset) {

        if(cPosition.getX() + offset == dePosition.getX()) {
            if(cPosition.getY() + 1 == dePosition.getY() || cPosition.getY() - 1 == dePosition.getY())
                return true;
        }
        return false;
    }
}
