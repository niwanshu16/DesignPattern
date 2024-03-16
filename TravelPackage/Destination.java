package DesignPattern.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;
    
    public Destination(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    public void addActivity(Activity ...activity) {
        for(Activity act : activity)
            activities.add(act);
    }

    public void printDetails() {
        System.out.println("Destination: " + name);
        for(Activity act : activities)
            act.printDetails();
    }

    public void printActivityWithSpaceDetails() {
        for(Activity activity : activities) {
            if(activity.isSpaceAvailable())
                activity.printDetails();
        }
    }

    public Boolean isActivityPresent(Activity activity) {
        return activities.contains(activity);
    }
}
