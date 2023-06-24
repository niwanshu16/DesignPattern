package DesignPattern.DecoratorPattern.CoffeeDecorator.Decorators;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public class DoubleMilk extends CondimentDecorator {
    
    Beverage beverage;

    public DoubleMilk(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.description + " Double Milk";
    }

    public double cost() {
        return ((beverage.cost() + 0.99)*100)/100;
    }

    public String getDescription() {
        return description;
    }
}
