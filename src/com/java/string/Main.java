package com.java.string;

import com.java.model.Customer;

import java.util.Scanner;

public class Main {
    static void main() {
        //String Constructors
        String str = new String(); // No arg constructor    //Object created in (Heap) so default values but here empty becuase object is there
        System.out.println("str:" + str); //str:

        char[] chars = {'a','b','c','d'};
        String str1 = new String(chars); // converted to string using characters using API documentation methods class etc
        System.out.println("str1: " + str1);

        String str2 = new String("abc");
        System.out.println("str2 : " + str2); //abc String

        //Instance
        System.out.println(str1.charAt(1));//b

        //String Literals
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);// True because both point out same object in String pool
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();

        System.out.println("Password : ");
        String password = sc.next();

        System.out.println("Email: ");
        String email = sc.next();

        System.out.println("Phone Number : ");
        long phoneNumber = sc.nextLong();

        System.out.println(username.compareToIgnoreCase("BALU")); // 0 because true if not used(Ignorecase) it calculate ASCII

        //String Object are Immutable
        String str5 = "abc";
        //str5.concat("Hello");//abc
        str5 = str5.concat("Hello"); // abcHello // reference through save new object created in HEAP(abcHello)
        System.out.println(str5); //abc str5 obly point "abc thats why its Immutable

        System.out.println(str5.concat("Hello!"));//abcHello!  it created new object

        if (username.equals("BALU") && password.equals("Balu@1") && email.equals("balu1@gmail.com") && phoneNumber == 9192919291L){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Failed");
        }

        //Length()
        System.out.println(username.length());//4

        //split() method
        String customerData = "111, customerName, customer1@gmail.com";
        String[] data = customerData.split(",");
//        Customer customer = new Customer();
//        customer.id = Integer.parseInt(data[0]);
//        customer.name = data[1];
//        customer.email = data[2];
//        //System.out.println(customer.id + "" + customer.name + " " + customer.email);
//
//        CustomerService customerService = new CustomerService();
//        customerService.displayCustomerProfile(customer);


        //Trim() method
        //space in string remove chain method invocation str1.trim().length();

    }
}
