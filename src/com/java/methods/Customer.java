package com.java.methods;

public class Customer {
    int id;
    String name;
    String phone;
    String email;
    String address;
    char gender;
    int birthYear;
    double income;
    double expenses;

    //Static data owned by class (Call by Class name to access)
    final static String COMPANY_NAME = "Google";
    final static String COMPANY_ADDRESS = "Hyderabad";
    final static String COMPANY_EMAIL= "google1@gmail.com";
    final static String COMPANY_PHONE_NUMBER = "987667891";

    public Customer(int id, String name, String phone, String email, String address, char gender, int birthYear, double income, double expenses) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.birthYear = birthYear;
        this.income = income;
        this.expenses = expenses;
    }

    //Method (Behaviour)
    //Instance Method because we are in same class
    void displayProfileDetails(){
        System.out.println("ID: "+ id);
        System.out.println("Name: " + name);
        System.out.println("Phone Number : "+ phone);
        System.out.println("email"+ email);
        System.out.println("Address" + address);
        System.out.println("Gender" + gender);
        System.out.println("Birth Year : " + birthYear);
        System.out.println("Income : "+ income);
        System.out.println("Expenses : "+ expenses);


    }

    //calculate Savings
    double calculateSavings(){
        System.out.println("---------Savings--------");
        return income-expenses;
    }

    static void displayCompanyDetails(){
        System.out.println("------Static method called here using Class Name only ------");
        System.out.println("Company Name is " + COMPANY_NAME);
        System.out.println("Company Address " + COMPANY_ADDRESS);
        System.out.println("COMPANY Email: " + COMPANY_EMAIL);
        System.out.println("COMPANY PHONE NUMBER : "+ COMPANY_PHONE_NUMBER);
    }
}
