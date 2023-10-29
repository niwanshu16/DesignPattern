package DesignPattern.OrderProcessing.Order;

public abstract class AmountDecorator extends OrderManager {
    
    String description;
    abstract double calculateAmount();

    public String getDescription() {
        return description;
    }
}
