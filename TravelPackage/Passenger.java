package DesignPattern.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    
    private String name;
    private String passengerNumber;
    private Double balance;
    private PassengerClass travelClass;
    private List<Activity> activities;

    public Passenger(String name, String passengerNumber, Double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        activities = new ArrayList<>();
    }

    public void setTravelClass(PassengerClass travelClass) {
        this.travelClass = travelClass;
    }

    public void addActivity(Activity ...activity) {
        try {
            for(Activity act : activity) {
                if(travelClass == PassengerClass.PREMIUM || act.getCost() <= balance && act.isSpaceAvailable()) {
                    balance -= act.getCost();
                    activities.add(act);
                    act.enrollPassenger();
                } else {
                    throw new CustomException("Not enough balance to sign up for this activity:  " + balance);
                }
            }
        } catch(CustomException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void passengerDetails() {
        System.out.println("Name " + name + "\nPassenger Number " + passengerNumber);
    }

    public void printDetails() {
        System.out.println("NAME :  " + name + "\nPassenger Number : " + passengerNumber);
        if(travelClass != PassengerClass.PREMIUM)
            System.out.println("Balance " + balance);
        for(Activity activity : activities)
            activity.printDetails();
    }
}
