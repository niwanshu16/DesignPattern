package DesignPattern.OrderProcessing;

public class Product {
    
    private String productID;
    private String productName;
    private ProductCategory productCategory;
    private Double amount;

    public Product(String productID, String productName, ProductCategory productCategory, Double amount) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public ProductCategory getCategory() {
        return productCategory;
    }

    public String getProductID() {
        return productID;
    }

    
    @Override
    public String toString() {
        return "ProductID " + productID + " ProductName " + productName + " ProductCategory " + productCategory 
            + " Amount " + amount;
    }
    
}
