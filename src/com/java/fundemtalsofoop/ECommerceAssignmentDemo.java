package com.java.fundemtalsofoop;

import com.java.fundemtalsofoop.Customer;
import com.java.fundemtalsofoop.Order;

public class ECommerceAssignmentDemo {

    public static void main(String[] args) {

        // --- Creating 3 Realistic Customer Objects ---
        Customer c1 = new Customer(101, "Balu Areti", "balu.areti@gmail.com", 9876543210L, "Kotta Bommuru", true);
        Customer c2 = new Customer(102, "Vikram Sharma", "vikram.sharma@yahoo.com", 9123456789L, "Hyderabad", true);
        Customer c3 = new Customer(103, "Priya Reddy", "priya.r@outlook.com", 9988776655L, "Bengaluru", false);

        // --- Creating 3 Realistic Order Objects ---
        // Notice how we use the customerId (101, 102) to link the order to the customer!
        Order o1 = new Order(5001, 101, 2450.50, "2026-07-09", "Processing", true);
        Order o2 = new Order(5002, 101, 899.00, "2026-07-08", "Shipped", true); // Balu has a second order
        Order o3 = new Order(5003, 102, 15000.00, "2026-07-05", "Delivered", false);

        System.out.println("Objects created successfully with realistic state!");
        System.out.println("Customer 1 Name is: " + c1.fulName);
        System.out.println("Order 1 Amount is: ₹" + o1.orderAmount);
    }
}