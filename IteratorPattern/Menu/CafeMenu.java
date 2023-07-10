package DesignPattern.IteratorPattern.Menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
    
    Map<String,MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<String,MenuItem>();

        addItem("Veggie Burger and Air Fries"
            ,"Veggie burger on a whole wheat bun",
            true,
            3.99);

        addItem("Soup of the day",
        "A cup of the soup of the day, with a side salad",
        false,
        3.69);
        addItem("Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true,
            4.29);
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menu = new MenuItem(name,description,isVegetarian,price);
        menuItems.put(name,menu);
    }

    public Map<String,MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
    
}
