package com.java.fundemtalsofoop.methodsdesignecommerce;

public class OverloadingDemo {
    // --- CONSTRUCTOR OVERLOADING ---
    // Rule: Same class name, different parameters

    // 1. Zero arguments
    public OverloadingDemo() {
        System.out.println("Empty constructor called");
    }

    // 2. One argument
    public OverloadingDemo(int id) {
        System.out.println("Constructor with ID called");
    }

    // 3. Two arguments
    public OverloadingDemo(int id, String name) {
        System.out.println("Constructor with ID & Name called");
    }

  //--------------------------------------------------------------
    // --- METHOD OVERLOADING ---
    // Rule: Same method name, different parameters

    // 1. Zero arguments
    public void searchProduct() {
        System.out.println("Showing all default products");
    }

    // 2. String argument
    public void searchProduct(String productName) {
        System.out.println("Searching by name: " + productName);
    }

    // 3. String & int arguments
    public void searchProduct(String category, int maxPrice) {
        System.out.println("Searching " + category + " under ₹" + maxPrice);
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo(); // Calls 1st constructor
        obj.searchProduct("Laptop"); // Calls 2nd method
    }
}