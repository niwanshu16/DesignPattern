package DesignPattern.CommandPattern;

//Client
public class TestRemoteControl {
    
    public static void main(String []args) {

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCommand stereoOffWithCommand = new StereoOffWithCommand(stereo);


        RemoteControl remote = new RemoteControl();
        
        remote.setCommand(0, garageDoorOnCommand, garageDoorOffCommand);
        remote.setCommand(1, lightOnCommand, lightOffCommand);
        remote.setCommand(2, stereoOnWithCDCommand, stereoOffWithCommand);

        for(int i=0;i<3;i++) {
            remote.onButtonWasPressed(i);
            remote.offButtonWasPressed(i);
        }
        
        System.out.println("UNDO BUTTON");
        remote.undoButtonWasPressed();
    }
}
