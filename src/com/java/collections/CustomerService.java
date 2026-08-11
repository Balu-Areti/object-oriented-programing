package com.java.collections;

import com.java.model.Customer;

public class CustomerService {
    public void displayCustomer(Customer customer){
        System.out.println("Id : " + customer.getId());
        System.out.println("Name : " + customer.getName());
        System.out.println("Phoen Number : " + customer.getPhoneNumber());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Is Active :  " + customer.isActive());
    }
}
