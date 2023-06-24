package DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages;

public class Chocolate extends Beverage {

    public Chocolate() {
        description = "Chocolate";
    }

    public double cost() {
        return 0.99;
    }
    
}
