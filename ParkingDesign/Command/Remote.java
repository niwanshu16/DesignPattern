package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class Remote {
    
    Command command;

    public void setCommand(Command command, Vehicle vehicle) {
        this.command = command;
        this.command.setVehicle(vehicle);
    }
    
    public void buttonWasPressed() {
        command.execute();
    }

    public void execute(Command command, Vehicle vehicle) {
        setCommand(command, vehicle);
        buttonWasPressed();
    }
}
