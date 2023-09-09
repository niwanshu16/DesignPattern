package DesignPattern.ParkingDesign;

import DesignPattern.ParkingDesign.PaymentStrategy.CreditCardPaymentStrategy;
import DesignPattern.ParkingDesign.PaymentStrategy.PaymentStrategy;
import DesignPattern.ParkingDesign.PaymentStrategy.UPIPaymentStrategy;
import DesignPattern.ParkingDesign.TicketService.CleaningServicePriceCalculation;
import DesignPattern.ParkingDesign.TicketService.PressureCheckServicePriceCalculation;
import DesignPattern.ParkingDesign.TicketService.Ticket;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;
import DesignPattern.ParkingDesign.Vehicle.VehicleType;

public class Client {
    public static void main(String []args) {
        ParkingApplication application = new ParkingApplication(2,5,"PAR1234");
        
        Vehicle car = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        Vehicle truck = new Vehicle(VehicleType.TRUCK, "RJ-17 HB 0987");

        Ticket ticket = application.parkVehicle(car);
        Ticket ticket1 = application.parkVehicle(truck);
        
        
        ticket = new CleaningServicePriceCalculation(ticket);
        ticket = new PressureCheckServicePriceCalculation(ticket);

        System.out.println(ticket.getDescription());
        System.out.println(ticket.getCost());
        
        ticket1 = new CleaningServicePriceCalculation(ticket1);

        System.out.println(ticket1.getDescription());
        System.out.println(ticket1.getCost());

        application.freeSlots(VehicleType.CAR);

        PaymentStrategy creditCard = new CreditCardPaymentStrategy(ticket);
        PaymentStrategy upi = new UPIPaymentStrategy(ticket1);

        creditCard.makePayment();
        upi.makePayment();
        
        application.unparkVehicle(ticket1);
        application.unparkVehicle(ticket);

        application.freeSlots(VehicleType.CAR);
    }
}
