package DesignPattern.CommandPattern.RemoteControl;

public class GarageDoorOnCommand implements Command{
    
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.on();
    }

    public void undo() {
        garageDoor.off();
    }
}
