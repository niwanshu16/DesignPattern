package DesignPattern.FactoryPattern.PizzaService.PizzaStore;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.Chicago.ChicagoStyleCheesePizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    
    public Pizza createPizza(String type) {
        
        if(type.equals("Cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equals("Veggies"))
            return new ChicagoStyleVeggiePizza();
        return null;
    }
}
