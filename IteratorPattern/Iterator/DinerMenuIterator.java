package DesignPattern.IteratorPattern.Iterator;

import DesignPattern.IteratorPattern.Menu.MenuItem;

public class DinerMenuIterator implements Iterator {
    
    MenuItem[] menuItems;
    int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) 
            return false;
        return true;
    }

    public MenuItem next() {
        return menuItems[position++];
    }
    
}
