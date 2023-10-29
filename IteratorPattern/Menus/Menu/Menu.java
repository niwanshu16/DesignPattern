package DesignPattern.IteratorPattern.Menus.Menu;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
