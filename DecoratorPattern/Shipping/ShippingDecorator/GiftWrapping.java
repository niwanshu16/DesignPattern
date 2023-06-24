package DesignPattern.DecoratorPattern.Shipping.ShippingDecorator;

import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.Shipping;

public class GiftWrapping extends Shipping {

    Shipping shipping;

    public GiftWrapping(Shipping shipping) {
        this.shipping = shipping;
        description = shipping.getDescription() + " Gift wrapped ";
    }
    

    public double calculateCost(int weight, int distance) {
        return shipping.calculateCost(weight, distance) + 20;
    }

}
