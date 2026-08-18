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
}
