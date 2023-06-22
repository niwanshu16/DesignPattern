package DesignPattern.NotifyButton;

public class PhoneObserver implements Observer {
    StockObservable stockObservable;
    User user;

    public PhoneObserver(StockObservable st, User user) {
        this.user = user;
        this.stockObservable = st;
        stockObservable.registerObserver(this);
    }

    public void update() {
        sendMessage();
    }

    public void sendMessage() {
        System.out.println("Sending an message for the product " + stockObservable.getDescription() + " To the user " + user.getEmail());
    }
}
