package DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class ExtraVeggies extends Pizza {
    
    Pizza pizza;
    public ExtraVeggies(Pizza pizza) {
        this.pizza = pizza;
        name = pizza.getName() + "Extra Veggies";
    }

    public String getName() {
        return name;
    }

    public double cost() {
        return pizza.cost() + 3.49;
    }
}
