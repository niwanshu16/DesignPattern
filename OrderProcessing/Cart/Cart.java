package DesignPattern.OrderProcessing.Cart;

import java.util.ArrayList;
import java.util.List;

import DesignPattern.OrderProcessing.Product.Product;

public class Cart {
    
    private List<CartItem> allItems;

    public Cart() {
        allItems = new ArrayList<>();
    }

    public void addToCart(Product product, Integer quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        allItems.add(cartItem);
    }

    public List<CartItem> showCart() {
        return allItems;
    }

    public void resetCart() {
        allItems.clear();
    }

    public Double calculateCost() {
        return allItems
            .stream()
            .filter(item -> item.isChecked())
            .map(item -> item.getCost())
            .reduce(0.0,(item1,item2) -> item1+item2);
    }
}
