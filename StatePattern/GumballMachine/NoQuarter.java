package DesignPattern.StatePattern.GumballMachine;

public class NoQuarter implements State {

    GumballMachine gumballMachine;
    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("Quarter Inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted any quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("Cannot turn crank, please insert the quarter first"); 
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense, You have to insert the quarter first");
    }
    
    

    
}
