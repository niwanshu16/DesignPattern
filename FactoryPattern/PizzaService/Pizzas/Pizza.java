package DesignPattern.FactoryPattern.PizzaService.Pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    
    public String description;
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing Daugh... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings");
        for(String topping: toppings) {
            System.out.println("    " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 ");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
