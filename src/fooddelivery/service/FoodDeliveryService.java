package fooddelivery.service;

import fooddelivery.bean.Customer;
import fooddelivery.bean.Order;
import fooddelivery.repository.FoodDeliveryRepository;

import java.util.Set;

public class FoodDeliveryService {

    // Service layer needs to talk to the Repository to check and save data
    private final FoodDeliveryRepository repository;

    // To generate a unique Order ID automatically (Starting from 101)
    private int nextOrderId = 101;

    // Constructor to connect Service with Repository
    public FoodDeliveryService(FoodDeliveryRepository repository) {
        this.repository = repository;
    }

    // --- 1. Customer Registration Logic ---
    public boolean registerCustomer(Customer customer) {
        // Step 1: Check whether the customer ID already exists in the repository
        Customer existingCustomer = repository.findCustomerById(customer.getCustomerID());

        if (existingCustomer != null) {
            // Step 2: If it exists, reject the registration
            return false;
        }

        // Step 3: Otherwise, send the customer to the repository for storage
        repository.addCustomer(customer);
        return true;
    }

    // --- 2. Place Order Logic ---
    public Order placeOrder(int customerId, String foodName, double price, int quantity) {
        // Step 1: Check whether the customer exists
        Customer existingCustomer = repository.findCustomerById(customerId);
        if (existingCustomer == null) {
            return null; // Reject order if customer is not registered
        }

        // Step 2: Validate that quantity is greater than zero
        if (quantity <= 0) {
            return null; // Reject order if quantity is invalid
        }

        // Step 3: Calculate totalAmount using price * quantity
        double totalAmount = price * quantity;

        // Step 4: Create an Order object (using nextOrderId and then increasing it)
        Order newOrder = new Order(nextOrderId, customerId, foodName, quantity, price, totalAmount);
        nextOrderId++; // Increment for the next order

        // Step 5: Save the order through the repository
        repository.addOrder(newOrder);

        // Return the successfully created order
        return newOrder;
    }

    // --- 3. View Orders Logic ---
    public Set<Order> viewCustomerOrders(int customerId) {
        // Fetch orders from the repository
        return repository.getOrdersByCustomerId(customerId);
    }

    // --- 4. Cancel Order Logic (Bonus Challenge) ---
    public boolean cancelOrder(int orderId) {
        return repository.removeOrder(orderId);
    }
}