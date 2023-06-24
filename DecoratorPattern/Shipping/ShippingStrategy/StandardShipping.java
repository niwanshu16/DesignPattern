package DesignPattern.DecoratorPattern.Shipping.ShippingStrategy;

public class StandardShipping extends Shipping {
    
    public StandardShipping() {
        description = "Standard Shipping";
    }
    
    public double calculateCost(int weight, int distance) {
        return ((weight*(distance)*0.05)*100/100);
    }

}
