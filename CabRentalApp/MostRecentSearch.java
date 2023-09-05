package DesignPattern.CabRentalApp;

import java.util.List;

public class MostRecentSearch extends Search {

    RideManager rideManager = RideManager.getInstance();
    
    public RideDetail doSearch(String source, String destination, int seats, String type) {
        RideDetail rideDetail = null;

        rideDetail = search(source,destination,seats, type);
        return rideDetail;
    }

    public RideDetail search(String source, String destination, int seats, String type) {

        List<RideDetail> rideDetails = rideManager.path.get(source);
        if(rideDetails == null)
            return null;
            
        RideDetail result = null;
        for(RideDetail rd:rideDetails) {
            if(rd.destination == destination && rd.seats >= seats) {
                if(result == null || result.seats < rd.seats) 
                    result = rd;
            }
        }
        rideDetails.remove(result);
        if(result != null && result.seats > seats) {
            result.seats -= seats;
            rideDetails.add(result);
            rideManager.path.put(source,rideDetails);
        }

        return result;
    }
}
