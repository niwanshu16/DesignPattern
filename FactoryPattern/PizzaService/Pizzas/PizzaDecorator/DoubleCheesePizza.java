package DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class DoubleCheesePizza extends PizzaDecorator {
    
    Pizza pizza;

    public DoubleCheesePizza(Pizza pizza) {
        this.pizza = pizza;
        name = pizza.getName() + " Double Cheese ";
    }
    public String getName() {
        return name;
    }

    @Override
    public double cost() {
       return pizza.cost() + 2.99;
    }
}
