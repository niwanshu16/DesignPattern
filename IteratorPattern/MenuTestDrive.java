package DesignPattern.IteratorPattern;

import DesignPattern.IteratorPattern.Client.Waitress;
import DesignPattern.IteratorPattern.Menu.CafeMenu;
import DesignPattern.IteratorPattern.Menu.DinerMenu;
import DesignPattern.IteratorPattern.Menu.PancakeHouseMenu;

public class MenuTestDrive {
    
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

        waitress.printMenu();
    }
}
