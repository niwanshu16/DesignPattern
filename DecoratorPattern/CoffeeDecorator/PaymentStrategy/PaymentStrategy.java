package DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public interface PaymentStrategy {
    
    public void doPayment(Beverage beverage);

}
