package DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public class Cash implements PaymentStrategy {
    
    public void doPayment(Beverage beverage) {
        System.out.println("Making a payment through CASH, total cost is " + beverage.cost());
    }
}
