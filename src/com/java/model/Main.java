package com.java.model;

public class Main {
    static void main() {
        Customer customer = new Customer();
        customer.setId(101)
                 .setName("Customer1")
                .setEmail("customer@gmail.com")
                .setPhoneNumber("932456789")
                .setActive(true)
                .setPassword("customer@123");

        System.out.println("Customer Deatils : ");
        System.out.println("Id : "+ customer.getId());
        System.out.println("Name : " + customer.getName());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Phone number : " + customer.getPhoneNumber());
        System.out.println("Customer Active : "+ customer.isActive());

        Customer customer1 = new Customer();
        customer1.setId(102).setName("Customer1").setEmail("cusomer1@gmail.com").setPhoneNumber("919293949").setActive(true).setPassword("Customer@1234");

    }
}
