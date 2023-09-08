package DesignPattern.ParkingDesign;

public class Ticket {
    
    Slot slot;

    public Ticket(Slot slot) {
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }
}
