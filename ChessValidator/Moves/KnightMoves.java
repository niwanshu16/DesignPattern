package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;

public class KnightMoves extends Moves {

    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {
        return validate(cPosition,dePosition);
    }

    private Boolean validate(Position cPosition, Position dePosition) {
        for(int a : new int[]{-2,2}) {
            for(int b : new int[]{-1,1}) {
                if((cPosition.getX() + a == dePosition.getX() && cPosition.getY() + b == dePosition.getY()) ||
                    (cPosition.getY() + a == dePosition.getY() && cPosition.getX() + b == dePosition.getX())) {
                        return true;
                }
            }
        }
        return false;
    }
    
}
