package DesignPattern.OrderProcessing;

import java.util.UUID;

import DesignPattern.OrderProcessing.Product.Product;
import DesignPattern.OrderProcessing.Product.ProductCategory;

public class Client {
    
    public static void main(String []args) {

        Application application = new Application();
        Product product1 = new Product(getProductID(),"LG Refrigerator", ProductCategory.ELECTRONIC, 38000.0);
        application.addInventory(product1, 10);

        Product product2 = new Product(getProductID(), "Flying Machine Jeans", ProductCategory.CLOTHING, 2000.0);
        application.addInventory(product2, 20);

        Product product3 = new Product(getProductID(), "Recliner SOFA", ProductCategory.CLOTHING, 120000.0);
        application.addInventory(product3, 2);
        application.showAllProducts();
        User user = application.createUser();
        user.addToCart(product1, 10);
        user.showCart();
       // user.placeOrder();

        //application.showAllProducts();
    }

    private static String getProductID() {
        return UUID.randomUUID().toString().substring(1,5);
    }
}
