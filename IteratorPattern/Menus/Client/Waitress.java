package DesignPattern.IteratorPattern.Menus.Client;

import java.util.Iterator;

import DesignPattern.IteratorPattern.Menus.Menu.Menu;
import DesignPattern.IteratorPattern.Menus.Menu.MenuItem;

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
