package fooddelivery.controller;

import fooddelivery.bean.Customer;
import fooddelivery.bean.Order;
import fooddelivery.service.FoodDeliveryService;

import java.util.Set;

public class FoodDeliveryController {

    // Controller talks ONLY to the Service layer
    private final FoodDeliveryService service;

    public FoodDeliveryController(FoodDeliveryService service) {
        this.service = service;
    }

    // --- 1. Register Customer ---
    public void registerCustomer(int id, String name, String phone, String address) {
        Customer newCustomer = new Customer(id, name, phone, address);
        boolean isRegistered = service.registerCustomer(newCustomer);

        if (isRegistered) {
            System.out.println("Customer registered successfully!");
        } else {
            System.out.println("Customer ID already exists!");
        }
    }

    // --- 2. Place Order ---
    public void placeOrder(int customerId, String foodName, double price, int quantity) {
        Order order = service.placeOrder(customerId, foodName, price, quantity);

        if (order != null) {
            System.out.println("Order placed successfully!");
            System.out.println("Order ID : " + order.getOrderId());
            System.out.println("Customer ID: " + order.getCustomerId());
            System.out.println("Food : " + order.getFoodName());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Price : " + order.getPrice());
            System.out.println("Total Amount: " + order.getTotalAmount());
        } else {
            System.out.println("Order failed! Please check if Customer ID exists and Quantity is valid.");
        }
    }

    // --- 3. View Customer Orders ---
    public void viewCustomerOrders(int customerId) {
        Set<Order> orders = service.viewCustomerOrders(customerId);

        if (orders.isEmpty()) {
            System.out.println("No orders found for this customer.");
        } else {
            System.out.println("--- Orders for Customer ID " + customerId + " ---");
            for (Order order : orders) {
                System.out.println(order.toString());
            }
        }
    }

    // --- 4. Cancel Order (Bonus Challenge) ---
    public void cancelOrder(int orderId) {
        boolean isCancelled = service.cancelOrder(orderId);

        if (isCancelled) {
            System.out.println("Order cancelled successfully!");
        } else {
            System.out.println("Order not found!");
        }
    }
}