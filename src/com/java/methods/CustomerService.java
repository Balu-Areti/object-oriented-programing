package com.java.methods;

public class CustomerService {

   void displayCustomerProfile(Customer customer){
       //two ways
//       System.out.println(customer);
       System.out.println("ID: "+ customer.id);
       System.out.println("Name: " + customer.name);
       System.out.println("Phone Number : "+ customer.phone);
       System.out.println("email"+ customer.email);
       System.out.println("Address" + customer.address);
       System.out.println("Gender" + customer.gender);
       System.out.println("Birth Year : " + customer.birthYear);
       System.out.println("Income : "+ customer.income);
       System.out.println("Expenses : "+ customer.expenses);

       System.out.println("------Static method called here using Class Name only ------");
       System.out.println("Company Name is " + Customer.COMPANY_NAME);
       System.out.println("Company Address " + Customer.COMPANY_ADDRESS);
       System.out.println("COMPANY Email: " + Customer.COMPANY_EMAIL);
       System.out.println("COMPANY PHONE NUMBER : "+ Customer.COMPANY_PHONE_NUMBER);
    }
   double calculateSavings(Customer customer){
       return customer.income-customer.expenses;
   }
}
