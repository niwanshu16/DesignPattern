package DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages;

import DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy.PaymentStrategy;

public abstract class Beverage {
    
    public String description;
    public abstract double cost();
    PaymentStrategy paymentStrategy;

    public String getDescription() {
        return description;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment() {
        paymentStrategy.doPayment(this);
    }
    
}
