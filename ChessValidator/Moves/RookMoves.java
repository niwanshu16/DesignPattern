package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;

public class RookMoves extends Moves {

    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {
        if(validateThroughX(board, cPosition, dePosition) || validateThroughY(board, cPosition, dePosition)) {
            return true;
        }
        return false;
    }

    private Boolean validateThroughX(Position[][] board, Position cPosition, Position dePosition) {
        

        for(int x : new int[]{-1,1}) {
            int cx = cPosition.getX();
            int cy = cPosition.getY();
            while(true) {
                cx += x;

                if(isInvalidRange(cx, cy)) {
                    break;
                }
                
                if(dePosition.getX() == cx && dePosition.getY() == cy)
                    return true;
                
                if(!board[cx][cy].isEmpty())
                    break;
            }
        }
        return false;
    }

    private Boolean validateThroughY(Position[][] board, Position cPosition, Position dePosition) {
       

        for(int y : new int[]{-1,1}) {
            int cx = cPosition.getX();
            int cy = cPosition.getY();
            while(true) {
                cy += y;

                if(isInvalidRange(cx, cy)) 
                    break;
                
                if(dePosition.getX() == cx && dePosition.getY() == cy)
                    return true;
                
                if(!board[cx][cy].isEmpty())
                    break;
                
            }
        }
        return false;
    }
}
