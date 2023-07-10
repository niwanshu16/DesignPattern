package DesignPattern.IteratorPattern.Iterator;

import DesignPattern.IteratorPattern.Menu.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
