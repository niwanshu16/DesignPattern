package DesignPattern.DecoratorPattern.CoffeeDecorator;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;
import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Chocolate;
import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Mocha;
import DesignPattern.DecoratorPattern.CoffeeDecorator.Decorators.DoubleMilk;
import DesignPattern.DecoratorPattern.CoffeeDecorator.Decorators.WhippedCream;
import DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy.Cash;
import DesignPattern.DecoratorPattern.CoffeeDecorator.PaymentStrategy.Paypal;

public class Test {
    
    public static void main(String[] args) {
        Beverage beverage = new Mocha();
        beverage = new DoubleMilk(beverage);
        beverage = new WhippedCream(beverage);
        beverage.setPaymentStrategy(new Paypal());
        
        System.out.println("Alice Ordered \nDescription: " + beverage.getDescription() + " Cost is : " + beverage.cost() );
        beverage.doPayment();
     
        beverage = new Chocolate();
        beverage = new DoubleMilk(beverage);
        beverage = new WhippedCream(beverage);

        System.out.println("Alice Ordered \nDescription: " + beverage.getDescription() + " Cost is : " + beverage.cost() );
        beverage.setPaymentStrategy(new Cash());
        beverage.doPayment();

    }
}
