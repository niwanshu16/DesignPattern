package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator;

import DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy.InsuranceStrategy;
import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.Shipping;

public class InsuranceDecorator extends ShippingDecorator {
    Shipping shipping;
    InsuranceStrategy insuranceStrategy;
    public InsuranceDecorator(Shipping shipping) {
        this.shipping = shipping;
        description = shipping.getDescription() + " Insurance covered ";
    }

    public void setInsuranceStrategy(InsuranceStrategy insuranceStrategy) {
        this.insuranceStrategy = insuranceStrategy;
        description += insuranceStrategy.getDescription();
    }
    public double calculateCost(int weight, int distance) {
        return insuranceStrategy.calculateCost(weight, distance);
    }
}
