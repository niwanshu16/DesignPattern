package DesignPattern.ParkingDesign;

import DesignPattern.ParkingDesign.Parking.Slot;
import DesignPattern.ParkingDesign.PaymentStrategy.CreditCardPaymentStrategy;
import DesignPattern.ParkingDesign.PaymentStrategy.PaymentStrategy;
import DesignPattern.ParkingDesign.PaymentStrategy.UPIPaymentStrategy;
import DesignPattern.ParkingDesign.TicketService.CleaningServicePriceCalculation;
import DesignPattern.ParkingDesign.TicketService.PressureCheckServicePriceCalculation;
import DesignPattern.ParkingDesign.TicketService.Ticket;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;
import DesignPattern.ParkingDesign.Vehicle.VehicleType;
import java.util.HashMap;

public class ParkingApplication {
    
    ParkingManager parkingManager;
    String parkingID;
    int maxFloors;
    int numSlots;
    HashMap<Vehicle,Ticket> ticketMapping;
    
    public ParkingApplication(int numFloors, int numSlots, String parkingID) {
        this.maxFloors = numFloors;
        this.numSlots = numSlots;
        this.parkingID = parkingID;
        ticketMapping = new HashMap<>();
        parkingManager = ParkingManager.getInstance(parkingID, numFloors, numSlots);
    }
    

    public void parkVehicle(Vehicle vehicle) {
        Ticket ticket =  parkingManager.parkVehicle(vehicle);
        
        if(ticket == null)
            System.out.println("No Available Slot");
        else {
            ticketMapping.put(vehicle,ticket);
            System.out.println("-----------Parking Vehicle --------------");
            System.out.println(vehicle.showDetail());
            ticket.getSlot().slotDetail();
            System.out.println("-----------------------------------------");
        }

        return; 
    }
    
    public void freeSlots(VehicleType vehicleType) {
        parkingManager.freeSlots(vehicleType);
    }

    public void parkedSlots(VehicleType vehicleType) {
        parkingManager.parkedSlots(vehicleType);
    }

    public void unparkVehicle(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);
        ticketMapping.remove(vehicle);
        System.out.println("-----------Unpark Vehicle --------------");
        Slot slot = parkingManager.unparkVehicle(ticket);
        slot.slotDetail();
        System.out.println("-----------------------------------------");
    }

    public void findCost(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);

        System.out.println("Total cost " + vehicle.showVehicle());
        System.out.println(" Description : " + ticket.getDescription() +   " Amount: " + ticket.getCost());
    }

    public void cleaningService(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);
        ticket = new CleaningServicePriceCalculation(ticket);
        ticketMapping.put(vehicle,ticket);
    }


    public void pressureCheckService(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);
        ticket = new PressureCheckServicePriceCalculation(ticket);
        ticketMapping.put(vehicle,ticket);
    }

    public void creditCardPayment(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);
        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy(ticket);
        paymentStrategy.makePayment();
    }

    public void upiCardPayment(Vehicle vehicle) {
        Ticket ticket = ticketMapping.get(vehicle);
        PaymentStrategy paymentStrategy = new UPIPaymentStrategy(ticket);
        paymentStrategy.makePayment();
    }
}
