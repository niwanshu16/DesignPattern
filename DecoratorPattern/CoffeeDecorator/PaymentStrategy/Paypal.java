package DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public class Paypal implements PaymentStrategy {
    
    public void doPayment(Beverage beverage) {
        System.out.println("Doing a Payment through Paypal, total cost is " + beverage.cost());
    }
}
