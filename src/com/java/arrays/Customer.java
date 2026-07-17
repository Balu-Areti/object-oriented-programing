package com.java.arrays;

public class Customer {
    //// 1. STATE (Instance Variables)
    //// These variables define the properties of every Customer object.
    int id;
    String name;
    String email;
    String phoneNumber;
    byte age;
    char gender;

    // 2. CONSTRUCTOR
    // Used to initialize the state (variables) when a new Customer object is created.
    Customer(int id, String name, String email, String phoneNumber, byte age, char gender){
        // 'this' keyword refers to the current instance variable of the class.
        // It resolves the conflict between class variables and constructor parameters.
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;

    }
    // 3. BEHAVIOR (Instance Method)
    // A method to print the specific state of the object calling it.
    void displayCustomerDeatils(){
        System.out.println("----Customer Details -----------");
        System.out.println("Id : " + id);
        System.out.println("Name :" + name);
        System.out.println("email : " + email);
        System.out.println("Phone NUmber : "+ phoneNumber);
        System.out.println("age : " + age);
        System.out.println("Gender : "+ gender);
    }
}
