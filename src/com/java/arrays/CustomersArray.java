package com.java.arrays;

public class CustomersArray {
    static void main() {
        // 1. Create an array that can hold 5 Customer objects
        Customer[] customers = new Customer[5];

        // 2. Instantiate new Customer objects using the Constructor and store them in the array
        customers[0] = new Customer(1, "Customer1", "customer@gmail.com", "987987789", (byte) 20, 'M');
        customers[1] = new Customer(2, "customer2", "customer2@@gmail.com", "98798778", (byte) 30, 'F');
        customers[2] = new Customer(5, "customer5", "customer3@gmail.com", "2352523423", (byte) 30, 'M');
        customers[3] = new Customer(2, "customer2", "customer4@gmail.com", "8797897897", (byte) 60, 'F');
        customers[4] = new Customer(4, "customer4", "customer5@gmail.com", "9345345433", (byte) 70, 'F');

        // 3. Display all customers using a For-Each loop
        for (Customer customer : customers) {
            customer.displayCustomerDeatils(); // Calls the method from Customer class
        }
        // 4. FINDING THE HIGHEST AGE
        // Assume the first customer has the highest age initially
        Customer highestAgeCustomer = customers[0];

        for (Customer customer : customers) {
            if (customer.age > highestAgeCustomer.age) {
                highestAgeCustomer = customer; // Update if older customer found
            }
        }
        System.out.println("Customer with highest age:");
        highestAgeCustomer.displayCustomerDeatils();

        // 5. Calling a static helper method to count male customers
        System.out.println("Male Customer Count: " + getMaleCustomerCount(customers));
    }

    // --- HELPER METHODS ---

    // Returns the count of customers whose gender is 'M'
    public static int getMaleCustomerCount(Customer[] customers){
        int maleCount = 0;
        for(Customer customer : customers) {
            if(customer.gender == 'M') {
                maleCount++;
            }
        }
        return maleCount;
    }

    // Finds a customer by their unique ID
    public static Customer getCustomerById(Customer[] customers, int id){
        for(Customer customer : customers) {
            if(customer.id == id) {
                return customer; // Return the object as soon as the ID matches
            }
        }
        return null; // Return null if no customer matches the ID
    }

    /*
     * INCOMPLETE METHODS - TO BE IMPLEMENTED
     * Sir ee methods ni empty / logic rayali.
     */
    public static int getFemaleCustomerCount(Customer[] customers) { return 0; }
    public static Customer highestAgedCustomer(Customer[] customers) { return null; }
    public static Customer[] sortCustomersByName(Customer[] customers) { return null; }
    public static int customersWithAgeGreaterThan(Customer[] customers, int age) { return 0; }
    public static int customersWithAgeBetween(Customer[] customers, int minAge, int maxAge) { return 0; }

    public static Customer[] getCustomersBelowAge(Customer[] customers, int age){
        // Steps to implement:
        // 1. Count how many customers are below the given age.
        // 2. Create a new array of that specific size.
        // 3. Iterate again and add those customers to the new array.
        return null;
    }
}
