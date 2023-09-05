package DesignPattern.CabRentalApp;

public class SearchManager {
    
    Search search;
    static SearchManager uniqueInstance = null;
    public static SearchManager getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new SearchManager();
        return uniqueInstance;
    }

    public void setSearchStrategy(Search search) {
        this.search = search;
    }

    public RideDetail doSearch(String source, String destination, int seats, String type) {
        if(type.equals("Most Vacant"))
            search = new MostRecentSearch();
        else
            search = new VehicleType();

        return search.doSearch(source, destination, seats, type);
    }
    
}
