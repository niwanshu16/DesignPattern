package DesignPattern.IteratorPattern.Client;

import DesignPattern.IteratorPattern.Menu.Menu;
import DesignPattern.IteratorPattern.Menu.MenuItem;
import java.util.Iterator;

//Client
public class Waitress {
    
    Menu dinerMenu;
    Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n-----\nBREAKFAST");
        display(pancakeIterator);
        System.out.println("\nLUNCH");
        display(dinerIterator);
    }

    public void display(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
