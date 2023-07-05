package DesignPattern.CommandPattern.RemoteControl;

//Receiver
public class GarageDoor {
    
    public void on() {
        System.out.println("Opening the garage door");
    }

    public void off() {
        System.out.println("Closing the garage door");
    }
}
