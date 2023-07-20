package DesignPattern.StatePattern.GumballMachine;

public class GumballMachine {
    
    int count = 0;
    State noQuarter;
    State hasQuarter;
    State sold;
    State soldOutState;
    State winnerState;
    State state;

    public GumballMachine(int count) {
        this.count = count;
        noQuarter = new NoQuarter(this);
        hasQuarter = new HasQuarter(this);
        sold = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if(count > 0)
            state = noQuarter;
        else
            state = soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setHasQuarterState() {
        state = hasQuarter;
    }

    public void setNoQuarterState() {
        state = noQuarter;
    }

    public State getNoQuarterState() {
        return noQuarter;
    }

    public State getSoldState() {
        return sold;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if(count > 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory " + count + " Gumballs");
        System.out.println("Machine is waiting for quarter \n\n");
        return "";
    }

    public State getHasQuarterState() {
        return hasQuarter;
    }
}
