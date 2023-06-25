package DesignPattern.FactoryPattern.PizzaService.PizzaStore;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.NewYork.NYStyleCheesePizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.NewYork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    
    public Pizza createPizza(String type) {

        if(type.equals("Cheese"))
            return new NYStyleCheesePizza();
        else if(type.equals("Veggies"))
            return new NYStyleVeggiePizza();
        return null;
    }
}
