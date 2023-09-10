package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.ParkingApplication;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class UnparkVehicleCommand implements Command {
    
    Vehicle vehicle;
    ParkingApplication application;

    public UnparkVehicleCommand(ParkingApplication application) {
        this.application = application;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        application.unparkVehicle(vehicle);
    }
}
