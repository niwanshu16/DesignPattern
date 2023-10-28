package DesignPattern.OrderProcessing;

public class Application {
    Inventory inventory;

    public Application() {
        inventory = new Inventory();
    }

    public void addInventory(Product product, Integer quantity) {
        inventory.updateProduct(product, quantity);
    }

    public void showAllProducts() {
        inventory.showAllProducts();
    }

    public User createUser() {
        User user = new User("User1", inventory);
        return user;
    }
}
