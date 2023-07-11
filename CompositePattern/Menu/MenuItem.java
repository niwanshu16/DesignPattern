package DesignPattern.CompositePattern.Menu;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean isVegetarian;
    double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("    " + getName());
        if(isVegetarian())
            System.out.print(" (V) ");
        System.out.println("    " + getPrice());
        System.out.println("        -- " + getDescription());
    }
}
