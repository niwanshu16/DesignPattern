package DesignPattern.ParkingDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    
    private volatile static ParkingManager uniqueInstance = null;
    String parkingID;
    int maxFloors;
    List<Slot> bookedSlots;
    
    List<Floor> allFloors;

    private ParkingManager(String parkingID, int maxFloors, int numSlots) {
        this.parkingID = parkingID;
        this.maxFloors = maxFloors;
        allFloors = new ArrayList<>();
        bookedSlots = new ArrayList<>();
        
        for(int i=1;i<=maxFloors;i++) {
            Floor floor = new Floor(numSlots,parkingID + "_" + i);
            allFloors.add(floor);
        }
    }

    public static ParkingManager getInstance(String parkingID, int maxFloors, int numSlots) {

        if(uniqueInstance == null) {
            uniqueInstance = new ParkingManager(parkingID, maxFloors, numSlots);
        } 
        return uniqueInstance;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        Slot slot = null;

        for(Floor floor : allFloors) {
            slot = floor.getAvailableSlot(vehicle.vehicleType);
            if(slot != null) {
                Ticket ticket = new Ticket(slot);
                slot.setStatus(SlotStatus.OCCUPIED);
                bookedSlots.add(slot);
                return ticket;
            }
        }
        return null;
    }

    public void freeSlots(VehicleType vehicleType) {
        
        for(Floor floor : allFloors) {
            floor.freeSlots(vehicleType);
        }
    }

    public void parkedSlots(VehicleType type) {
        
        for(Floor floor : allFloors) {
            floor.parkedSlots(type);
        }

    }

    public Slot unparkVehicle(Ticket ticket) {
        Slot slot = ticket.getSlot();
        slot.setStatus(SlotStatus.VACANT);
        bookedSlots.remove(slot);
        return slot;
    }
}
