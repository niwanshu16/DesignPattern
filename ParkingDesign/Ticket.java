package DesignPattern.ParkingDesign;

public class Ticket {
    
    Slot slot;
    String description;
    
    public Ticket() {
        description = "Ticket ";
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }

    public double getCost() {
        switch(slot.slotType) {
            case TRUCK : return 100.0;
            case BIKE : return 30.0;
            case CAR : return 60.0;
        }
        return 0.0;
    }

    public String getDescription() {
        return description;
    }
}
