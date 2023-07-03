package DesignPattern.CommandPattern;

public class GarageDoorOnCommand implements Command{
    
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.on();
    }
}
