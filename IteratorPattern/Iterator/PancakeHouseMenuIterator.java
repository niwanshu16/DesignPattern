package DesignPattern.IteratorPattern.Iterator;

import java.util.List;

import DesignPattern.IteratorPattern.Menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
    int position;
    List<MenuItem> menuItems;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        position = 0;
    }

    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null )
            return false;
        return true;
    }

    public MenuItem next() {
        return menuItems.get(position++);
    }
}
