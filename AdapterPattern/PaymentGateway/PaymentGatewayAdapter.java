package DesignPattern.AdapterPattern.PaymentGateway;

public class PaymentGatewayAdapter implements PaymentGateway {
    
    private LegacyPaymentGateway legacyPaymentGateway;

    public PaymentGatewayAdapter() {
        this.legacyPaymentGateway = new LegacyPaymentGateway();
    }

    public void processPayment(double amount) {
        legacyPaymentGateway.connect();
        legacyPaymentGateway.processPayment(amount);
    }

    public void processRefund(String transactionId) {
        legacyPaymentGateway.connect();
        legacyPaymentGateway.processRefund(transactionId);
    }
}
