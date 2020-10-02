/**
 * Modified InvoiceItem class, a class that gets the Product class
 */

public class InvoiceItem {

    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     *
     * @return product from product class
     */
    public Product getProduct() {
        return product;
    }

    /**
     *
     * @param product - sets the product from the product class
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
            System.out.println("Quantity can not be a negative integer");
        }
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return this.product.getPrice() * this.quantity;
    }

}



