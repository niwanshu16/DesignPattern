package DesignPattern.ParkingDesign;

public class CreditCardPaymentStrategy extends PaymentStrategy{
    Ticket ticket;

    public CreditCardPaymentStrategy(Ticket ticket) {
        this.ticket = ticket;
    }
    public void makePayment() {
        ticket.getDescription();
        System.out.println("Making the payment through Credit Card, Amount " + ticket.getCost());
    }
}
