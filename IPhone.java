package NotifyMeObserver;


public class IPhone extends Products {
    private String description;
    private int stock = 0;

    public IPhone() {
        description = "IPhone ";
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
