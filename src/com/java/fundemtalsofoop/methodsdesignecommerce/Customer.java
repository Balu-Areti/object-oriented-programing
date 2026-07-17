package com.java.fundemtalsofoop.methodsdesignecommerce;

public class Customer {
    // 6️⃣ Calculate Total Order Amount
    //double calculateTotalAmount() { }
// Invocation: double totalPayable = calculateTotalAmount();
// Justification: Uses existing order items to calculate, so no input needed. Returns double because money involves decimals.

    // 7️⃣ Update Order Status
    void updateOrderStatus(String newStatus) { }
// Invocation: updateOrderStatus("SHIPPED");
// Justification: Needs the new status string as input. Void because it just mutates the state silently.

    // 8️⃣ Check If Order Is Paid
    //boolean isOrderPaid() { }
// Invocation: boolean paidStatus = isOrderPaid();
// Justification: No parameters needed. Returns a boolean because payment status is a binary yes/no state.

    // 9️⃣ Cancel an Order
    //boolean cancelOrder() { }
// Invocation: boolean isCancelled = cancelOrder();
// Justification: Returns boolean because it has a condition ("only if not delivered"). The caller needs to know if the cancellation actually happened or was rejected.

    // 🔟 Display Order Summary
    void displayOrderSummary() { }
// Invocation: displayOrderSummary();
// Justification: Output-only method for the console. Needs no inputs and returns nothing (void).

}
