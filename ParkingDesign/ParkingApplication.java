package DesignPattern.ParkingDesign;

public class ParkingApplication {
    
    ParkingManager parkingManager;
    String parkingID;
    int maxFloors;
    public ParkingApplication() {
        parkingID = "PAR";
        maxFloors = 5;
        parkingManager = ParkingManager.getInstance(parkingID,maxFloors);
    }

    public void parkVehicle(Vehicle vehicle) {
        Slot slot =  parkingManager.parkVehicle(vehicle);
        if(slot != null)
            slot.slotDetail();
        else
            System.out.println("No Available Slot");
    }
    
    public void availableSlots() {
        int res =  parkingManager.freeSlots();
        System.out.println("Available Slots " + res);
    }

    public void parkedSlots() {
        int res =  parkingManager.parkedSlots();
        System.out.println("Parked Slots  " + res);
    }

    public void unparkVehicle(Vehicle vehicle) {
        Slot slot = parkingManager.unparkVehicle(vehicle);
        slot.slotDetail();
    }
}
