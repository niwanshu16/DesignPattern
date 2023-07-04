package DesignPattern.CommandPattern;

//Receiver
public class Stereo {
    public void on() {
        System.out.println("Stereo is ON");
    }

    public void setCD() {
        System.out.println("Set the CD");
    }

    public void setVolume(int volume) {
        System.out.println("Set the volume " + volume);
    }

    public void setRadio() {
        System.out.println("Set the radio");
    }

    public void off() {
        System.out.println("Sterio is OFF");
    }

    public void setDVD() {
        System.out.println("Set the DVD");
    }
}
