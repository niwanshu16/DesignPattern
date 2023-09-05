package DesignPattern.CabRentalApp;

public class TestDrive {
    
    public static void main(String[] args) {
        
        CabRentalApp application = new CabRentalApp();

        application.addUser("Rohan", 'M', 36); 
        application.addVehicle("Rohan", "Swift", "KA-01-12345");
        application.addUser("Shashank", 'M', 29); 

        application.addVehicle("Shashank", "Baleno","TS-05-62395");
        
        application.addUser("Nandini", 'F', 29);
        application.addUser("Jay",'M',32); 
        application.addUser("Shipra", 'F', 27) ; 
        application.addVehicle("Shipra", "Polo", "KA-05-41491"); 
        application.addVehicle("Shipra", "Activa", "KA-12-12332");
        
        application.addUser("Gaurav", 'M', 29);
        application.addUser("Niwanshu",'M',25);
        application.addVehicle("Niwanshu","Jaguar","RJ14-KV-7857");
        application.addUser("Rahul", 'M', 35); 
        application.addVehicle("Rahul", "XUV", "KA-05-1234");

        //application.showAllUsers();

        application.offerRide("Rohan","Hyderabad",1,"Swift","Bangalore");
        application.offerRide("Shipra","Bangalore",2,"Polo","Mysore");
        application.offerRide("Shashank","Hyderabad",2,"Baleno","Bangalore");
        application.offerRide("Rahul","Hyderabad",5,"XUV","Bangalore");
        application.offerRide("Rohan","Bangalore",1,"Swift","Pune");
        application.offerRide("Niwanshu","Bangalore",3,"Jaguar","Mysore");
        
        
        application.showAllRides();
        application.selectRide("Nandini", "Bangalore", "Pune", 1, "Most Vacant");
        application.selectRide("Gaurav", "Bangalore", "Mysore", 1, "Most Vacant");
        application.selectRide("Shashank", "Mumbai", "Bangalore",1, "Mercedes");

        application.endRide("Rahul");
        application.selectRide("Rohan","Hyderabad","Bangalore",1,"Baleno");
        application.selectRide("Niwanshu","Hyderabad","Bangalore",2,"Most Vacant");
        application.selectRide("Jay","Hyderabad","Bangalore",2,"Most Vacant");
        application.showAllRides();

        application.printRideStats();

    }
}
