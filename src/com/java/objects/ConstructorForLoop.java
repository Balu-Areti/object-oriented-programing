package com.java.objects;

import java.util.Scanner;

public class ConstructorForLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 5; i++){
            System.out.println("Enter Customer " + i + " Id :");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Customer " + i + " Name: ");
            String name = sc.next();

            System.out.println("Enter Customer " + i + " Phone Number: ");
            String number = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter Customer " + i + " Email: ");
            String email = sc.nextLine();

            System.out.println("Enter Customer " + i + " Address: ");
            String address = sc.nextLine();


            //Creating Object
            Customer customer = new Customer(id,name,email,number,address);
            System.out.println("---------Customer " + i + "Deatils----------");
            System.out.println("Id : " + customer.id);
            System.out.println("name : " + customer.name);
            System.out.println("email : " + customer.email);
            System.out.println("number : " + customer.number);
            System.out.println("address : " + customer.address);
            System.out.println("------------------------------------------");
        }
    }
}
