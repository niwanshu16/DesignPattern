package NotifyMeObserver;

public class Mixer extends Products {
    private int stock=0;
    private String description;

    public Mixer() {
        description = "Mixer";
    }

    public void stockAdded(int newStock) {
        if(stock == 0) {
            stock += newStock;
            notifyObservers();
        }
        else {
            stock += newStock;
        }
    }

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }
}
