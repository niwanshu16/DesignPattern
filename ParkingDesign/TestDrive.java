package DesignPattern.ParkingDesign;

public class TestDrive {
    
    public static void main(String []args) {
        ParkingApplication application = new ParkingApplication();
        Vehicle truck = new Vehicle(VehicleType.TRUCK,"RJ-14 KV 7857");
        Vehicle car = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        application.parkVehicle(truck);
        
        application.availableSlots();
        application.parkVehicle(car);

        application.availableSlots();
        application.parkedSlots();

        application.unparkVehicle(truck);
        application.availableSlots();
        application.parkedSlots();
        
    }
}
