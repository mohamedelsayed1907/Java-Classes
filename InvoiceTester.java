public class InvoiceTester {

    public static void main(String[] args) {
        System.out.printf("Testing InvoiceItem\n");

        Product product = new Product(23, "Hammer", 23.99);

        InvoiceItem invoiceItem = new InvoiceItem(product, 3);


        System.out.printf("\nInvoice Item [ID: %d] %s $%.2f, QTY: %d, Line Total: $%.2f\n",
                            invoiceItem.getProduct().getId(),
                            invoiceItem.getProduct().getDescription(),
                            invoiceItem.getProduct().getPrice(),
                            invoiceItem.getQuantity(),
                            invoiceItem.getItemTotal());



    }

    public static void printProductInfo(Product product) {
        System.out.printf("\n[ID: %d] %s $%.2f", product.getId(), product.getDescription(), product.getPrice());
    }
}
