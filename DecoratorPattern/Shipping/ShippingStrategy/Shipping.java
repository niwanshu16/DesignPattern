package DesignPattern.DecoratorPattern.Shipping.ShippingStrategy;

public abstract class Shipping {

    public String description;

    public String getDescription() {
        return description;
    }

    public abstract double calculateCost(int weight, int distance);

}
