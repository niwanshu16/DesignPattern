package DesignPattern.CabRentalApp;

public class CabRentalApp {
    
    UserManager userManager;
    RideManager rideManager; 
    public CabRentalApp() {
        userManager = UserManager.getInstance();
        rideManager = RideManager.getInstance();
    }

    public void addUser(String name, Character sex, int age) {
        userManager.addUser(name, sex, age);
    }

    public void addVehicle(String name, String vehicleName, String regNo) {
        userManager.addVehicle(name, vehicleName, regNo);
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void offerRide(String name, String source, int seats, String vehicleName, String destination) {
        rideManager.offerRide(name, source, seats, vehicleName, destination);
    }

    public void showAllRides() {
        rideManager.showAllRides();
    }

    public void showAllUsers() {
        userManager.showAllUsers();
    }

    public void selectRide(String name, String source, String destination, int seats, String type) {
        rideManager.selectRide(name, source, destination, seats,type);
    }

    public void printRideStats() {
        rideManager.printRideStats();
    }

    public void endRide(String name) {
        rideManager.endRide(name);
    }
}

