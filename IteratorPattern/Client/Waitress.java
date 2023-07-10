package DesignPattern.IteratorPattern.Client;

import DesignPattern.IteratorPattern.Iterator.Iterator;
import DesignPattern.IteratorPattern.Menu.DinerMenu;
import DesignPattern.IteratorPattern.Menu.MenuItem;
import DesignPattern.IteratorPattern.Menu.PancakeHouseMenu;

//Client
public class Waitress {
    
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        display(dinerIterator);
        display(pancakeIterator);
    }

    public void display(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + ", ");
            System.out.println(item.getDescription() +"\n\n");
        }
    }
}
