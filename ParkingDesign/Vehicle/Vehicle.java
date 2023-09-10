package DesignPattern.ParkingDesign.Vehicle;

public class Vehicle {

    String regNo;
    VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType, String regNo) {
        this.regNo = regNo;
        this.vehicleType = vehicleType;
    }

    public String showVehicle() {
        return "Vehicle Type " + vehicleType + " Registration Number " + regNo;
    }
    
    public String showDetail() {
        return vehicleType + "---->" + regNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
