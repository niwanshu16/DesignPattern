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

        System.out.println("MENU\n-----\nBREAKFAST");
        display(pancakeIterator);
        System.out.println("\nLUNCH");
        display(dinerIterator);
    }

    public void display(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
