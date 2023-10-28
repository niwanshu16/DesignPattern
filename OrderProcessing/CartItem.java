package DesignPattern.OrderProcessing;

public class CartItem {
    
    private Product product;
    private int quantity;
    private Boolean checked; 

    public CartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        checked = true;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean isChecked() {
        return checked;
    }

    public Double getCost() {
        return product.getAmount()*quantity;
    }
    
    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product " + product.toString() + " Quantity " + quantity + " Is Checked " + checked;
    }
}
