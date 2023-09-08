package DesignPattern.ParkingDesign;

import java.util.List;
import java.util.ArrayList;

public class Floor {
    
    String floorID;
    int maxSlots;
    
    List<Slot> allSlots;
    
    public Floor(int maxSlots, String floorID) {
        this.maxSlots = maxSlots;
        this.floorID = floorID;
        allSlots = new ArrayList<>();
        
        
        for(int i=1;i<=maxSlots;i++) {
            Slot slot = null;
            String id = floorID  + "_" + i;
            if(i == 1) {
                slot = new Slot(id, VehicleType.TRUCK);
            }
            else if(i <= 2) {
                slot = new Slot(id,VehicleType.BIKE);
            }
            else {
                slot = new Slot(id, VehicleType.CAR);
            }
            allSlots.add(slot);
        }
    }

     

    public Slot getAvailableSlot(VehicleType vehicleType) {
        
        for(Slot slot : allSlots) {
            if(slot.getStatus() == SlotStatus.VACANT && slot.slotType == vehicleType) {
                return slot;
            }
        }

        return null;
    }

    public void freeSlots(VehicleType vehicleType) {
    
        int res = 0;

        for(Slot slot : allSlots) {
            if(slot.slotType == vehicleType && slot.slotStatus == SlotStatus.VACANT)
                res++;
        }
        System.out.println("Vacant Slots " + vehicleType + " at Floor " + floorID + " is : " + res);
        
    }

    public void parkedSlots(VehicleType vehicleType) {
        int res = 0;
        for(Slot slot : allSlots) {
            if(slot.slotType == vehicleType && slot.slotStatus == SlotStatus.OCCUPIED)
                res++;
        }
        System.out.println("Occupied Slots " + vehicleType + " at Floor " + floorID + " is : " + res);
    }
}
