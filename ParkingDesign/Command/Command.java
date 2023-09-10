package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public interface Command {
    
    public void execute();
    public void setVehicle(Vehicle vehicle);
    
}
