import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;

        Product myProd1 = new Product("Blueberries", 10, 3.00);
        Product myProd2 = new Product("Salmon", 11, 10.00);
        Product myProd3 = new Product("Steak", 12, 12.00);
        Product myProd4 = new Product("Tomatoes", 13, 4.00);
        Product myProd5 = new Product("Onions", 14, 3.00);
        Product myProd6 = new Product("Garlic", 15, 2.00);

        Product[] products = { myProd1, myProd2, myProd3, myProd4, myProd5, myProd6 };
        ArrayList<Product> selectedProducts = new ArrayList<>();

        while (true) {
            System.out.print("Enter UPC (or type 'Pay' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Pay")) {
                break;
            }

            try {
                int upc = Integer.parseInt(input);
                boolean found = false;

                for (Product product : products) {
                    if (product.getUpc() == upc) {
                        totalPrice += product.getPrice();
                        selectedProducts.add(product);
                        System.out.println("Added " + product.getName() + " to the receipt.");
                        System.out.println("This product UPC is: " + product.getUpc() + " and unit price: "+product.getPrice());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product not found, try again or type 'Pay' to quit");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid UPC (an integer) or type 'Pay' to quit.");
            }
        }

        System.out.println("Receipt:");
        for (Product selectedProduct : selectedProducts) {
            System.out.println(selectedProduct);
        }
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}
