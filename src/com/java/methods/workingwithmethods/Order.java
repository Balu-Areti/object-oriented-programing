package com.java.methods.workingwithmethods;

public class Order {

    double calculateTotalAmount(){
        System.out.println("Total Amount");
        return 1+2;
    }

    void updateOrderStatus(){
        System.out.println("order Status : Updated");
    }

    boolean isPaid(){
        System.out.println("Order Is Paid");
        return true;
    }

    boolean cancelOrder(){
        System.out.println("Order Cancelled");
        return true;
    }

    void printOrderSummary(){
        System.out.println(" Order Summary: ");
    }


}
