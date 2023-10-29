package DesignPattern.CompositePattern.Menu;

import java.util.List;
import java.util.ArrayList;

public class Menu extends MenuComponent{
    
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menu) {
        menuComponents.add(menu);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public void remove(MenuComponent menu) {
        menuComponents.remove(menu);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------------");

        for(MenuComponent menu: menuComponents) {
            menu.print();
        }
    }
}
