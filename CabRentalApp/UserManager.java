package DesignPattern.CabRentalApp;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    
    HashMap<String,User> users;
    HashMap<User,Vehicle> drivers;
    static UserManager userManager;

    public UserManager() {
        users = new HashMap<>();
        drivers = new HashMap<>();
    }

    public void addUser(String name, Character sex, int age) {
        User user = new User(name,sex,age);
        users.put(name,user);
    }

    public void addVehicle(String name, String vehicleName, String regNo) {
        User user = users.get(name);
        Vehicle vehicle = new Vehicle(vehicleName, regNo);
        drivers.put(user,vehicle);
    }

    public static UserManager getInstance() {
        if(userManager == null) 
            userManager = new UserManager();
        return userManager;
    }

    public User getUser(String name) {
        if(users.containsKey(name))
            return users.get(name);
        return null;
    }

    public Vehicle getVehicle(User user) {
        if(drivers.containsKey(user))
            return drivers.get(user);
        return null;
    }

    public void showAllUsers() {
        for(Map.Entry<String,User> map : users.entrySet())
            map.getValue().showUser();
    }
}
