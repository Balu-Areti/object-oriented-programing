package com.java.fundemtalsofoop;

public class Customer {

    //// step - 1 This is (State) without object it will not take any memory
    int customerId;
    String fulName;
    String email;
    long mobileNumber;
    String city;
    boolean isActive;

    //// 2. Parameterized Constructor (Mandatory details to create a Customer)
    public Customer(int customerId, String fulName, String email, long mobileNumber, String city, boolean isActive){
        this.customerId = customerId;
        this.fulName = fulName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.isActive = isActive;
    }

}
/*
> | Identity | customer ID, full name |
> | Contact | email, mobile number |
> | Address/location | city, pincode |
> | Account status | is account active, membership type |
 */