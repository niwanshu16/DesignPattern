package DesignPattern.AdapterPattern.PaymentGateway;

public class PaymentFacade {
    
    private PaymentGateway paymentGateway;

    public PaymentFacade() {
        this.paymentGateway = new PaymentGatewayAdapter();
    }

    public void makePayment(double amount) {
        paymentGateway.processPayment(amount);
    }

    public void processRefund(String transactionId) {
        paymentGateway.processRefund(transactionId);
    }
    
}
