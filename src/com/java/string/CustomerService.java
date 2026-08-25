package com.java.string;


public class CustomerService {

    //customer business requirements
    // display customer profile
    //2 ways
    void displayCustomerProfile(Customer customer){
        System.out.println("----Customer Profile----");
        System.out.println("ID : " + customer.id);
        System.out.println("Name : " + customer.name);
        System.out.println("Email : " + customer.email);
        System.out.println("Phone : " + customer.phone);
        System.out.println("Password : " + customer.password);
        System.out.println("Address : " + customer.address);
        System.out.println("Income : " + customer.income);
        System.out.println("Expenses : " + customer.expenses);

    }

    boolean login(String email, String password){
        //logic
        return true;
    }

    double calculateSavings(Customer customer){
        return customer.income - customer.expenses;
    }
}