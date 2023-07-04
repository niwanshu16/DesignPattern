package DesignPattern.CommandPattern;

public class StereoOffWithCommand implements Command {
    
    Stereo stereo;

    public StereoOffWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
