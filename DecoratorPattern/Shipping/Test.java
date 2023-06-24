package DesignPattern.DecoratorPattern.Shipping;

import DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.GiftWrapping;
import DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceDecorator;
import DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy.StandardInsurance;
import DesignPattern.DecoratorPattern.Shipping.ShippingDecorator.InsuranceStrategy.ZeroDepthInsurance;
import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.ExpressShipping;
import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.FreeShipping;
import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.Shipping;
import DesignPattern.DecoratorPattern.Shipping.ShippingStrategy.StandardShipping;

public class Test {
    
    public static void main(String args[] ) {

        Shipping shipping = new ExpressShipping();
        shipping = new GiftWrapping(shipping);
        InsuranceDecorator insuranceDecorator = new InsuranceDecorator(shipping);
        insuranceDecorator.setInsuranceStrategy(new ZeroDepthInsurance());
        shipping = insuranceDecorator;

        System.out.println("Description: " + shipping.getDescription() + "\nCost: " + shipping.calculateCost(3,6));

    }
}
