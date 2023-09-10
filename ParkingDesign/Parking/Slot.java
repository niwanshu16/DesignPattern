package DesignPattern.ParkingDesign.Parking;

import DesignPattern.ParkingDesign.Vehicle.VehicleType;

public class Slot {
    
    SlotStatus slotStatus;
    String slotID;
    VehicleType slotType;

    public Slot(String slotID, VehicleType slotType) {
        slotStatus = SlotStatus.VACANT;
        this.slotID = slotID;
        this.slotType = slotType;
    }

    public void setStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public SlotStatus getStatus() {
        return slotStatus;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public void slotDetail() {
        System.out.println("SLOT ID " + slotID + " Slot Status " + slotStatus + " Slot Type " + slotType) ;
    }
}
