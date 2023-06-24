package DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public class CreditCard implements PaymentStrategy {
    
    public void doPayment(Beverage beverage) {
        System.out.println("Making a payment through Credit Card, total cost is " + beverage.cost() );
    }
}
