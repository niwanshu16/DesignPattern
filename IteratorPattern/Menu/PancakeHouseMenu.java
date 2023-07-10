package DesignPattern.IteratorPattern.Menu;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs and sauce",
            true,
            2.99 );

        addItem("Regular Pancake Breakfast",
            "Pancakes with fried eggs, and sausage",
            false,
            2.99);

        addItem("Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true,
            3.49);

        addItem("Waffles",
            "Waffles with your choice of blueberries and strawberries",
            true,
            3.59);

    }

    public void addItem(String name, String description,boolean isVegetarian, double price) {
        MenuItem menu = new MenuItem(name,description,isVegetarian,price);
        menuItems.add(menu);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
