package DesignPattern.AdapterPattern.PaymentGateway;

public interface PaymentGateway {
    
    public void processPayment(double amount);
    public void processRefund(String transactionId);
    
}
