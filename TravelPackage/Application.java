package DesignPattern.TravelPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    
    private List<TravelPackage> allPackages;
    private List<Activity> activities;
    private List<Passenger> passengers;
    private Map<Passenger,TravelPackage> passengerPackage;
    
    public Application() {
        activities = new ArrayList<>();
        passengers = new ArrayList<>();
        allPackages = new ArrayList<>();
        passengerPackage = new HashMap<>();
    }

    public void addActivity(Activity ...activity) {
        for(Activity act : activity)
            activities.add(act);
    }

    public void addPassenger(Passenger ...passenger) {
        for(Passenger pas : passenger)
            passengers.add(pas); 
    }

    public void printPassengerDetails() {
        for(Passenger passenger : passengers)
            passenger.passengerDetails();
    }

    public void printAllActivityWithSpaceAvailable() {
        for(Activity activity : activities) {
            if(activity.isSpaceAvailable())
                activity.printSpaceDetails();
        }
    }

    public void showAllPackages() {
        for(TravelPackage pack : allPackages) {
            pack.printItineraryDetails();
            System.out.println("--------------------------------------------------");
        }
    }

    public void addPackage(TravelPackage package1) {
        allPackages.add(package1);
    }

    public void bookPackage(Passenger passenger, TravelPackage package1) {
        if(passengerPackage.containsKey(passenger)) {
            System.out.println("Package is already booked for this Passenger ");
            passenger.passengerDetails();
        } else {
            passengerPackage.put(passenger, package1);
        }
    }

    public void showAllActivity(Passenger passenger) {
        if(passengerPackage.containsKey(passenger)) {
            TravelPackage travelPackage = passengerPackage.get(passenger);
            travelPackage.printActivityDetails();
        } else {
            throw new CustomException("No Package has been booked");
        }
    }

    public void bookActivities(Passenger passenger, Activity ...activities) { 
        try {
            if(passengerPackage.containsKey(passenger)) {
                TravelPackage travelPackage = passengerPackage.get(passenger);
                for(Activity activity : activities) {
                    if(travelPackage.isActivityPresent(activity))
                        passenger.addActivity(activity);
                }
            } else {
                passenger.passengerDetails();
                throw new CustomException("No Package is selected by this Passenger");
            }
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void showAllActivityWithSpaceAvailable() {
        for(Activity activity : activities) {
            if(activity.isSpaceAvailable())
                activity.printSpaceDetails();
        }
    }
}
