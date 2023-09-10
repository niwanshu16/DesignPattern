package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.ParkingApplication;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class PressureCheckServiceCommand implements Command {

    ParkingApplication parkingApplication;
    Vehicle vehicle;
    public PressureCheckServiceCommand(ParkingApplication parkingApplication) {
        this.parkingApplication = parkingApplication;
    }

    @Override
    public void execute() {
        parkingApplication.pressureCheckService(vehicle);
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
