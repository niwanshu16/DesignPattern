package NotifyMeObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Products implements Subject {
    List<Observer> observers = new ArrayList<Observer>();

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

    public abstract void stockAdded(int stockAdded);
    public abstract int getStock();
    public abstract String getDescription();
}
