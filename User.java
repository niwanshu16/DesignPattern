package NotifyMeObserver;

public class User implements Observer {

    Products products;
    int stock = 0;
    InformationVia informationVia;

    public User(Products products, InformationVia informationVia) {
        this.informationVia = informationVia;
        this.products = products;
        products.registerObserver(this);
    }

    public void update() {
        stock = products.getStock();
        display();
    }

    public void display() {
        System.out.println(products.getDescription() + " User Stock Added " + products.getStock() + " Inform via " + informationVia.getDescription());
    }
    
}
