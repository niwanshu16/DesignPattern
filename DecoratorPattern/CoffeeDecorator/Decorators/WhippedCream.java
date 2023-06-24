package DesignPattern.DecoratorPattern.CoffeeDecorator.Decorators;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public class WhippedCream extends CondimentDecorator {
    
    Beverage beverage;
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + " Whipped Cream";
    }

    public double cost() {
        return ((beverage.cost() + 1.2)*100/100);
    }

    public String getDescription() {
        return description;
    }

}
