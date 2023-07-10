package DesignPattern.IteratorPattern.Menu;

import DesignPattern.IteratorPattern.Iterator.DinerMenuIterator;
import java.util.Iterator;

public class DinerMenu implements Menu {
    
    MenuItem[] menuItems;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
            "(Fakin) Bacon with lettuce & tomato on whole wheat",
            true,
            2.99);
        
        addItem("BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false,
            2.99);
        
        addItem("Soup of the day",
            "Soup of the day, with a side of potato salad",
            false,
            3.29);
        
        addItem("Hotdog",
            "A hot dog, with sauerkraut, relish, onions, topped with cheese",
            false,
            3.05);
    
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menu = new MenuItem(name,description,isVegetarian,price);

        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }
        else {
            menuItems[numberOfItems++] = menu;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
