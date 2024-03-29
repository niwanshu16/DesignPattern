package DesignPattern.IteratorPattern.Menus.Iterator;

import java.util.Iterator;

import DesignPattern.IteratorPattern.Menus.Menu.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {
    
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
    
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items. ");
    }
}
