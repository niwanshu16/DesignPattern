package DesignPattern.IteratorPattern.Menus.Iterator;

import DesignPattern.IteratorPattern.Menus.Menu.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
