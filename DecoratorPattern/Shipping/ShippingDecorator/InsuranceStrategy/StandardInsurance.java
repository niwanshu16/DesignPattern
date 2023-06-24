package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy;

public class StandardInsurance implements InsuranceStrategy {
    String description;
    public StandardInsurance() {
        description = "Standard Insurance ";
    }

    public double calculateCost(int weight, int distance) {
        return (weight*distance*0.5*100)/100;
    }

    public String getDescription() {
        return description;
    }
}
