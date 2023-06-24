package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy;

public interface InsuranceStrategy {
    public double calculateCost(int weight, int distance);
    public String getDescription();
}
