package DesignPattern.ChessValidator.Moves;

import DesignPattern.ChessValidator.Position;

public class TwoStepMove extends Moves {

    @Override
    public Boolean validMoves(Position[][] board, Position cPosition, Position dePosition) {
        if(cPosition.getActor().isPawn()) {
            System.out.println("TWO STEP");
            int offset = cPosition.getActor().isWhite()?2:-2;

            if((offset == 2 && cPosition.getX() == 2 ) || (offset == -2 && cPosition.getX() == 7)) {
                if(dePosition.isEmpty() && cPosition.getY() == dePosition.getY() && cPosition.getX() + offset == dePosition.getX()) 
                    return true;
            }
        }
        return false;
    }
    
}
