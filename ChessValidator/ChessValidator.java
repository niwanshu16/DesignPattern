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
    
    Position board[][] = new Position[10][10];

    public void initializeBoard() {
        for(int i=0;i<=9;i++) {

            board[0][i] = new Position(i == 0 || i == 9?" ":i + "");
            board[9][i] = new Position(i == 0 || i == 9?" ":i + "");
            board[i][0] = new Position(i == 0 || i == 9?" ":i + "");
            board[i][9] = new Position(i == 0 || i == 9?" ":i + "");
        }

        for(int i=1;i<=8;i++) {
            for(int j=1;j<=8;j++) {
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

        board[1][4].setActor(wKing);
        board[8][5].setActor(bKing);
    }
    private void assignQueen() {
        Actor bQueen = new Queen("BQ",false);
        Actor wQueen = new Queen("WQ",true);

        board[1][5].setActor(wQueen);
        board[8][4].setActor(bQueen);
    }
    private void assignKnights() {
        Actor knight1 = new Knight("BK",false);
        Actor knight2 = new Knight("BK", false);
        Actor knight3 = new Knight("WK",true);
        Actor knight4 = new Knight("WK",true);

        board[1][2].setActor(knight3);
        board[1][7].setActor(knight4);
        board[8][2].setActor(knight1);
        board[8][7].setActor(knight2);
    }

    private void assignRook() {
        Actor rook1 = new Rook("BR",false);
        Actor rook2 = new Rook("BR", false);
        Actor rook3 = new Rook("WR",true);
        Actor rook4 = new Rook("WR",true);

        board[1][1].setActor(rook3);
        board[1][8].setActor(rook4);
        board[8][1].setActor(rook1);
        board[8][8].setActor(rook2);

    }

    private void assignBishops() {
        Actor bishop1 = new Bishop("BB",false);
        Actor bishop2 = new Bishop("BB", false);
        Actor bishop3 = new Bishop("WB",true);
        Actor bishop4 = new Bishop("WB",true);

        board[1][3].setActor(bishop3);
        board[1][6].setActor(bishop4);
        board[8][3].setActor(bishop1);
        board[8][6].setActor(bishop2);
    }

    private void assignPawns() {
        for(int i=2;i<3;i++) {
            for(int j=1;j<=8;j++) {
                Actor pawn = new Pawn("WP" ,true);
                board[i][j].setActor(pawn);

                pawn = new Pawn("BP", false);
                board[10-i-1][j].setActor(pawn);
            }
        }
    }
    public void printBoard() {

        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {

                if(i == 0 || i == 9 || j == 0 || j == 9) {
                    System.out.print(" " + board[i][j].getName() + "  ");
                }
                else if(board[i][j].getActor() != null)
                    System.out.print("|" + board[i][j].getActor().getName() + "|");
                else
                System.out.print("|  |");
            }

            System.out.println();
        }
    }

    public Integer makeMove(Position cPosition, Position dePosition, Integer l) {

        if(cPosition.isEmpty() || (!dePosition.isEmpty() && Moves.isSameTypeActor(cPosition.getActor(),dePosition.getActor())) || 
            (l == 0 && !cPosition.getActor().isWhite()) || (l == 1 && cPosition.getActor().isWhite())) {
            System.out.println("Try Again...");
            return 0;
        }

        Actor actor = cPosition.getActor();

        Integer out = actor.makeMove(board,cPosition, dePosition);

        if(out == 1) 
            System.out.println("Move Successful");
        else if(out == 0)
            System.out.println("Try Again");

        return out;
    }

    public Position getPosition(int x, int y) {
        return board[x][y];
    }
}
