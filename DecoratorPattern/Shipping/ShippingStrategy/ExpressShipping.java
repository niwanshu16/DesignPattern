package DesignPattern.DecoratorPattern.Shipping.ShippingStrategy;

public class ExpressShipping extends Shipping {

    public ExpressShipping() {
        description = "Express Shipping";
    }
    
    public double calculateCost(int weight, int distance) {
        return ((weight*(distance)*0.1)*100/100);
    }

}
