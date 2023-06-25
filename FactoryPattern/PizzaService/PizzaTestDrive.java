package DesignPattern.FactoryPattern.PizzaService;

import DesignPattern.FactoryPattern.PizzaService.PizzaStore.ChicagoPizzaStore;
import DesignPattern.FactoryPattern.PizzaService.PizzaStore.NYPizzaStore;
import DesignPattern.FactoryPattern.PizzaService.PizzaStore.PizzaStore;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.Pizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator.DoubleCheesePizza;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator.ExtraVeggies;
import DesignPattern.FactoryPattern.PizzaService.Pizzas.PizzaDecorator.LargeHandTossed;

public class PizzaTestDrive {
    
    public static void main(String []args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        
        pizza = new DoubleCheesePizza(pizza);
        pizza = new ExtraVeggies(pizza);
        pizza = new LargeHandTossed(pizza);

        System.out.println("ETHAN Ordered a " + pizza.getName());
        System.out.println("Cost: " + pizza.cost());
        System.out.println("*************************************");
        pizza = chicagoStore.orderPizza("Veggies");

        pizza = new DoubleCheesePizza(pizza);
        pizza = new LargeHandTossed(pizza);
        
        System.out.println("JOEL ordered a " + pizza.getName());
        System.out.println("Cost: " + pizza.cost());

    }
}
