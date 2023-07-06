package DesignPattern.AdapterPattern.PaymentGateway;

public class LegacyPaymentGateway {
    
    public void connect() {
        System.out.println("Legacy Payment Gateway Connected");
    }

    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed through Legacy Payment Gateway");
    }

    public void processRefund(String transactionId) {
        System.out.println("Refund for transaction ID " + transactionId + " processed through Legacy Payment Gateway");
    }
}
