package DesignPattern.IteratorPattern;

import DesignPattern.IteratorPattern.Client.Waitress;
import DesignPattern.IteratorPattern.Menu.DinerMenu;
import DesignPattern.IteratorPattern.Menu.PancakeHouseMenu;

public class MenuTestDrive {
    
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();
    }
}
