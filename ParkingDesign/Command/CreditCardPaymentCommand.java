package DesignPattern.ParkingDesign.Command;

import DesignPattern.ParkingDesign.ParkingApplication;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;

public class CreditCardPaymentCommand implements Command{
    
    ParkingApplication application;
    Vehicle vehicle;

    public CreditCardPaymentCommand(ParkingApplication application) {
        this.application = application;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void execute() {
        application.creditCardPayment(vehicle);
    }
}
