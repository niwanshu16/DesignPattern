package DesignPattern.IteratorPattern.Menu;

public class MenuItem {
    
    String name;
    String description;
    boolean isVegetarian;
    double price;

    public MenuItem(String name, String description, boolean isVegetarian,double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

}
