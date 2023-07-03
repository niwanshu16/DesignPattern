package DesignPattern.CommandPattern;

public class TestRemoteControl {
    
    public static void main(String []args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();
    }
}
