package DesignPattern.CabRentalApp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class RideManager {
    
    private HashMap<User,RideDetail> drivers;
    HashMap<String,List<RideDetail>> path;
    UserManager userManager;
    SearchManager searchManager;
    HashMap<User,Integer> rideOffered;
    HashMap<User,Integer> rideTaken;

    static RideManager rideManager;

    private RideManager() {
        drivers = new HashMap<>();
        path = new HashMap<>();
        userManager = UserManager.getInstance();
        searchManager = SearchManager.getInstance();
        rideOffered = new HashMap<>();
        rideTaken = new HashMap<>();
    }

    public RideDetail getRideDetail(User user) {
        if(drivers.containsKey(user))
            return drivers.get(user);
        return null;
    }

    public static RideManager getInstance() {
        if(rideManager == null) {
            synchronized(RideManager.class) {
                rideManager = new RideManager();
            }
        }
        return rideManager;
    }
    public void offerRide(String name, String source, int seats, String v, String destination) {

        User user = userManager.getUser(name);
        Vehicle vehicle = userManager.getVehicle(user);
        RideDetail rideDetail = new RideDetail(source, destination, vehicle,seats);
        drivers.put(user,rideDetail);
        
        List<RideDetail> rideDetails;
        if(path.containsKey(source))
            rideDetails = path.get(source);
        else
            rideDetails = new ArrayList<>();
        

        rideDetails.add(rideDetail);
        path.put(source,rideDetails);
        if(rideOffered.containsKey(user)) {
            rideOffered.put(user,rideOffered.get(user)+1);
        }
        else    
            rideOffered.put(user,1);
    }

    public void showAllRides() {
        for(Map.Entry<User,RideDetail> map: drivers.entrySet()) {
            User user = map.getKey();
            Vehicle vehicle = userManager.getVehicle(map.getKey());
            RideDetail rd = map.getValue();

            System.out.println("\nUser : " + user.name);
            System.out.println("Vehicle " + vehicle.vehicleName);
            rd.showRideDetail();
        }
    }

    public void selectRide(String name, String source,String destination, int seats, String type) {
        User user = userManager.getUser(name);
        RideDetail rideDetail = searchManager.doSearch(source, destination, seats, type);

        System.out.println("Name " + name + " Source " + source + " Destination " + destination );
        if(rideTaken.containsKey(user))
            rideTaken.put(user,rideTaken.get(user)+1);
        else    
            rideTaken.put(user,1);

        if(rideDetail == null) 
            System.out.println(" Rides are not available ");
        else 
            rideDetail.showRideDetail();
    }

    public void printRideStats() {
        for(Map.Entry<User,Integer> map : rideOffered.entrySet()) {
            int offer = map.getValue();
            int taken = 0;
            if(rideTaken.containsKey(map.getKey()))
                taken = rideTaken.get(map.getKey());
            
            System.out.println(map.getKey().name + " " + offer + " Offered " + taken + " Taken");
        }

        for(Map.Entry<User,Integer> map : rideTaken.entrySet()) {
            int taken = 0, offer = 0;
            if(!rideOffered.containsKey(map.getKey())) {
                taken = rideTaken.get(map.getKey());
                System.out.println(map.getKey().name + " " + offer + " Offered " + taken + " Taken");
            }
        }
    }

    public void endRide(String name) {
        User user = userManager.getUser(name);
        RideDetail rideDetail = drivers.get(user);
        drivers.remove(user);

        String source = rideDetail.source;
        List<RideDetail> rideDetails = path.get(source);
        System.out.println("ENDING RIDE ");
        rideDetail.showRideDetail();

        rideDetails.remove(rideDetail);

        if(rideDetails.size() > 0) 
            path.put(source,rideDetails);

    }

}
