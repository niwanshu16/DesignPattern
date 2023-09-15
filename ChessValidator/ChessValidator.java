package DesignPattern.ChessValidator;

import DesignPattern.ChessValidator.Actors.Actor;
import DesignPattern.ChessValidator.Actors.Bishop;
import DesignPattern.ChessValidator.Actors.King;
import DesignPattern.ChessValidator.Actors.Knight;
import DesignPattern.ChessValidator.Actors.Pawn;
import DesignPattern.ChessValidator.Actors.Queen;
import DesignPattern.ChessValidator.Actors.Rook;
import DesignPattern.ChessValidator.Moves.Moves;

public class ChessValidator {
    
    Position board[][] = new Position[8][8];

    public void initializeBoard() {

        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                board[i][j] = new Position(i,j);
            }
        }
        assignKnights();
        assignBishops();
        assignPawns();
        assignRook();
        assignQueen();
        assignKing();
    }

    private void assignKing() {
        Actor bKing = new King("BH",false);
        Actor wKing = new King("WH",true);

        board[0][3].setActor(wKing);
        board[7][4].setActor(bKing);
    }
    private void assignQueen() {
        Actor bQueen = new Queen("BQ",false);
        Actor wQueen = new Queen("WQ",true);

        board[0][4].setActor(wQueen);
        board[7][3].setActor(bQueen);
    }
    private void assignKnights() {
        Actor knight1 = new Knight("BK",false);
        Actor knight2 = new Knight("BK", false);
        Actor knight3 = new Knight("WK",true);
        Actor knight4 = new Knight("WK",true);

        board[0][1].setActor(knight3);
        board[0][6].setActor(knight4);
        board[7][1].setActor(knight1);
        board[7][6].setActor(knight2);
    }

    private void assignRook() {
        Actor rook1 = new Rook("BR",false);
        Actor rook2 = new Rook("BR", false);
        Actor rook3 = new Rook("WR",true);
        Actor rook4 = new Rook("WR",true);

        board[0][0].setActor(rook3);
        board[0][7].setActor(rook4);
        board[7][0].setActor(rook1);
        board[7][7].setActor(rook2);

    }

    private void assignBishops() {
        Actor bishop1 = new Bishop("BB",false);
        Actor bishop2 = new Bishop("BB", false);
        Actor bishop3 = new Bishop("WB",true);
        Actor bishop4 = new Bishop("WB",true);

        board[0][2].setActor(bishop3);
        board[0][5].setActor(bishop4);
        board[7][2].setActor(bishop1);
        board[7][5].setActor(bishop2);
    }

    private void assignPawns() {
        for(int i=1;i<2;i++) {
            for(int j=0;j<8;j++) {
                Actor pawn = new Pawn("WP" ,true);
                board[i][j].setActor(pawn);

                pawn = new Pawn("BP", false);
                board[8-i-1][j].setActor(pawn);
            }
        }
    }
    public void printBoard() {

        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(board[i][j].getActor() == null)
                    System.out.print("    ");
                else
                    System.out.print(" " + board[i][j].getActor().getName() + " ");
            }

            System.out.println();
        }
    }

    public Boolean makeMove(Position cPosition, Position dePosition) {

        if(cPosition.isEmpty() || (!dePosition.isEmpty() && Moves.isSameTypeActor(cPosition.getActor(),dePosition.getActor()))) {
            System.out.println("Try Again...");
            return false;
        }

        Actor actor = cPosition.getActor();
        System.out.println(actor.getName());

        if(actor.makeMove(board,cPosition, dePosition)) {
            System.out.println("Move Successful");
            return true;
        } 
        System.out.println("Try Again");
        return false;
    }

    public Position getPosition(int x, int y) {
        return board[x][y];
    }
}
