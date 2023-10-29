package DesignPattern.OrderProcessing.Inventory;


import java.util.HashMap;
import java.util.Map;

import DesignPattern.OrderProcessing.Product.Product;

public class Inventory {
    
    Map<Product,InventoryItem> inventory;
    
    public Inventory() {
        inventory = new HashMap<>();
    }

    public void updateProduct(Product product, Integer quantity) {
        InventoryItem inventoryItem;
        if(inventory.containsKey(product)) {
            inventoryItem = inventory.get(product);
            inventoryItem.updateQuantity(quantity);
        }
        else {
            inventoryItem = new InventoryItem(product,quantity);
        }
        inventory.put(product,inventoryItem);
    }

    public Boolean isAvailable(Product product, Integer quantity) {
        if(inventory.containsKey(product)) {
            return inventory.get(product).getQuantity() >= quantity;
        }
        return false;
    }

    public void showAllProducts() {
        for(Map.Entry<Product,InventoryItem> item : inventory.entrySet()) {
            System.out.println(item.getKey().toString() + " : " + item.getValue().toString());
        }
    }
}
