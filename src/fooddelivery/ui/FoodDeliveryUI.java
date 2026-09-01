package fooddelivery.ui;

import fooddelivery.controller.FoodDeliveryController;
import fooddelivery.repository.FoodDeliveryRepository;
import fooddelivery.service.FoodDeliveryService;

import java.util.Scanner;

public class FoodDeliveryUI {
    public static void main(String[] args) {

        // --- Dependency Injection (Wiring the layers together) ---
        FoodDeliveryRepository repository = new FoodDeliveryRepository();
        FoodDeliveryService service = new FoodDeliveryService(repository);
        FoodDeliveryController controller = new FoodDeliveryController(service);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // --- Application Loop ---
        while (!exit) {
            System.out.println("\n==================================");
            System.out.println("       FOOD DELIVERY SYSTEM       ");
            System.out.println("==================================");
            System.out.println("1. Register Customer");
            System.out.println("2. Place Order");
            System.out.println("3. View My Orders");
            System.out.println("4. Cancel Order"); // Bonus option
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Reading user choice
            int choice = 0;
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Scanner enter key to consume
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume wrong input
                continue;
            }

            // Based on choice, calling respective controller methods
            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();

                    // UI calling Controller
                    controller.registerCustomer(id, name, phone, address);
                    break;

                case 2:
                    System.out.print("Customer ID: ");
                    int custId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Food Name: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Food Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    // UI calling Controller
                    controller.placeOrder(custId, foodName, price, quantity);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int viewId = scanner.nextInt();

                    // UI calling Controller
                    controller.viewCustomerOrders(viewId);
                    break;

                case 4:
                    System.out.print("Enter Order ID to cancel: ");
                    int cancelId = scanner.nextInt();

                    // UI calling Controller
                    controller.cancelOrder(cancelId);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Thank you for using Food Delivery System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
        scanner.close(); // Clean up
    }
}