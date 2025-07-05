//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Input item price, calculate shipping cost, output shipping and total price

        // Declare constants
        final double FREE_SHIPPING_THRESHOLD = 100.0;
        final double SHIPPING_RATE = 0.02;

        // Declare variables
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double totalPrice = 0.0;

        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the price of the item: ");
        itemPrice = input.nextDouble();

        // Determine shipping cost
        if (itemPrice >= FREE_SHIPPING_THRESHOLD) {
            shippingCost = 0.0;
        } else {
            shippingCost = itemPrice * SHIPPING_RATE;
        }

        // Calculate total price
        totalPrice = itemPrice + shippingCost;

        // Output results
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price including shipping: $" + totalPrice);

        input.close();
    }
}
