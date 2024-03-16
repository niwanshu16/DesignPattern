package DesignPattern.TravelPackage;

public class Activity {

    private Double cost;
    private String name;
    private String description;
    private int capacity;
    private int currentlyEnrolled;

    public Activity(String name, Double cost, String description, int capacity) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.capacity = capacity;
        currentlyEnrolled = 0;
    }
    public void printDetails() {
        System.out.println("-----Activity " + name + "\n     Description " + description);
        System.out.println("     Capacity " + capacity + "\n     Cost " + cost);
    }
    
    public Double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void enrollPassenger() {
        currentlyEnrolled += 1;
    }

    public Boolean isSpaceAvailable() {
        return capacity > currentlyEnrolled;
    }

    public void printSpaceDetails() {
        System.out.println("-----Activity Name " + name + "\n     Capacity " + capacity + "\n     Space Available " + (capacity-currentlyEnrolled));
    }
}
