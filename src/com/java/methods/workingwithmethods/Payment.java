package com.java.methods.workingwithmethods;

public class Payment {

    boolean initiatePayment(){
        System.out.println("Initiate Payment..... processing....");
        return true;
    }
    boolean validAmount(double orderAmount){
        System.out.println("Validate Payment Amount");
        return true;
    }
    boolean  processPayment(String mode){
        System.out.println("processes payment based on payment mode (UPI, CARD, NET BANKING)");
        return true;
    }
    boolean refundPayment(double amount){
        System.out.println("Refund Payment");
        return true;
    }
    String  getpaymentStatus(){
        System.out.println("  Payment Status ");
        return "";
    }

}

