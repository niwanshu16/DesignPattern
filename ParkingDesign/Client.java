package DesignPattern.ParkingDesign;

import DesignPattern.ParkingDesign.Command.CleaningServiceCommand;
import DesignPattern.ParkingDesign.Command.Command;
import DesignPattern.ParkingDesign.Command.CostCalculationCommand;
import DesignPattern.ParkingDesign.Command.FreeSlotsCommand;
import DesignPattern.ParkingDesign.Command.ParkVehicleCommand;
import DesignPattern.ParkingDesign.Command.ParkedSlotsCommand;
import DesignPattern.ParkingDesign.Command.Remote;
import DesignPattern.ParkingDesign.Command.UnparkVehicleCommand;
import DesignPattern.ParkingDesign.Vehicle.Vehicle;
import DesignPattern.ParkingDesign.Vehicle.VehicleType;

public class Client {
    public static void main(String []args) {
        ParkingApplication application = new ParkingApplication(2,5,"PAR1234");
        
        Vehicle car = new Vehicle(VehicleType.CAR,"RJ-14 SV 8787");
        Vehicle truck = new Vehicle(VehicleType.TRUCK, "RJ-17 HB 0987");
        
        Remote remote = new Remote();
      
        Command parkVehicle = new ParkVehicleCommand(application);
        Command unparkVehicle = new UnparkVehicleCommand(application);
        Command freeSlots = new FreeSlotsCommand(application);
        Command parkedSlots = new ParkedSlotsCommand(application);
        Command findCostCommand = new CostCalculationCommand(application);
        Command cleaningServiceCommand = new CleaningServiceCommand(application);

        remote.execute(parkVehicle, truck);

        remote.execute(parkVehicle, car);

        remote.execute(parkedSlots, truck);

        remote.execute(freeSlots, truck);

        remote.execute(unparkVehicle, car);

        remote.execute(freeSlots, car);

        remote.execute(findCostCommand,truck);

        remote.execute(cleaningServiceCommand, truck);

        remote.execute(findCostCommand, truck);
        
    }
}
