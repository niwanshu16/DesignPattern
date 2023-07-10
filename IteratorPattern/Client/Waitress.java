package DesignPattern.IteratorPattern.Client;

import DesignPattern.IteratorPattern.Menu.Menu;
import DesignPattern.IteratorPattern.Menu.MenuItem;
import java.util.Iterator;

//Client
public class Waitress {
    
    Menu dinerMenu;
    Menu pancakeHouseMenu;
    Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n-----\nBREAKFAST");
        display(pancakeIterator);
        System.out.println("\nLUNCH");
        display(dinerIterator);
        System.out.println("\nDINNER");
        display(cafeIterator);
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
