package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;

public class BishopMoves extends Moves {
    
    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {

        for(int x : new int[]{1,-1}) {
            for(int y : new int[]{1,-1}) {
                if(validate(board,cPosition,dePosition, x, y)) {
                    return true;
                }
            }
        }
        return false;
    }

    private Boolean validate(Position[][] board, Position cPosition, Position dePosition, int x, int y) {
        int cx = cPosition.getX();
        int cy = cPosition.getY();
       
        while(true) {
            cx += x;
            cy += y;
            if(isInvalidRange(cx, cy))
                break;
            if(cx == dePosition.getX() && cy == dePosition.getY()) {
                return true;
            }

            if(!board[cx][cy].isEmpty())
                return false;
        }
        return false;
    }
    
}
