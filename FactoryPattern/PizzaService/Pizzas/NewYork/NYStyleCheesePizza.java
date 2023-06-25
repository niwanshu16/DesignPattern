package DesignPattern.FactoryPattern.PizzaService.Pizzas.NewYork;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class NYStyleCheesePizza extends Pizza {
    
    public NYStyleCheesePizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = "The Crust dough";
        sauce = "Marinara Sauce";
        description = "NY Style Cheese Pizza ";

        toppings.add("Grated Raggiano Cheese");
    }

    public double cost() {
        return 12;
    }
}
