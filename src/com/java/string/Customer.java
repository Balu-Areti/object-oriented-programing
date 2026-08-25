package com.java.string;

public class Customer {
    int id;
    String name;
    String email;
    long phone;
    String password;
    String address;
    char gender;
    int birthYear;
    double income;
    double expenses;

    final static String COMPANY_NAME = "St. School";
    final static String COMPANY_ADDRESS = "Hitech City";
    final static String COMPANY_EMAIL = "stschool@gmail.com";
    final static String COMPANY_PHONE = "+9198798279872";


    //shortcut commands

    public Customer() {
    }

    public Customer(int id, String name, String email, long phone, String password, String address, char gender, int birthYear, double income, double expenses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.birthYear = birthYear;
        this.income = income;
        this.expenses = expenses;
    }



}