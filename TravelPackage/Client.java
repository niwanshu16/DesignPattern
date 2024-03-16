package DesignPattern.TravelPackage;

public class Client {
    
    private static Activity activity1, activity2;
    private static Passenger passenger1, passenger2, passenger3;
    private static Destination Shimla, Manali;
    private static TravelPackage package1;

    public static void main(String []args) {
        Application application = new Application();

        Initializer();
        
        application.addPackage(package1);

        package1.addPassenger(passenger1);
        package1.addPassenger(passenger2);
        package1.addPassenger(passenger3);
        
        application.addActivity(activity1,activity2);
        application.addPassenger(passenger1, passenger2,passenger3);

        application.bookPackage(passenger1, package1);
        application.showAllActivity(passenger1);
        application.bookActivities(passenger1, activity1, activity2);
        passenger1.printDetails();
        application.bookActivities(passenger2,activity1);

        application.showAllActivityWithSpaceAvailable();
    }

    public static void Initializer() {
        activity1 = new Activity("Horse Riding", 250.0, "Riding on a horse nearby a river", 10);
        activity2 = new Activity("Bungee Jumping", 1000.0,"Jump from a highest cliff with a scenary view",10);
        
        passenger1 = new Passenger("Niwanshu Maheshwari", "234", 1000.0);
        passenger2 = new Passenger("Neha Mathur", "235", 2000.0);
        passenger3 = new Passenger("Dhruv Rathee", "236", 0.0);

        passenger1.setTravelClass(PassengerClass.PREMIUM);

        Shimla = new Destination("Shimla");
        Manali = new Destination("Manali");

        Shimla.addActivity(activity1);
        Manali.addActivity(activity2);

        package1 = new TravelPackage("BUDGET",3, Shimla, Manali);
        
    }
}
