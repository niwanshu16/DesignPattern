package DesignPattern.IteratorPattern.Menus;

import DesignPattern.IteratorPattern.Menus.Client.Waitress;
import DesignPattern.IteratorPattern.Menus.Menu.CafeMenu;
import DesignPattern.IteratorPattern.Menus.Menu.DinerMenu;
import DesignPattern.IteratorPattern.Menus.Menu.PancakeHouseMenu;

public class MenuTestDrive {
    
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

        waitress.printMenu();
    }
}
