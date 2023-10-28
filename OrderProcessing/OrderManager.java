package DesignPattern.OrderProcessing;

public class OrderManager {
    
    
    private Boolean validateOrder(Order order, Inventory inventory) {
        Cart cart = order.getCart();

        for(CartItem cartItem : cart.showCart()) {
            if(cartItem.isChecked()) {
                if(!inventory.isAvailable(cartItem.getProduct(), cartItem.getQuantity())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void placeOrder(Order order, Inventory inventory) {
        if(validateOrder(order, inventory)) {
            order.updateOrderStatus(OrderStatus.SUCCESS);
            updateInventory(inventory,order.getCart());
        }
        else {
            order.updateOrderStatus(OrderStatus.CANCEL);
        }
    }

    private void updateInventory(Inventory inventory, Cart cart) {
        for(CartItem item : cart.showCart()) {
            Product product = item.getProduct();
            inventory.updateProduct(product,-item.getQuantity());
        }
    }
}
