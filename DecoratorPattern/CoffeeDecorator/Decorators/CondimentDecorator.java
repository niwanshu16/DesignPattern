package DesignPattern.DecoratorPattern.CoffeeDecorator.Decorators;

import DesignPattern.DecoratorPattern.CoffeeDecorator.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
