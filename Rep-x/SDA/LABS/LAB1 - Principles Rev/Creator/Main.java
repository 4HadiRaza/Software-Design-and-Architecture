
import java.util.*;

class LineItem {
    private String productName;
    private int quantity;
    private double price;

    public LineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double totalPrice() {
        return quantity * price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<LineItem> lineItems;

    public ShoppingCart() {
        lineItems = new ArrayList<>();
    }

    public void addLineItem(String productName, int quantity, double price) {
       
        LineItem lineItem = new LineItem(productName, quantity, price);
        lineItems.add(lineItem);
    }

    public double totalCartValue() {
        double total = 0.0;
        for (LineItem item : lineItems) {
            total += item.totalPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem("Laptop", 1, 1200.00);
        cart.addLineItem("Mouse", 2, 25.00);

        System.out.printf("Total Cart Value: $%.2f%n", cart.totalCartValue());
    }
}
