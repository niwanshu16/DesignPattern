package DesignPattern.NotifyButton;

import java.util.ArrayList;
import java.util.List;

public class WashingMachineObservable implements StockObservable {
    
    List<Observer> observers;
    int itemCount;
    String description;

    public WashingMachineObservable(int count) {
        observers = new ArrayList<>();
        description = "This is IFB Washing Machine";
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers) 
            o.update();
    }

    public void setItemCount(int count) {
        if(itemCount == 0) {
            notifyObservers();
        }
        itemCount += count;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
