package DesignPattern.CommandPattern;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setDVD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }

}
