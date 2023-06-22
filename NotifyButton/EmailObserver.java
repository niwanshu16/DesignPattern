package DesignPattern.NotifyButton;

public class EmailObserver implements Observer {
    
    StockObservable stockObervable;
    User user; 

    public EmailObserver(StockObservable st, User user) {
        this.user = user;
        stockObervable = st;
        stockObervable.registerObserver(this);
    }
    public void update() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Sending an email for the product " + stockObervable.getDescription() + " to the user " + user.getEmail());
    }
}
