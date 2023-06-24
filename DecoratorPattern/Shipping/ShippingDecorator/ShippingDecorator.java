package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator;

import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.Shipping;

public abstract class ShippingDecorator extends Shipping{
    
    public abstract double calculateCost(int weight, int distance);

}
