package DesignPattern.StatePattern.GumballMachine;

public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another quarter");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if(gumballMachine.getCount() == 0)
            gumballMachine.setState(gumballMachine.getSoldOutState());
        else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if(gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            else {
                System.out.println("OOPS, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    
}
