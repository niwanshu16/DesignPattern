package DesignPattern.ParkingDesign;

public class TestDrive {
    public static void main(String []args) {
        ParkingApplication application = new ParkingApplication(2,5,"PAR1234");
        
        Vehicle car = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        Vehicle car1 = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        Vehicle car2 = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        application.freeSlots(VehicleType.CAR);
        Vehicle truck = new Vehicle(VehicleType.TRUCK,"JDK");
        Vehicle car3 = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        
        Ticket ticket2 = application.parkVehicle(car);
        Ticket ticket1 = application.parkVehicle(truck);
        application.freeSlots(VehicleType.TRUCK);


        application.freeSlots(VehicleType.CAR);
        
        Ticket ticket5 = application.parkVehicle(car1); 
        Ticket ticket6 = application.parkVehicle(car2);
        Ticket ticket7 = application.parkVehicle(car3);
        
    
        application.freeSlots(VehicleType.CAR);
        
        application.unparkVehicle(ticket5);
        application.freeSlots(VehicleType.CAR);
        application.unparkVehicle(ticket1);
        application.unparkVehicle(ticket2);
        application.unparkVehicle(ticket6);
        application.unparkVehicle(ticket7);
        application.parkedSlots(VehicleType.CAR);
    }
}
