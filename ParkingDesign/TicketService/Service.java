package DesignPattern.ParkingDesign.TicketService;

import DesignPattern.ParkingDesign.Parking.Slot;

public abstract class Service extends Ticket {
    String description;
    double cost;
    Slot slot;
    public abstract double getCost();

    public String getDescription() {
        return description;
    }

    public Slot getSlot() {
        return slot;
    }
}
