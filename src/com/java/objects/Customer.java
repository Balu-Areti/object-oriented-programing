package com.java.objects;

public class Customer {
    // INSTANCE VARIABLES:
    // These variables live inside the actual Object in the HEAP memory.
    int id; // Instance varaible
    String name;
    String email;
    String number;
    String address;

    //1.Default Constructor like values in heap default

    // 2.NO-ARG CONSTRUCTOR:
    // This is called automatically the moment you use the 'new' keyword.
    Customer(){  //No-arg
        System.out.println("-------------This is no-arg constructor---------- ");
        id = 100; // Setting initial values for the object in the HEAP memory.
        name = "Balu";
        email = "balu@gmail.com";
        number = "989789998";
        address = "AP";
    }

    //local variables
    public Customer(int id, String name, String number, String email, String address){
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    //arg
    Customer(int id, String name){
        System.out.println("we can use only ID and Name in arg not all instances ");
        this.id = id;
        this.name = name;
    }


}
