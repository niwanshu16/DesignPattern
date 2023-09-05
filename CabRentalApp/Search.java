package DesignPattern.CabRentalApp;

public abstract class Search {
    
    public abstract RideDetail doSearch(String source, String destination, int seats, String type);

}
