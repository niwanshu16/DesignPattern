package DesignPattern.OrderProcessing.Order;

import DesignPattern.OrderProcessing.Cart.Cart;

public class Order {
    
    private String orderID;
    private Cart cart;
    private OrderStatus orderStatus;

    public Order(String orderID, Cart cart) {
        this.orderID = orderID;
        this.cart = cart;
    }

    public Double calculateAmount() {
        return cart.calculateCost();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderID() {
        return orderID;
    }

    public Cart getCart() {
        return cart;
    }
}
