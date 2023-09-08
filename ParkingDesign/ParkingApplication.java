package DesignPattern.ParkingDesign;

public class ParkingApplication {
    
    ParkingManager parkingManager;
    String parkingID;
    int maxFloors;
    int numSlots;

    
    public ParkingApplication(int numFloors, int numSlots, String parkingID) {
        this.maxFloors = numFloors;
        this.numSlots = numSlots;
        this.parkingID = parkingID;
        parkingManager = ParkingManager.getInstance(parkingID, numFloors, numSlots);
    }
    

    public Ticket parkVehicle(Vehicle vehicle) {
        Ticket ticket =  parkingManager.parkVehicle(vehicle);
        
        if(ticket == null)
            System.out.println("No Available Slot");
        else {
            System.out.println("-----------Parking Vehicle --------------");
            System.out.println(vehicle.showDetail());
            ticket.getSlot().slotDetail();
            System.out.println("-----------------------------------------");
        }

        return ticket;
    }
    
    public void freeSlots(VehicleType vehicleType) {
        parkingManager.freeSlots(vehicleType);
    }

    public void parkedSlots(VehicleType vehicleType) {
        parkingManager.parkedSlots(vehicleType);
    }

    public void unparkVehicle(Ticket ticket) {
        System.out.println("-----------Unpark Vehicle --------------");
        Slot slot = parkingManager.unparkVehicle(ticket);
        slot.slotDetail();
        System.out.println("-----------------------------------------");
    }
}
