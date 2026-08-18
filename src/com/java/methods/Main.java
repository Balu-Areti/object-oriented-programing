package com.java.methods;

public class Main {
    static void main() {
        Customer customer = new Customer(1,"Balu","9871234561","balu1@gmail.com","AP", 'M', 1999, 100000, 10000);
        Customer customer1 = new Customer(2,"Madhu","9871234561","madhu1@gmail.com","HYD",'M', 1985, 200000, 100000);

        customer.displayProfileDetails();
        customer1.displayProfileDetails();

        customer.calculateSavings(); // we called but not using
        System.out.println(customer.name + " " + customer.calculateSavings()); // now we used
        System.out.println(customer1.name + " "+ customer1.calculateSavings());

    }
}
