package DesignPattern.ParkingDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class ParkingManager {
    
    private volatile static ParkingManager uniqueInstance = null;
    String parkingID;
    int maxFloors;
    HashMap<Vehicle,Slot> parkedVehicle;
    List<Slot> bookedSlots;
    int availableSlots, totalSlots;
    List<Floor> allFloors;

    private ParkingManager(String parkingID, int maxFloors) {
        this.parkingID = parkingID;
        this.maxFloors = maxFloors;
        allFloors = new ArrayList<>();
        parkedVehicle = new HashMap<>();
        bookedSlots = new ArrayList<>();
        totalSlots = maxFloors*5;
        availableSlots = maxFloors*5;
        for(int i=1;i<=maxFloors;i++) {
            Floor floor = new Floor(5,parkingID + "_" + i);
            allFloors.add(floor);
        }
    }

    public static ParkingManager getInstance(String parkingID, int maxFloors) {

        if(uniqueInstance == null) {
            uniqueInstance = new ParkingManager(parkingID, maxFloors);
        } 
        return uniqueInstance;
    }

    public Slot parkVehicle(Vehicle vehicle) {
        Slot slot = null;

        for(Floor floor : allFloors) {
            slot = floor.getAvailableSlot(vehicle.vehicleType);
            if(slot != null) {
                slot.setStatus(SlotStatus.OCCUPIED);
                parkedVehicle.put(vehicle,slot);
                availableSlots -= 1;
                bookedSlots.add(slot);
                return slot;
            }
        }
        return slot;
    }

    public int freeSlots() {
        return availableSlots;
    }

    public int parkedSlots() {
        return totalSlots - availableSlots;
    }

    public Slot unparkVehicle(Vehicle vehicle) {
        Slot slot = parkedVehicle.get(vehicle);
        parkedVehicle.remove(vehicle);
        slot.setStatus(SlotStatus.VACANT);
        availableSlots++;
        bookedSlots.remove(slot);
        return slot;
    }
}
