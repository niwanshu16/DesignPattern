package DesignPattern.IteratorPattern.Menu;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
