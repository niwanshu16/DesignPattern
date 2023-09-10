package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.ParkingApplication;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class ParkedSlotsCommand implements Command {
    
    ParkingApplication application;
    Vehicle vehicle;

    public ParkedSlotsCommand(ParkingApplication application) {
        this.application = application;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void execute() {
        application.parkedSlots(vehicle.getVehicleType());
    }

}
