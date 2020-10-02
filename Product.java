/**
 * Modified Product Class
 */

public class Product {

    private int id;
    private String description;
    private double price;

    /**
     *
     * @param id: product number
     * @param description: description of what the product is
     * @param price: price of the product
     */
    public Product(int id, String description, double price) {

        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     *
     * @return: getter to return the ID of the product
     */
    public int getId() {
        return id;
    }

    // setter to set the product id
    public void setId(int id) {
        this.id = id;
    }

    // getter to get product description
    public String getDescription() {
        return description;
    }

    // setter to set product description
    public void setDescription(String description) {
        this.description = description;
    }

    // getter to get product price
    public double getPrice() {
        return price;
    }

    // setter to set product price
    public void setPrice(double price) {
        if (price < 0) {
            price = 0;
            System.out.println("Deposit amount can not be a negative integer");
        }
        this.price = price;

    }
}
