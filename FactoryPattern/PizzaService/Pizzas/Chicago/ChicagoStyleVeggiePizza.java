package DesignPattern.FactoryPattern.PizzaService.Pizzas.Chicago;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Double Thick crust Veg Pizza";
        dough = "Double thick crust";
        sauce = "Jalpaeno sauce";
        description = "Chicago Style Veggie Pizza";
        
        toppings.add("Porm Mushroom Onion");
    }

    public double cost() {
        return 6.5;
    }
}
