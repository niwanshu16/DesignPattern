package DesignPattern.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private int capacity;
    private String name;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int capacity, Destination ...destinations) {
        this.capacity = capacity;
        this.name = name;

        itinerary = new ArrayList<>();
        passengers = new ArrayList<>();

        for(Destination des : destinations)
            itinerary.add(des);
    }

    public void addPassenger(Passenger ...passenger) {

        for(Passenger pass : passenger) {
            if(passengers.size() < capacity)
                passengers.add(pass);
            else {
                System.out.println("PACKAGE IS FULL"); 
                break;
            }
        }
    }

    public void printItineraryDetails() {
        System.out.println("Package Name " + name);
        for(Destination des : itinerary)
            des.printDetails();
    }

    public void printPassengerDetails() {
        System.out.println("Package Name " + name + "\nCapacity " + capacity + "\nCurrently Enrolled " + passengers.size());
        for(Passenger passenger : passengers)
            passenger.passengerDetails();
    }

    public void printActivityDetails() {
        for(Destination it : itinerary) {
            it.printDetails();
        }
    }

    public Boolean isActivityPresent(Activity activity) {
        for(Destination it: itinerary) {
            if(it.isActivityPresent(activity))
                return true;
        }
        return false;
    }
}
