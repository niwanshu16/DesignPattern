package DesignPattern.ParkingDesign;

public class CleaningServicePriceCalculation extends Service {
    
    Ticket service;
    public CleaningServicePriceCalculation(Ticket service) {
        description = "Cleaning Service ";
        slot = service.getSlot();
        this.service = service;
    }

    public double getCost() {
        return service.getCost() + findCost();
    }

    public String getDescription() {
        return service.getDescription() + description;
    }

    public double findCost() {
        switch(slot.slotType) {
            case TRUCK : return 2000.0;
            case BIKE : return 500.0;
            case CAR : return 1200.0;
        }
        return 0.0;
    }
}
