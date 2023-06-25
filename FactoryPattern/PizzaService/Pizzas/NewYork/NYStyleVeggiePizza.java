package DesignPattern.FactoryPattern.PizzaService.Pizzas.NewYork;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza with Thin crust";
        dough = "Thin crust dough";
        sauce = "Tomato Veggie";
        description = "NY Style Veggie Pizza";
        
        toppings.add("Mushrrom Onion Spices Chilli");
    }

    @Override
    public double cost() {
        return 13;
    }
}
