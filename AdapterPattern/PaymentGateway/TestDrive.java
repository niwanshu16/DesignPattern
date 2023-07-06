package DesignPattern.AdapterPattern.PaymentGateway;

public class TestDrive {
    
    public static void main(String []args) {

        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.makePayment(25.50);
        paymentFacade.processRefund("XDC432");
        
    }
}
