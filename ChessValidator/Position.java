package DesignPattern.ChessValidator;

import DesignPattern.ChessValidator.Actors.Actor;

public class Position {
    
    private int x, y;
    String name;
    Actor pawn;
    Boolean empty;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        empty = true;
    }

    public Position(String a) {
        this.name = a;
    }

    public Boolean isEmpty() {
        return empty;
    }

    public void setActor(Actor pawn)  {
        this.pawn = pawn;
        empty = false;
    }

    public void vacantPosition() {
        pawn = null;
        empty = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Actor getActor() {
        return pawn;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public String getName() {
        return name;
    }
}
