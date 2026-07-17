package com.java.fundemtalsofoop.methodsdesignecommerce;

public class Payment {
    // 1️⃣1️⃣ Initiate Payment
    //boolean initiatePayment(int orderId, double amount) { }
// Invocation: boolean started = initiatePayment(5001, 2450.50);
// Justification: Needs order details as parameters to know what is being paid. Returns boolean to confirm if initialization was successful.

    // 1️⃣2️⃣ Validate Payment Amount
    //boolean validatePaymentAmount(double orderAmount, double paymentAmount) { }
// Invocation: boolean isMatching = validatePaymentAmount(2450.50, 2450.50);
// Justification: Needs both amounts to compare them. Returns boolean (true if they match, false if they don't).

    // 1️⃣3️⃣ Process Payment
    //boolean processPayment(String paymentMode) { }
// Invocation: boolean success = processPayment("UPI");
// Justification: Needs the mode (UPI, CARD) as input. Must return boolean so the checkout system knows if the transaction succeeded or declined.

    // 1️⃣4️⃣ Refund Payment
    //boolean refundPayment(int orderId) { }
// Invocation: boolean refunded = refundPayment(5001);
// Justification: Needs the orderId to find the transaction. Returns boolean to confirm the refund was processed.

    // 1️⃣5️⃣ Check Payment Status
    //String checkPaymentStatus() { }
// Invocation: String status = checkPaymentStatus();
// Justification: No input needed. Returns a String (e.g., "PENDING", "SUCCESS", "FAILED") rather than boolean, as payment has more than two states.
}

