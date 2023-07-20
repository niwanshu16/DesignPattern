package DesignPattern.StatePattern.GumballMachine;

import java.util.Random;

public class HasQuarter implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned.....");
        int winner = randomWinner.nextInt(10);
        System.out.println(winner);
        if(winner == 0 && (gumballMachine.getCount() > 1))
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
