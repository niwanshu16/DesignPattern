package DesignPattern.DecoratorPattern.Shipping.ShippingStrategy;

public class FreeShipping extends Shipping {

    public FreeShipping() {
        description = "Free shipping";
    }
    public double calculateCost(int weight, int distance) {
        return 0;
    }
}
