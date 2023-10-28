package DesignPattern.OrderProcessing;

import java.util.UUID;

public class User {
    
    private String userID;
    private Cart cart;
    private OrderManager orderManager;
    private Inventory inventory;

    public User(String userID, Inventory inventory) {
        this.userID = userID;
        cart = new Cart();
        orderManager = new OrderManager();
        this.inventory = inventory;
    }

    public void addToCart(Product product, int quantity) {
        cart.addToCart(product,quantity);
    }

    public Order createOrder() {
        Order order = new Order(generateOrderID(), cart);
        return order;
    }

    public void placeOrder() {
        Order order = createOrder();
        orderManager.placeOrder(order,inventory);
        System.out.println("User ID " + userID + " Order Status " + order.getOrderStatus());
    }

    private String generateOrderID() {
        return UUID.randomUUID().toString();
    }

    public void showCart() {
        for(CartItem cartItem : cart.showCart()) {
            System.out.println(cartItem.toString());
        }
    }
}
