package DesignPattern.NotifyButton;

public interface StockObservable extends Subject {
    
    int getItemCount();
    void setItemCount(int count);
    String getDescription();
    
}
