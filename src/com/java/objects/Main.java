package com.java.objects;

public class Main {
    static void main() {

        // STEP 1: REFERENCE CREATION
        // 'customer' is just a reference variable (like a remote control).
        // It is created in the STACK memory.
        // Right now, it is empty (null). No object exists in the Heap yet.
        Customer customer;

        //Create Object for no-arg constructor();
        // STEP 2: OBJECT CREATION
        // 'new Customer()' creates the actual physical object inside the HEAP memory.
        // The constructor is called, and the HEAP object is filled with data (Balu, 100, AP).
        // 'customer1' is STACK that is now connected to the object in the HEAP.
        Customer customer1 = new Customer();
        System.out.println(customer1.name);
        System.out.println(customer1.address);
        System.out.println(customer1.id);


        //Creating Object for Argument-Constructor();
        Customer customer2 = new Customer(111,"Balu","987678978","balu1@gmail.com", "AP");
        System.out.println("=====Arg-Constructor=====");
        System.out.println(customer2); // com.java.objects.Customer@8efb846
        System.out.println(customer2.name);
        System.out.println(customer2.id);
        System.out.println(customer2.number);
        System.out.println(customer2.email);

       // Constructor Overloading created 3 Constructors and object in one class
        Customer customer3 = new Customer(222, "Balu");
        System.out.println(customer3.id +" "+ customer3.name);
    }
}
