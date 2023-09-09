package DesignPattern.ParkingDesign;

public class PressureCheckServicePriceCalculation extends Service {
    
    Ticket service;
    public PressureCheckServicePriceCalculation(Ticket service) {
        
        description = " Pressure Check Service ";
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
            case TRUCK : return 50.0;
            case BIKE : return 10.0;
            case CAR : return 30.0;
        }
        return 0.0;
    }

}
