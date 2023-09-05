package DesignPattern.CabRentalApp;

public class RideDetail {
    
    String source;
    String destination;
    Vehicle vehicle;
    int seats;

    public RideDetail(String source, String destination, Vehicle vehicle, int seats) {
        this.source = source;
        this.destination = destination;
        this.vehicle = vehicle;
        this.seats = seats;
    }

    public void showRideDetail() {
        System.out.println("Source: " + source + "\nDestination: " + destination + "\nseats " + seats + "\nVehicle " + vehicle.vehicleName);
    }
}
