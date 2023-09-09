package DesignPattern.ParkingDesign;

public class UPIPaymentStrategy extends PaymentStrategy {
    
    Ticket ticket;

    public UPIPaymentStrategy(Ticket ticket) {
        this.ticket = ticket;
    }
    public void makePayment() {
        ticket.getDescription();
        System.out.println("Making the payment through UPI, Amount " + ticket.getCost());
    }
}
