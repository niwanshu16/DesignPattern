package DesignPattern.TemplatePattern.ArraySort;

import java.util.Comparator;

public class DuckTestDrive {
    
    public static void main(String []args) {

        Duck[] ducks = {
            new Duck("Daffy",8),
            new Duck("Dewey",2),
            new Duck("Howard",7),
            new Duck("Louie",2),
            new Duck("Donald",10),
            new Duck("Huey",2)
        };

        System.out.println("Before Sorting");
        display(ducks);
        Comparator<Duck> weightComparator = Comparator.comparing(Duck::getWeight);
        Comparator<Duck> nameComparator = Comparator.comparing(Duck::getName);

        ArraySorting.sort(ducks,weightComparator);

        System.out.println("\nAfter Sorting");
        display(ducks);

        ArraySorting.sort(ducks,nameComparator);
        System.out.println("\nAfter Sorting");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for(Duck d:ducks) {
            System.out.println(d);
        }
    }
}
