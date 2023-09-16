package DesignPattern.ChessValidator;

import DesignPattern.ChessValidator.Actors.Actor;

public class Position {
    
    private int x, y;
    String name;
    Actor actor;
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

    public void setActor(Actor actor)  {
        this.actor = actor;
        empty = false;
    }

    public void vacantPosition() {
        actor = null;
        empty = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Actor getActor() {
        return actor;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public String getName() {
        return name;
    }
}
