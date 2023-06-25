package DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class LargeHandTossed extends PizzaDecorator {
    
    Pizza pizza;
    public LargeHandTossed(Pizza pizza) {
        this.pizza = pizza;
        name = pizza.getName() + " Large Hand Tossed";
    }

    public String getName() {
        return name;
    }

    public double cost() {
        return pizza.cost() + 4;
    }
}
