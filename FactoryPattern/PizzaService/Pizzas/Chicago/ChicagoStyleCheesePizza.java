package DesignPattern.FactoryPattern.PizzaService.Pizzas.Chicago;

import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
    
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Extra Thick crust daugh";
        sauce = "Plum Tomato Sauce";
        description = "Chicago Style Cheese Pizza";
        
        toppings.add("Shredded Mozarella Cheese");

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    public double cost() {
        return 6.00;
    }
}
