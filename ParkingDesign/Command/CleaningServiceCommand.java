package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.ParkingApplication;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class CleaningServiceCommand implements Command{
    
    ParkingApplication application;
    Vehicle vehicle;

    public CleaningServiceCommand(ParkingApplication application) {
        this.application = application;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void execute() {
        application.cleaningService(vehicle);
    }

}
