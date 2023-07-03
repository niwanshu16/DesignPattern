package DesignPattern.CommandPattern;

public class TestRemoteControl {
    
    public static void main(String []args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOffCommand);
        remote.buttonWasPressed();

    }
}
