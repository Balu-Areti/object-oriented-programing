package com.java.methods.workingwithmethods;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // 1. CUSTOMER INVOCATION
        // ==========================================
        Customer customer = new Customer();

        // Keyword: print -> void (Action)
        customer.printCustomerDetails();

        // Keyword: update -> boolean (Yes/No answer)
        boolean isAddressUpdated = customer.updateAddress("HYD");

        // Keyword: is -> boolean (Yes/No answer)
        boolean isActive = customer.isActiveAccount();

        // Keyword: deactivate -> void (Action)
        customer.deactivateAccount();


        // ==========================================
        // 2. ORDER INVOCATION
        // ==========================================
        Order order = new Order();

        // Keyword: calculate -> double (Number/Math)
        double totalAmount = order.calculateTotalAmount();

        // Keyword: update -> void (Action)
        order.updateOrderStatus();

        // Keyword: is -> boolean (Yes/No answer)
        boolean isOrderPaid = order.isPaid();

        // Keyword: cancel -> boolean (Yes/No answer)
        boolean isCancelled = order.cancelOrder();


        // ==========================================
        // 3. PAYMENT INVOCATION
        // ==========================================
        Payment payment = new Payment();

        // Keyword: initiate -> boolean (Yes/No answer)
        boolean isInitiated = payment.initiatePayment();

        // Keyword: validate -> boolean (Yes/No answer)
        // Passing the 'totalAmount' we got from the Order object!
        boolean isValid = payment.validAmount(totalAmount);

        // Keyword: process -> boolean (Yes/No answer)
        boolean isProcessed = payment.processPayment("UPI");

        // Keyword: get -> String (Text)
        String currentStatus = payment.getpaymentStatus();

    }
}