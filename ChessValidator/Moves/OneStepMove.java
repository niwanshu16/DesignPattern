package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;

public class OneStepMove extends Moves{

    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {
        Boolean white = cPosition.getActor().isWhite();
        int offset = white?1:-1;
        if(cPosition.getX() + offset == dePosition.getX()) {

            for(int y : new int[]{-1,0,1}) {
                int cy = cPosition.getY();

                if(cy + y == dePosition.getY())
                    return true;
            }
        }
        return false;
    }
}
