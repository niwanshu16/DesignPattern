package DesignPattern.CommandPattern.RemoteControl;

public class StereoOffWithCommand implements Command {
    
    Stereo stereo;

    public StereoOffWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
