package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy;

public class ZeroDepthInsurance implements InsuranceStrategy {
    String description;
    public ZeroDepthInsurance() {
        description = "Zero Depth Insurance ";
    }

    public double calculateCost(int weight, int distance) {
        return (weight*distance*0.8*100)/100 + 1000;
    }

    public String getDescription() {
        return description;
    }
}
