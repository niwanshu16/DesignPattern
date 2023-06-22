package DesignPattern.NotifyButton;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable {
    List<Observer> observers;
    int itemCount;
    String description;
    public IPhoneObservable(int count) {
        description = "This is IPhone 14 Pro MAX";
        itemCount = count;
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers) {
            o.update();
        }
    }

    public void setItemCount(int count) {
        if(itemCount == 0) {
            itemCount = count;
            notifyObservers();
        }
        else    
            itemCount += count;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getDescription() {
        return description;
    }

}