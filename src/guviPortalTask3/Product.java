package guviPortalTask3;

public class Product implements Taxable {
	private int productId;
    private double price;
    private int quantity;
    private double calculatedTax;

    public Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate sales tax on unit price of product
    public void calcTax() {
        calculatedTax = price * salesTax; // unit price * 7%
    }

    // Display product details and tax
    public void display() {
        System.out.println("Product Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax (per unit): " + calculatedTax);
    }
}
