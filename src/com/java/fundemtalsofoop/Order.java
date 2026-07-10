package com.java.fundemtalsofoop;

public class Order {
        // 1. State (Properties)
        int orderId;          // Order identification
        int customerId;       // Customer reference (Linking to the Customer class)
        double orderAmount;   // Order amount (Decimals undachu kabatti double)
        String orderDate;     // Order date (String for now, as instructed)
        String orderStatus;   // Status (e.g., "Shipped", "Delivered")
        boolean isPaid;       // Payment status (Reads like a question)

        // 2. Parameterized Constructor
        Order(int orderId, int customerId, double orderAmount, String orderDate, String orderStatus, boolean isPaid) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.orderAmount = orderAmount;
            this.orderDate = orderDate;
            this.orderStatus = orderStatus;
            this.isPaid = isPaid;
        }
    }
