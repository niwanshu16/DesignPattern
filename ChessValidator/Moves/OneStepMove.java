package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;
import DesignPattern.ChessValidator.Actors.Actor;

public class OneStepMove extends Moves{

    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {
        Actor actor = cPosition.getActor();
        Boolean white = actor.isWhite();
        int offset = white?1:-1;
        if(cPosition.getX() + offset == dePosition.getX()) {

            for(int y : new int[]{-1,0,1}) {
                int cy = cPosition.getY();
                if(cy + y == dePosition.getY()) {
                    if(actor.isPawn() && (y == -1 || y == 1)) {
                        if(dePosition.isEmpty())
                            return false;
                    }
                    return true;
                }
            }
        }
        else if(!actor.isPawn() && cPosition.getX() == dePosition.getX()) {
            for(int y : new int[]{-1,1}) {
                int cy = cPosition.getY();

                if(cy + y == dePosition.getY())
                    return true;
            }
        }
        return false;
    }
}
