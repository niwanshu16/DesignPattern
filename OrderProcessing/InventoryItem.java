package DesignPattern.OrderProcessing;

public class InventoryItem {
    
    Product product;
    Integer quantity;
    ProductStatus productStatus;

    public InventoryItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public void updateQuantity(Integer quantity) {
        this.quantity += quantity;
        if(this.quantity <= 0) {
            setProductStatus(ProductStatus.OutOfStock);
        }
        else 
            setProductStatus(ProductStatus.Available);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return " Quantity : " + quantity;
    }
}
