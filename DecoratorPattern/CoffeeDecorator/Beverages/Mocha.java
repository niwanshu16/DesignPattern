package DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages;

public class Mocha extends Beverage{
    
    public Mocha() {
        description = "Mocha";
    }

    public double cost() {
        return 1.99;
    }
}
